package com.example.android.navigation.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.android.navigation.MainActivity
import com.example.android.navigation.screens.GameWonScreen
import com.example.android.navigation.screens.GameWonScreen.nextMatchButton
import com.example.android.navigation.screens.GameWonScreen.openGameWonScreen
import com.example.android.navigation.screens.GameWonScreen.shareButton
import com.example.android.navigation.screens.GameWonScreen.wonImage
import com.example.android.navigation.screens.QuestionScreen
import com.example.android.navigation.screens.QuestionScreen.questionImage
import com.example.android.navigation.screens.QuestionScreen.questionText
import org.junit.Rule
import org.junit.Test

class GameWonScreenTests : TestCaseBase() {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun checkImageDisplayed() {
        GameWonScreen {
            openGameWonScreen()

            wonImage{
                isDisplayed()
            }
        }
    }

    @Test
    fun checkNextMatchButtonDisplayed() {
        GameWonScreen {
            openGameWonScreen()

            nextMatchButton{
                isDisplayed()
                isClickable()
                hasText("Next Match")
            }
        }
    }

    @Test
    fun checkNextMatchButtonLeadsToQuestion() {
        GameWonScreen {
            openGameWonScreen()

            nextMatchButton{
                click()
            }
        }

        QuestionScreen {
            questionImage {
                isDisplayed()
            }
            questionText {
                isDisplayed()
                hasText("What do you use to push structured data into a layout?")
            }
        }
    }

    @Test
    fun checkShareButtonDisplayed() {
        GameWonScreen {
            openGameWonScreen()

            shareButton{
                isDisplayed()
                isClickable()
            }
        }
    }
}