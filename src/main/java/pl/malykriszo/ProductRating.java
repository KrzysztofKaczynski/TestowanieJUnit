package pl.malykriszo;

import java.io.Serializable;

/**
 * pl.malykriszo Created by MałyKriszo on 2018-10-29.
 */
public final class ProductRating implements Serializable {

    private short score;

    public short getScore() {
        return score;
    }

    public ProductRating(final int score) {
        this.score = (short) score;
    }
}
