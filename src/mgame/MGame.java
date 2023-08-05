package mgame;

import java.util.ArrayList;
import java.util.List;

/**
 * A Monopoly game with a board, dice and players
 */
public class MGame {
    private int roundCnt;
    private List<Player> players;
    private Board board;
    private Die[] dice;

    /**
     * Construct a Monopoly game
     */
    public MGame(Board board, Die[] dice) {
        roundCnt = 0;
        this.board = board;
        players = new ArrayList<>();
        this.dice = dice;
    }

    /**
     * Add a player to the game
     * @param name the name of a player
     */
    public void joinPlayer(String name) {
        players.add(new Player(name, board, dice));
    }

    /**
     * Play a game for number of rounds
     * @param N number of rounds
     */
    public void playGame(int N) {
        System.out.println("================================");
        while (roundCnt < N) { // Play until number of rounds
            System.out.println("Round " + (++roundCnt));
            playRound();
            System.out.println("================================");
        }

    }

    /**
     * Play a round of game
     */
    private void playRound() {
        for (Player player : players) {
            System.out.println("--------------------------------");
            System.out.println("Player: " + player.getName());
            player.takeTurn();
        }
    }
}
