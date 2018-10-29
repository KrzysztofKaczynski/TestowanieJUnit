package pl.malykriszo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * pl.malykriszo Created by MałyKriszo on 2018-10-29.
 */
public class ClockTest {

    @Test
    public void create() {
        final Clock clock = Clock.of(12, 15);
        assertEquals(12, clock.getHours());
        assertEquals(15, clock.getMinutes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNegativeHours() {
        Clock.of(-1, 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidHours() {
        Clock.of(25, 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidMinutes() {
        Clock.of(25, -1);
    }

}