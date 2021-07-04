package com.example.android.navigation.screens

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KTextView
import com.example.android.navigation.R

object RulesScreen : ToolbarAwareScreenBase() {

    val rulesImage = KImageView { withId(R.id.rulesImage) }

    val rulesText = KTextView { withId(R.id.rulesText) }

    fun openRules() {
        super.openScreen(R.id.rulesFragment)
    }
}