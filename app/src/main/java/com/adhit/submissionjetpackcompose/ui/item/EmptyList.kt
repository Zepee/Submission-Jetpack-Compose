package com.adhit.submissionjetpackcompose.ui.item

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EmptyList(
    warning: String,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = warning,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EmptyListPreview() {
    EmptyList(warning = "No items to display")
}