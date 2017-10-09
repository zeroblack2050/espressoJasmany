package com.example.jasmany.espressoandroid;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.CloseKeyboardAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.PositionAssertions.isBelow;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by jasmany on 8/10/2017.
 */
@RunWith(AndroidJUnit4.class)
public class StartTest {

    @Rule   public ActivityTestRule<Start> mActivityRule = new ActivityTestRule<>(Start.class);

    @Test   public void ensureTextChanged() throws InterruptedException {
        onView(withId(R.id.start_editex_text)).perform(typeText("Hello World !!!"), ViewActions.closeSoftKeyboard());
        Thread.sleep(1000);
        onView(withId(R.id.star_button_cambiarTextView)).perform(click());
        onView(withId(R.id.star_textView_receive)).check(matches(withText("Hello World !!!")));

    }

    @Test   public void ensureResetText() throws InterruptedException{
        onView(withId(R.id.start_editex_text)).perform(typeText("Hello World !!!"), ViewActions.closeSoftKeyboard());
        Thread.sleep(1000);
        onView(withId(R.id.star_button_reset)).perform(click());
        onView(withId(R.id.star_textView_receive)).check(matches(withText("")));
    }

    @Test   public void ensureChangedActivity() throws InterruptedException{
        onView(withId(R.id.start_editex_text)).perform(typeText("Hello World !!!"), ViewActions.closeSoftKeyboard());
        Thread.sleep(1000);
        onView(withId(R.id.star_button_cambiarActivity)).perform(click());

        onView(withId(R.id.second_textView_view)).check(matches(withText("Hello World !!!")));
    }

    @Test   public void ensureResetButtonIsBelowToEditex() throws InterruptedException{
        //onView(withId(R.id.start_editex_text)).perform(typeText("Hello World !!!"), ViewActions.closeSoftKeyboard());
        //Thread.sleep(1000);
        //onView(withId(R.id.star_button_reset)).perform(click());
        onView(withId(R.id.star_button_reset)).check(isBelow(withId(R.id.start_editex_text)));
        //onView(withId(R.id.star_button_reset)).check(isBelow(withId(R.id.star_textView_receive)));
        Thread.sleep(1500);
    }
}