package pl.malykriszo;

import java.io.Serializable;

/**
 * pl.malykriszo Created by MałyKriszo on 2018-10-29.
 */
public final class ProductRating implements Serializable {


    private static final int MIN_SCORE = 0;
    private static final int MAX_SCORE = 5;

    public short getScore() {
        return score;
    }

    public void setScore(final int score) {
        if (score < MIN_SCORE || score > MAX_SCORE)
            throw new IllegalArgumentException("Invalid score");
        this.score = (short) score;
    }

    private short score;
}