package com.example.hellohilt

import android.widget.Button
import android.widget.TextView

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@HiltAndroidTest
@Config(application = HiltTestApplication::class)
@RunWith(RobolectricTestRunner::class)
class FooFragmentTest {
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
            Assert.assertEquals(textView?.text, "-1")
        }
    }
}
