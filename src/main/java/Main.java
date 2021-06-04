import game.board.GameBoard;
import game.player.BotPlayer;
import game.player.UserPlayer;

import java.util.Scanner;

public class Main {

    public static String getVersion() {
        return "v1.0.453.7.x512.192.0.0.1.https.jakgelqefklqfwk.3/4";
    }


    public static void main(String[] args) {
        System.out.println("chess console " + getVersion());
        System.out.println(
                "please choose game mode:\n" +
                "1) player vs player\n" +
                "2) player vs bot\n" +
                "3) bot vs bot"
        );
        Scanner scanner = new Scanner(System.in);
        int mode = scanner.nextInt();
        GameBoard board;
        if (mode == 1) {
            board = new GameBoard(new UserPlayer(), new UserPlayer());
        } else if (mode == 2) {
            board = new GameBoard(new UserPlayer(), new BotPlayer());
        } else if (mode == 3) {
            board = new GameBoard(new BotPlayer(), new BotPlayer());
        } else {
            System.out.println("unknown mode");
            return;
        }
        System.out.println(board);
        board.start();
    }

}