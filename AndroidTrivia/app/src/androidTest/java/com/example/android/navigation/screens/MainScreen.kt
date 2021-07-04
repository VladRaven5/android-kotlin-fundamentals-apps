package com.example.android.navigation.screens

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.android.navigation.R

object MainScreen : ToolbarAwareScreenBase() {

    val mainImage = KImageView{ withId(R.id.titleImage) }

    val playButton = KButton { withId(R.id.playButton) }

    val menuButton = KButton {
        withParent {
            withParent {
                withId(R.id.action_bar)
            }
        }
    }

    val menuButtonAbout = KTextView {
        withId(R.id.title);
        withText("About")
    }

    fun startGame() {
        playButton.click()
    }
}