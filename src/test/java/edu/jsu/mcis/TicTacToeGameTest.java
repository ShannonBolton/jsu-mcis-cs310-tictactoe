package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeGameTest {
	
	@Test
	public void testMakeMarkAtCenter(){
		TicTacToeGame game = new TicTacToeGame();
		String label = game.makeMark(1,1);
		assertEquals("X", label);
	}
	
	@Test
	public void testMakeMarkAtCenterAndMakeMarkAtBottomRight(){
		TicTacToeGame game = new TicTacToeGame();
		String labelA = game.makeMark(1,1);
		assertEquals("X", labelA);
		String labelB = game.makeMark(0,2);
		assertEquals("O", labelB);
	}

	@Test
	public void testMakeMarkOverExisiting(){
		TicTacToeGame game = new TicTacToeGame();
		String labelA = game.makeMark(1,1);
		assertEquals("X", labelA);
		String labelB = game.makeMark(1,1); 
		assertEquals("X", labelB);
	}

	/*@Test
	public void testIfThereIsWinnerText(){
		TicTacToeGame game = new TicTacToeGame();
		game.makeMark(0,0);
		game.makeMark(0,1);
		game.makeMark(1,1);
		game.makeMark(1,0);
		game.makeMark(2,2);
		assertEquals("Winner is X", game.Winner());
	}*/
}