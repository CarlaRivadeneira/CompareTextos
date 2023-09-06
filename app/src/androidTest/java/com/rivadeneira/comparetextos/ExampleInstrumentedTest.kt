package com.rivadeneira.comparetextos

import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareButton() {
        Espresso.onView(withId(R.id.editText1)).perform(typeText("Hola"))
        Espresso.onView(withId(R.id.editText2)).perform(typeText("Hola"))
        Espresso.onView(withId(R.id.compareButton)).perform(click())
        Espresso.onView(withId(R.id.resultTextView)).check(ViewAssertions.matches(withText("Ambos textos son iguales")))
    }
}
