package com.adhit.submissionjetpackcompose.ui.screen

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeUp
import com.adhit.submissionjetpackcompose.R
import com.adhit.submissionjetpackcompose.model.Coin
import com.adhit.submissionjetpackcompose.ui.theme.SubmissionJetpackComposeTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class DetailScreenTesting {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private val fakeDataCoin = Coin(
        id = 2,
        name = "Binance Coin",
        codeName = "BNB",
        founder = "Changpeng Zhao, and Yi He",
        image = R.drawable.bnb,
        description = "BNB is the cryptocurrency that powers the Binance ecosystem. BNB can be used for discounts across the Binance ecosystem as well as staking, governance, and settling transactions on BNB Chain. The token can also be used for payments and DeFi services. BNB is regularly burned and removed from the token supply through quarterly burning events with BNB Auto-Burn. When BNB is used as gas for transactions on the BNB chain a portion of the BNB used as gas is burned.",
        dateRelease = "July 2017",
        ath = "$686.31",
        active = "Active",
        isFavorite = false
    )

    @Before
    fun setUp() {
        composeTestRule.setContent {
            SubmissionJetpackComposeTheme {
                DetailInformation(
                    id = fakeDataCoin.id,
                    name = fakeDataCoin.name,
                    founder = fakeDataCoin.founder,
                    image = fakeDataCoin.image,
                    description = fakeDataCoin.description,
                    dateRelease = fakeDataCoin.dateRelease,
                    active = fakeDataCoin.active,
                    ath = fakeDataCoin.ath,
                    isFavorite = fakeDataCoin.isFavorite,
                    navigateBack = {},
                    onFavoriteButtonClicked = {_, _ ->}
                )
            }
        }
    }

    @Test
    fun detailInformation_isDisplayed() {
        composeTestRule.onNodeWithTag("scrollToBottom").performTouchInput {
            swipeUp()
        }
        composeTestRule.onNodeWithText(fakeDataCoin.name).assertIsDisplayed()
        composeTestRule.onNodeWithText(fakeDataCoin.founder).assertIsDisplayed()
        composeTestRule.onNodeWithText(fakeDataCoin.dateRelease).assertIsDisplayed()
        composeTestRule.onNodeWithText(fakeDataCoin.description).assertIsDisplayed()
    }

    @Test
    fun addToFavoriteButton_hasClickAction() {
        composeTestRule.onNodeWithTag("favorite_detail_button").assertHasClickAction()
    }

    @Test
    fun detailInformation_isScrollable() {
        composeTestRule.onNodeWithTag("scrollToBottom").performTouchInput {
            swipeUp()
        }
    }

    @Test
    fun favoriteButton_hasCorrectStatus() {
        // Assert that the favorite button is displayed
        composeTestRule.onNodeWithTag("favorite_detail_button").assertIsDisplayed()

        // Assert that the content description of the favorite button is correct based on the isFavorite state
        val isFavorite = fakeDataCoin.isFavorite // Set the isFavorite state here
        val expectedContentDescription = if (isFavorite) {
            "Remove from Favorite"
        } else {
            "Add to Favorite"
        }

        composeTestRule.onNodeWithTag("favorite_detail_button")
            .assertContentDescriptionEquals(expectedContentDescription)
    }
}