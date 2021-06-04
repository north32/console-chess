package game.player;

import com.github.bhlangonijr.chesslib.move.Move;
import game.board.GameBoard;

public interface Player {

    Move makeMove(GameBoard board);

}
