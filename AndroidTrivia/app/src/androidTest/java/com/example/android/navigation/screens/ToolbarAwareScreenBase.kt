package com.example.android.navigation.screens

import com.agoda.kakao.navigation.KNavigationView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.android.navigation.R
import org.hamcrest.Matchers.endsWith

abstract class ToolbarAwareScreenBase : Screen<ToolbarAwareScreenBase>() {

    val hamburgerMenu = KButton {
        withParent { withId(R.id.action_bar) }
        withClassName(endsWith("ImageButton"))
    }

    val title = KTextView {
        withParent {
            withId(R.id.action_bar)
        }
        withClassName(endsWith("TextView"))
    }

    val sideDrawer = KNavigationView { withId(R.id.navView) }

    protected fun openScreen(screenId : Int) {
        hamburgerMenu.click()
        sideDrawer.isDisplayed()
        sideDrawer.navigateTo(screenId)
    }
}