package mgame;

/**
 * A piece is a representation of a player in a board game
 */
public class Piece {
    private Square location;

    /**
     * Construct a piece
     * @param location where piece is in the board
     */
    public Piece(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square newLoc) {
        location = newLoc;
    }
}
