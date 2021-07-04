package com.example.android.navigation.screens

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KTextView
import com.example.android.navigation.R

object AboutScreen : ToolbarAwareScreenBase() {

    val aboutImage = KImageView { withId(R.id.aboutImage) }

    val aboutText = KTextView { withId(R.id.rulesText) }

    fun openAbout() {
        super.openScreen(R.id.aboutFragment)
    }
}