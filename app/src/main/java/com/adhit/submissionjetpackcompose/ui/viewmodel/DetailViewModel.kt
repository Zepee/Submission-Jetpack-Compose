package com.adhit.submissionjetpackcompose.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adhit.submissionjetpackcompose.data.CoinRepository
import com.adhit.submissionjetpackcompose.model.Coin
import com.adhit.submissionjetpackcompose.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repository: CoinRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<Coin>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<Coin>>
        get() = _uiState

    fun getPlayerById(id: Int) = viewModelScope.launch {
        _uiState.value = UiState.Loading
        _uiState.value = UiState.Success(repository.getCoinById(id))
    }


    fun updatePlayer(id: Int, newState: Boolean) = viewModelScope.launch {
        repository.updateCoin(id, !newState)
            .collect { isUpdated ->
                if (isUpdated) getPlayerById(id)
            }
    }

}