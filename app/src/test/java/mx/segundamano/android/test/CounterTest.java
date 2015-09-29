package mx.segundamano.android.test;

import org.junit.Before;
import org.junit.Test;

import mx.segundamano.android.utils.Counter;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    private Counter counter;

    @Before
    public void setUp() {
        counter = new Counter();
    }

    @Test
    public void initialCounterValue() throws Exception {
        assertEquals(0, (int) counter.value());
    }

    @Test
    public void testIncreaseCounter() throws Exception {
        counter.increase();
        assertEquals(1, (int) counter.value());
    }
}
