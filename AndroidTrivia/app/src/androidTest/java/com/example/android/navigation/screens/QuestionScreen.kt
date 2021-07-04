package com.example.android.navigation.screens

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.android.navigation.R

object QuestionScreen : ToolbarAwareScreenBase() {

    val questionImage = KImageView { withId(R.id.questionImage) }

    val questionText = KTextView { withId(R.id.questionText) }

    val submitAnswerButton = KButton { withId(R.id.submitButton) }

    val firstAnswerRadioButton = KButton { withId(R.id.firstAnswerRadioButton) }
    val secondAnswerRadioButton = KButton { withId(R.id.secondAnswerRadioButton) }
    val thirdAnswerRadioButton = KButton { withId(R.id.thirdAnswerRadioButton) }
    val fourthAnswerRadioButton = KButton { withId(R.id.fourthAnswerRadioButton) }
    val answerButtons = listOf<KButton>(firstAnswerRadioButton, secondAnswerRadioButton, thirdAnswerRadioButton, fourthAnswerRadioButton)



    fun chooseCorrectAnswer(numberOfQuestion: Int) {
        //with configured random all correct answers has second position
        secondAnswerRadioButton {
            isDisplayed()
            click()
        }
    }

    fun chooseWrongAnswer(numberOfQuestion: Int) {
        //with configured random all correct answers has second position
        firstAnswerRadioButton {
            isDisplayed()
            click()
        }
    }
}