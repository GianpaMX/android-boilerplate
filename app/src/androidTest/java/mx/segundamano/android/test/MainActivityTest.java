package mx.segundamano.android.test;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import mx.segundamano.android.R;
import mx.segundamano.android.ui.activity.MainActivity;
import mx.segundamano.android.utils.Counter;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by gianpa on 9/29/15.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Rule
    public final ActivityTestRule<MainActivity> main = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void counterShouldStartWithZero() {
        String expectedValue = "0";
        onView(withId(R.id.counterEditText)).check(matches(withText(expectedValue)));
    }


    @Test
    public void buttonShouldIncreaseCounter() {
        Counter counter = new Counter();

        onView(withId(R.id.plusButton)).perform(click());
        counter.increase();

        String expectedValue = counter.value().toString();
        onView(withId(R.id.counterEditText)).check(matches(withText(expectedValue)));
    }
}
