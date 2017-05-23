package boardgame.chess;

import boardgame.Game;

/**
 * Created by pranger54 on 5/20/2017 AD.
 */
public class Chess extends Game{

	@Override
	protected int getMaxPosiblePlayer() {
		return 2;
	}

	@Override
	protected boolean isEnd() {
		return false;
	}
	
}
