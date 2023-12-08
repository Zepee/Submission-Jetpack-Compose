package com.adhit.submissionjetpackcompose.ui.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adhit.submissionjetpackcompose.data.CoinRepository
import com.adhit.submissionjetpackcompose.model.Coin
import com.adhit.submissionjetpackcompose.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: CoinRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<Coin>>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Coin>>>
        get() = _uiState

    private val _query = mutableStateOf("")
    val query: State<String> get() = _query

    fun search(newQuery: String) = viewModelScope.launch {
        _query.value = newQuery
        repository.searchCoin(_query.value)
            .catch {
                _uiState.value = UiState.Error(it.message.toString())
            }
            .collect {
                _uiState.value = UiState.Success(it)
            }
    }

    fun updatePlayer(id: Int, newState: Boolean) = viewModelScope.launch {
        repository.updateCoin(id, newState)
            .collect { isUpdated ->
                if (isUpdated) search(_query.value)
            }
    }
}