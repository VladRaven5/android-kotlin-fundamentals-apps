package com.example.android.navigation.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.android.navigation.MainActivity
import com.example.android.navigation.R
import com.example.android.navigation.screens.AboutScreen
import com.example.android.navigation.screens.AboutScreen.aboutImage
import com.example.android.navigation.screens.AboutScreen.aboutText
import com.example.android.navigation.screens.AboutScreen.openAbout
import org.junit.Rule
import org.junit.Test

internal class AboutScreenTests : TestCaseBase() {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

//    @Test
//    fun checkTitleCorrect() {
//        AboutScreen {
//            openAbout()
//            title {
//                isDisplayed()
//                hasText("fragment_about")
//            }
//        }
//    }

    @Test
    fun checkImageDisplayed() {
        AboutScreen {
            openAbout()
            aboutImage.isDisplayed()
        }
    }

    @Test
    fun checkTextDisplayed() {
        AboutScreen {
            openAbout()
            aboutText {
                isDisplayed()
                hasText(R.string.about_text)
            }
        }
    }
}