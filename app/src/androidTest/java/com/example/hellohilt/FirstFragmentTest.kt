package com.example.hellohilt

import android.widget.Button
import android.widget.TextView
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import androidx.test.core.app.takeScreenshot
import androidx.test.core.graphics.writeToTestStorage

@HiltAndroidTest
class FirstFragmentTest {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun testClickButton() {
        launchFragmentInHiltContainer<FirstFragment> {
            val textView = view?.findViewById<TextView>(R.id.textview_first)
            val button = view?.findViewById<Button>(R.id.button)
            button?.performClick()
        }
        takeScreenshot().writeToTestStorage("screenshot")
    }
}
