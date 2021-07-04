package com.example.android.navigation.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.android.navigation.MainActivity
import com.example.android.navigation.R
import com.example.android.navigation.screens.GameOverScreen
import com.example.android.navigation.screens.GameOverScreen.gameOverImage
import com.example.android.navigation.screens.GameOverScreen.openGameOverScreen
import com.example.android.navigation.screens.GameOverScreen.tryAgainButton
import com.example.android.navigation.screens.QuestionScreen
import com.example.android.navigation.screens.QuestionScreen.questionImage
import com.example.android.navigation.screens.QuestionScreen.questionText
import org.junit.Rule
import org.junit.Test

class GameOverScreenTests : TestCaseBase() {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun checkImageDisplayed() {
        GameOverScreen{
            openGameOverScreen()

            gameOverImage.isDisplayed()
        }
    }

    @Test
    fun checkTryAgainButtonDisplayed() {
        GameOverScreen {
            openGameOverScreen()

            tryAgainButton {
                isDisplayed()
                isClickable()
                hasText(R.string.try_again)
            }
        }
    }

    @Test
    fun checkTryAgainLeadsToQuestionScreen() {
        GameOverScreen {
            openGameOverScreen()

            tryAgainButton {
                click()
            }
        }
        QuestionScreen {
            questionImage.isDisplayed()
            questionText{
                isDisplayed()
                hasAnyText()
            }
        }
    }
}