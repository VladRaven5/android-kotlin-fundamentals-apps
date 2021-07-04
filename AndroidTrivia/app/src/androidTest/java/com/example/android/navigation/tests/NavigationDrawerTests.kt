package com.example.android.navigation.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.android.navigation.MainActivity
import com.example.android.navigation.R
import com.example.android.navigation.screens.NavigationDrawerScreen
import com.example.android.navigation.screens.NavigationDrawerScreen.navigationDrawerImage
import com.example.android.navigation.screens.NavigationDrawerScreen.navigationTargetsList
import com.example.android.navigation.screens.NavigationDrawerScreen.openNavigationDrawer
import org.junit.Rule
import org.junit.Test

class NavigationDrawerTests : TestCaseBase() {

//    @get:Rule
//    val activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)
//
//    @Test
//    fun checkHeaderImageDisplayed() {
//        NavigationDrawerScreen {
//            openNavigationDrawer()
//            navigationDrawerImage{
//                isDisplayed()
//            }
//        }
//    }
//
//    @Test
//    fun checkAllTargetScreensDisplayed() {
//        NavigationDrawerScreen{
//            openNavigationDrawer()
//            navigationTargetsList{
//                hasSize(3)
//
//                //item with index 0 is header image
//
//                childAt<NavigationDrawerScreen.NavigationMenuItem>(1) {
//                    itemTitle.hasText(R.string.rules)
//                }
//
//                childAt<NavigationDrawerScreen.NavigationMenuItem>(2) {
//                    itemTitle.hasText(R.string.about)
//                }
//            }
//        }
//    }
}