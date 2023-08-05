package mgame;

/**
 * A player with an ability to take turn to roll dice and move their piece
 */
public class Player {
    private String name;
    private Board board;
    private Die[] dice;
    private Piece piece;

    /**
     * Construct a player
     */
    public Player(String name, Board board, Die[] dice) {
        this.name = name;
        this.board = board;
        this.dice = dice;
        piece = new Piece(board.getStartingSquare());
    }

    public String getName() {
        return name;
    }

    /**
     * Player taking turn to roll dice and move piece from square to square
     */
    public void takeTurn() {
        int fvTot = 0;
        for (Die die : dice) {
            die.roll();
            int fv = die.getFaceValue();
            System.out.println("Rolled a " + fv);
            fvTot += fv;
        }
        System.out.println("Total: " + fvTot);

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);

        System.out.println("From: " + oldLoc.getName());
        System.out.println("To:   " + newLoc.getName());
    }
}
