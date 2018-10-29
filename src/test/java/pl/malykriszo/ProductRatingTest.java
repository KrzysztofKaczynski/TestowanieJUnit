package pl.malykriszo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * pl.malykriszo Created by MałyKriszo on 2018-10-29.
 */
public class ProductRatingTest {

    private ProductRating rating;

    @Before
    public void before() {
        rating = new ProductRating();
    }

    @Test
    public void create() {
        assertEquals(0, rating.getScore());
    }

    @Test
    public void setScore() {
        rating.setScore(3);
        assertEquals(3, rating.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setScoreLessThanZero() {
        rating.setScore(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setScoreMoreThanFive() {
        rating.setScore(6);
    }

    @Test
    public void setScoreZero() {
        rating.setScore(0);
        assertEquals(0, rating.getScore());
    }

    @Test
    public void setScoreFive() {
        rating.setScore(5);
        assertEquals(5, rating.getScore());
    }

}
