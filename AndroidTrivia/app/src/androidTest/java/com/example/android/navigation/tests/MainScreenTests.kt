package com.example.android.navigation.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.android.navigation.MainActivity
import com.example.android.navigation.screens.AboutScreen
import com.example.android.navigation.screens.AboutScreen.aboutImage
import com.example.android.navigation.screens.AboutScreen.aboutText
import com.example.android.navigation.screens.MainScreen
import com.example.android.navigation.screens.MainScreen.mainImage
import com.example.android.navigation.screens.MainScreen.menuButton
import com.example.android.navigation.screens.MainScreen.menuButtonAbout
import com.example.android.navigation.screens.MainScreen.playButton
import org.junit.Rule
import org.junit.Test

class MainScreenTests : TestCaseBase() {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

//    @Test
//    fun checkTitleCorrect() {
//        MainScreen {
//            title {
//                isDisplayed()
//                hasText("fragment_title")
//            }
//        }
//    }

    @Test
    fun checkImageDisplayed() {
        MainScreen{
            mainImage{
                isDisplayed()
            }
        }
    }

    @Test
    fun checkPlayButtonDisplayed() {
        MainScreen {
            playButton{
                isDisplayed()
                hasText("Play")
                isClickable()
            }
        }
    }

    @Test
    fun checkMenuDisplayed() {
        MainScreen {
            menuButton {
                isDisplayed()
                isClickable()
                click()
            }
            menuButtonAbout {
                isDisplayed()
            }
        }
    }

    @Test
    fun checkNavigateToAboutFromMenu() {
        MainScreen {
            menuButton.click()
            menuButtonAbout.click()
        }

        AboutScreen {
            title.hasText("fragment_about")
            aboutImage.isDisplayed()
            aboutText {
                isDisplayed()
                hasAnyText()
            }
        }
    }
}