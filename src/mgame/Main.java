package mgame;

public class Main {

    public static void main(String[] args) {
        DataSourceDB dataSource = new DataSourceDB();
        Board board = new Board(dataSource);
        Die[] dice = {new Die(), new Die()};

        MGame game = new MGame(board, dice);

        game.joinPlayer("Luffy");
        game.joinPlayer("Zoro");
        game.joinPlayer("Nami");
        game.joinPlayer("Usopp");
        game.joinPlayer("Sanji");

        game.playGame(5);
    }

}