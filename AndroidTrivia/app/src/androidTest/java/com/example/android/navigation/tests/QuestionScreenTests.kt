package com.example.android.navigation.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.android.navigation.MainActivity
import com.example.android.navigation.R
import com.example.android.navigation.screens.GameOverScreen
import com.example.android.navigation.screens.GameOverScreen.gameOverImage
import com.example.android.navigation.screens.GameWonScreen
import com.example.android.navigation.screens.GameWonScreen.wonImage
import com.example.android.navigation.screens.MainScreen
import com.example.android.navigation.screens.MainScreen.startGame
import com.example.android.navigation.screens.QuestionScreen
import com.example.android.navigation.screens.QuestionScreen.chooseCorrectAnswer
import com.example.android.navigation.screens.QuestionScreen.chooseWrongAnswer
import com.example.android.navigation.screens.QuestionScreen.firstAnswerRadioButton
import com.example.android.navigation.screens.QuestionScreen.fourthAnswerRadioButton
import com.example.android.navigation.screens.QuestionScreen.questionImage
import com.example.android.navigation.screens.QuestionScreen.questionText
import com.example.android.navigation.screens.QuestionScreen.secondAnswerRadioButton
import com.example.android.navigation.screens.QuestionScreen.submitAnswerButton
import com.example.android.navigation.screens.QuestionScreen.thirdAnswerRadioButton
import org.junit.Rule
import org.junit.Test

class QuestionScreenTests : TestCaseBase() {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun checkImageDisplayed() = before {
        MainScreen {
            startGame()
        }
    }.after {

    }.run {
        QuestionScreen {
            questionImage.isDisplayed()
        }
    }

    @Test
    fun checkQuestionTextDisplayed() = before {
        MainScreen {
            startGame()
        }
    }.after {

    }.run {
        QuestionScreen{
            questionText {
                isDisplayed()
                containsText("What do you use to push structured data into a layout?")
            }
        }
    }

    @Test
    fun checkAnswersDisplayed() = before {
        MainScreen {
            startGame()
        }
    }.after {

    }.run {
        QuestionScreen {
            firstAnswerRadioButton {
                isDisplayed()
                isClickable()
                hasText("An OnClick method")
            }

            secondAnswerRadioButton {
                isDisplayed()
                isClickable()
                hasText("Data binding")
            }

            thirdAnswerRadioButton {
                isDisplayed()
                isClickable()
                hasText("Data pushing")
            }

            fourthAnswerRadioButton {
                isDisplayed()
                isClickable()
                hasText("Set text")
            }
        }
    }

    @Test
    fun checkSubmitButtonDisplayed() = before {
        MainScreen {
            startGame()
        }
    }.after {

    }.run {
        QuestionScreen {
            submitAnswerButton {
                isDisplayed()
                isClickable()
                hasText(R.string.submit_button)
            }
        }
    }

    @Test
    fun checkSubmitWrongAnswerLeadsToGameOverScreen() = before {
        MainScreen {
            startGame()
        }
    }.after {

    }.run {
        QuestionScreen {
            chooseWrongAnswer(1)
            submitAnswerButton.click()
        }

        GameOverScreen {
            gameOverImage{
                isDisplayed()
            }
        }
    }

    @Test
    fun checkSubmitCorrectAnswerLeadsToNextQuestion() = before {
        MainScreen {
            startGame()
        }
    }.after {
    }.run {
        QuestionScreen {
            chooseCorrectAnswer(1)
            submitAnswerButton.click()

            questionImage{
                isDisplayed()
            }
            questionText {
                isDisplayed()
                hasText("What method do you use to inflate layouts in fragments?")
            }
            firstAnswerRadioButton {
                isDisplayed()
                hasText("onInflateLayout()")
            }
        }
    }

    @Test
    fun checkTitleContainsNumberOfQuestion() = before {
        MainScreen {
            startGame()
        }
    }.after {
    }.run {
        QuestionScreen{
            for (questionNumber in 1..3) {
                title {
                    containsText("($questionNumber/3)")
                }
                chooseCorrectAnswer(questionNumber)
                submitAnswerButton{
                    click()
                }
            }
        }
    }

    @Test
    fun checkCorrectAnswersLeadToWonScreen() = before {
        MainScreen {
            startGame()
        }
    }.after {
    }.run {
        QuestionScreen{
            for (questionNumber in 1..3) {
                chooseCorrectAnswer(questionNumber)
                submitAnswerButton.click()
            }
        }

        GameWonScreen {
            wonImage{
                isDisplayed()
            }
        }
    }
}