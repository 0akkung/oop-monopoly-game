package mgame;

import java.util.Random;

/**
 * Die with six faces with can be random from a roll
 */
public class Die {
    private int faceValue;

    /**
     * Generate random face value from 1 to 6
     */
    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
