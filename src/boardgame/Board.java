package boardgame;
/**
 * Created by pranger54 on 5/20/2017 AD.
 */
public abstract class Board {
    public abstract void render();
    public abstract Cell getCell(int x,int y);
}