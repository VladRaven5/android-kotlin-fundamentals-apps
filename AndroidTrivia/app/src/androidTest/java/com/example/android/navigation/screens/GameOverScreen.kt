package com.example.android.navigation.screens

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KButton
import com.example.android.navigation.R
import com.example.android.navigation.screens.MainScreen.startGame
import com.example.android.navigation.screens.QuestionScreen.chooseWrongAnswer
import com.example.android.navigation.screens.QuestionScreen.submitAnswerButton

object GameOverScreen : ToolbarAwareScreenBase() {

    val gameOverImage = KImageView { withId(R.id.tryAgainImage) }
    val tryAgainButton = KButton { withId(R.id.tryAgainButton) }

    fun openGameOverScreen() {
        MainScreen{
            startGame()
        }
        QuestionScreen {
            chooseWrongAnswer(1)
            submitAnswerButton.click()
        }
    }

}