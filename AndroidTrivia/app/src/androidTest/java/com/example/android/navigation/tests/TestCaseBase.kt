package com.example.android.navigation.tests

import com.example.android.navigation.BuildConfig
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase

open class TestCaseBase : TestCase() {
    init {
        BuildConfig.IS_TESTING.set(true)
    }
}