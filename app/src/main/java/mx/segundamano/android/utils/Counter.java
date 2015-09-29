package mx.segundamano.android.utils;

/**
 * Created by gianpa on 9/29/15.
 */
public class Counter {
    private int counter;

    public Counter() {
        this(0);
    }

    public Counter(int initialValue) {
        counter = initialValue;
    }

    public Integer value() {
        return counter;
    }

    public void increase() {
        counter++;
    }
}
