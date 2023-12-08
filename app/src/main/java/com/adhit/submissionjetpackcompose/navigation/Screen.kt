package com.adhit.submissionjetpackcompose.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Favorite : Screen("favorite")
    object Profile : Screen("profile")
    object DetailCoin : Screen("home/{coinId}") {
        fun createRoute(coinId: Int) = "home/$coinId"
    }
}