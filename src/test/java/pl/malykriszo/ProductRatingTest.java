package pl.malykriszo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * pl.malykriszo Created by MałyKriszo on 2018-10-29.
 */
public class ProductRatingTest {

    @Test
    public void create(){
        final ProductRating rating = new ProductRating();
        assertEquals(0, rating.getScore());
    }
    @Test
    public void setScore(){
        final ProductRating rating = new ProductRating();
        rating.setScore(3);
        assertEquals(3, rating.getScore());
    }

}