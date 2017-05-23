package boardgame.chess;

import boardgame.Game;
import boardgame.Item;
import boardgame.Player;

public class Cheeser extends Player	{

	@Override
	public void perform(Game game) {
		if(game instanceof Chess) {
			//CAll From UI
			Item fromm = game.getBoard().getCell(1, 1).getItem(); 
			game.getBoard().getCell(5, 5).push(fromm);
		}
		else throw new IllegalArgumentException("Chess must play chess!!");
		
	}

}
