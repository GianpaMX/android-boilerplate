package mx.segundamano.android.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import mx.segundamano.android.BuildConfig;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MyTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSyncCharacters() throws Exception {
    }
}
