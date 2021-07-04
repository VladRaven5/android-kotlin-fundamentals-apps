package com.example.android.navigation.screens

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KButton
import com.example.android.navigation.R
import com.example.android.navigation.screens.MainScreen.startGame
import com.example.android.navigation.screens.QuestionScreen.chooseCorrectAnswer
import com.example.android.navigation.screens.QuestionScreen.submitAnswerButton

object GameWonScreen : ToolbarAwareScreenBase() {

    val wonImage = KImageView { withId(R.id.youWinImage) }
    val nextMatchButton = KButton { withId(R.id.nextMatchButton) }
    val shareButton = KButton { withId(R.id.share) }

    fun openGameWonScreen() {
        MainScreen {
            startGame()
        }
        QuestionScreen{
            for(questionNumber in 1..3) {
                chooseCorrectAnswer(questionNumber)
                submitAnswerButton.click()
            }
        }
    }



}