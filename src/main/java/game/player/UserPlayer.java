package game.player;

import com.github.bhlangonijr.chesslib.move.Move;
import game.board.GameBoard;

import java.util.Scanner;

public class UserPlayer implements Player {

    private final Scanner scanner;

    public UserPlayer() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Move makeMove(GameBoard board) {
        String[] request = scanner.nextLine().split("\\s+");
        String command = request[0];
        switch (command) {
            case "help":
                System.out.println(
                        "move e2e4 - makes move\n" +
                        "check e2e4 - check if move is legal\n" +
                        "moves - prints all legal moves"
                );
                break;
            case "move":
                return new Move(request[1], board.getBoard().getSideToMove());
            case "check":
                Move move = new Move(request[1], board.getBoard().getSideToMove());
                if (board.isLegalMove(move)) {
                    System.out.println("move is legal");
                } else {
                    System.out.println("move is illegal");
                }
                break;
            case "moves":
                System.out.println(board.legalMoves());
                break;
            default:
                System.out.println("unknown command");
                break;
        }
        return makeMove(board);
    }
}
