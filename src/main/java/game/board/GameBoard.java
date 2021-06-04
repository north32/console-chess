package game.board;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.move.Move;
import game.player.Player;

import java.util.List;

public class GameBoard {

    private final Player player1;
    private final Player player2;
    private final Board board;

    public GameBoard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
    }

    public void start() {
        while (true) {
            if (makeMove(player1)) {
                System.out.println(this);
            } else {
                System.out.println(getState());
                break;
            }
            if (makeMove(player2)) {
                System.out.println(this);
            } else {
                System.out.println(getState());
                break;
            }
        }
    }

    public String getState() {
        if (board.isDraw()) {
            return "draw";
        } else if (board.isMated()) {
            return "mate";
        } else {
            return "ongoing";
        }
    }

    private boolean makeMove(Player player) {
        while (true) {
            Move move = player.makeMove(this);
            if (isLegalMove(move)) {
                board.doMove(move);
                break;
            } else {
                System.out.println("move is illegal");
            }
        }
        return !board.isDraw() && !board.isMated();
    }

    public List<Move> legalMoves() {
        return  board.legalMoves();
    }

    public boolean isLegalMove(Move move) {
        List<Move> legalMoves = legalMoves();
        return legalMoves.contains(move);
    }

    public Board getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return board.toString();
    }
}
