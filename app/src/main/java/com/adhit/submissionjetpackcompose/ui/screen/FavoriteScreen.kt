package com.adhit.submissionjetpackcompose.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.adhit.submissionjetpackcompose.R
import com.adhit.submissionjetpackcompose.di.Injection
import com.adhit.submissionjetpackcompose.model.Coin
import com.adhit.submissionjetpackcompose.ui.common.UiState
import com.adhit.submissionjetpackcompose.ui.item.EmptyList
import com.adhit.submissionjetpackcompose.ui.viewmodel.FavoriteViewModel
import com.adhit.submissionjetpackcompose.ui.viewmodel.ViewModelFactory

@Composable
fun FavoriteScreen(
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: FavoriteViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    )
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getFavoritePlayer()
            }
            is UiState.Success -> {
                FavoriteInformation(
                    listCoin = uiState.data,
                    navigateToDetail = navigateToDetail,
                    onFavoriteIconClicked = { id, newState ->
                        viewModel.updatePlayer(id, newState)
                    }
                )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun FavoriteInformation(
    listCoin: List<Coin>,
    navigateToDetail: (Int) -> Unit,
    onFavoriteIconClicked: (id: Int, newState: Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        if (listCoin.isNotEmpty()) {
            ListCoin(
                listCoin = listCoin,
                onFavoriteIconClicked = onFavoriteIconClicked,
                contentPaddingTop = 16.dp,
                navigateToDetail = navigateToDetail
            )
        } else {
            EmptyList(
                warning = stringResource(R.string.empty_favorite)
            )
        }
    }
}