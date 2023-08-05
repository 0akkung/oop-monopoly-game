package mgame;

import java.util.Arrays;

/**
 * A board contains squares for pieces to go to
 */
public class Board {
    private Square[] squares;

    public Board(DataSourceDB dataSource) {
        squares = dataSource.readSquares();
    }

    public Square getStartingSquare() {
        return squares[0];
    }

    /**
     * Get the new square for a piece by accumulating the old square with dice face value
     * @param oldLoc recent location of a piece
     * @param fvTot total value of dice
     * @return new square location
     */
    public Square getSquare(Square oldLoc, int fvTot) {
        int index = Arrays.asList(squares).indexOf(oldLoc)+ fvTot;
        // Prevent out of board, return to start
        if (index >= squares.length) index -= squares.length;
        return squares[index];
    }
}
