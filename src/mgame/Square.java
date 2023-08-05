package mgame;

/**
 * A square in a board
 */
public class Square {
    private String name;

    /**
     * Construct a square
     */
    public Square(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
