package com.example.android.navigation.screens

import android.view.View
import com.agoda.kakao.image.KImageView
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.text.KTextView
import com.example.android.navigation.R
import org.hamcrest.Matcher

object NavigationDrawerScreen : ToolbarAwareScreenBase() {

    val navigationDrawerImage = KImageView { withId(R.id.navHeaderImage) }

    val navigationTargetsList = KRecyclerView (builder = {
        withId(R.id.design_navigation_view)
    }, itemTypeBuilder = {
        itemType(::NavigationMenuItem)
    })

    fun openNavigationDrawer() {
        hamburgerMenu.click()
    }

    class NavigationMenuItem(parent: Matcher<View>) : KRecyclerItem<NavigationMenuItem>(parent) {
        val itemTitle = KTextView(parent) { withId(R.id.design_menu_item_text)}
    }
}