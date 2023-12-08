package com.adhit.submissionjetpackcompose.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adhit.submissionjetpackcompose.data.CoinRepository
import com.adhit.submissionjetpackcompose.model.Coin
import com.adhit.submissionjetpackcompose.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class FavoriteViewModel(
    private val repository: CoinRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<Coin>>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Coin>>>
        get() = _uiState

    fun getFavoritePlayer() = viewModelScope.launch {
        repository.getFavoriteCoin()
            .catch {
                _uiState.value = UiState.Error(it.message.toString())
            }
            .collect {
                _uiState.value = UiState.Success(it)
            }
    }

    fun updatePlayer(id: Int, newState: Boolean) {
        repository.updateCoin(id, newState)
        getFavoritePlayer()
    }
}