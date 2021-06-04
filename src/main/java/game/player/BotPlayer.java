package game.player;

import com.github.bhlangonijr.chesslib.move.Move;
import com.github.bhlangonijr.kengine.SearchParams;
import com.github.bhlangonijr.kengine.SearchState;
import com.github.bhlangonijr.kengine.alphabeta.AlphaBetaSearch;
import game.board.GameBoard;

public class BotPlayer implements Player {

    private final AlphaBetaSearch search;
    private final SearchParams params;

    public BotPlayer() {
        this.search = new AlphaBetaSearch();
        this.params = new SearchParams(
                60000000,
                60000000,
                0,
                0,
                60000, // 60000
                3, // 100
                1,
                50000000, // 50000000
                "",
                false,
                false,
                1
        );
    }

    @Override
    public Move makeMove(GameBoard board) {
        SearchState state = new SearchState(params, board.getBoard());
        return search.rooSearch(state);
    }
}
