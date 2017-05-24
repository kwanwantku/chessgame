package boardgame;

import boardgame.chess.Chess;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class ChessUI extends JFrame implements Observer{

    private Chess chess;


	public ChessUI() {

    }
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
