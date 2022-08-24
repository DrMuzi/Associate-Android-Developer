package com.google.developers.lettervault

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.action.ViewActions
import androidx.test.ext.junit.runners.AndroidJUnit4

import com.google.developers.lettervault.ui.home.HomeActivity

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.After
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ValidateAddTest {
    @get:Rule
    val activity = ActivityScenarioRule(HomeActivity::class.java)

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
        Intents.init()
    }

    @After
    fun tearDown(){
        Intents.release()
    }

    @Test
    fun addTest() {
        onView(withId(R.id.action_add))
            .check(matches(isDisplayed()))
            .perform(click())

        onView(withId(R.id.action_time))
            .check(matches(isDisplayed()))

        onView(withId(R.id.action_save))
            .check(matches(isDisplayed()))

        onView(withId(R.id.subjectText))
            .check(matches(isDisplayed()))

        onView(withId(R.id.addMessageText))
            .check(matches(isDisplayed()))
    }
}