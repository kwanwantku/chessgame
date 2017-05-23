package boardgame;

import boardgame.chess.Chess;

/**
 * Created by pranger54 on 5/20/2017 AD.
 */
public class GameController {

    private Player[] players;
    private Game game;

    public GameController(Game game) {
        players = new  Player[2];
        this.game = game;
    }

    public void addPlayer(int position,Player player) {
        players[position] = player;
    }

    public void start() {
    	int i = 0;
    	while(!game.isEnd()) {
    		players[(i++) % players.length].perform(game);
    		game.getBoard().render();
    	}
    }
    
    public static void main(String[] args) {
    	Game game = null;
    	if(true) {
    		game = new Chess();
    	}
    	GameController gamecontroller = new GameController(game);
    	gamecontroller.start();
    }
}


