package com.adhit.submissionjetpackcompose.model

data class Coin(
    val id: Int,
    val name: String,
    val founder: String,
    val dateRelease: String,
    val ath: String,
    val image: Int,
    val description: String,
    var isFavorite: Boolean = false,
    val active: String,
    val codeName: String,
)
