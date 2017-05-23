package boardgame;

/**
 * Created by pranger54 on 5/20/2017 AD.
 */
public abstract class Game {

    private Board board;

    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return  this.board;
    }
    
    protected abstract int getMaxPosiblePlayer();
    protected abstract boolean isEnd();
}