package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	TicTacToe board;
	@Test
	public void checkForEmptySpot() {
		board = new TicTacToe();
		board.turn(1,1);
		board.turn(1,1);
		assertEquals("X",board.getLocation(1,1));
	}

	@Test
	public void winDiagonallyAsXBackSlash() {
		board = new TicTacToe();
		board.turn(1,1);
		board.turn(0,1);
		board.turn(0,0);
		board.turn(0,2);
		board.turn(2,2);
		assertEquals("X", board.getWinner());
	}
	
	@Test
	public void winDiagonallyAsOForwardSlash() {
		board = new TicTacToe();
		board.turn(0,0);
		board.turn(0,2);
		board.turn(1,2);
		board.turn(1,1);
		board.turn(2,2);
		board.turn(2,0);
		assertEquals("O", board.getWinner());
	}
	
	@Test
	public void winHorizontallyAsOBottomRow() {
		board = new TicTacToe();
		board.turn(0,0);
		board.turn(2,0);
		board.turn(0,1);
		board.turn(2,1);
		board.turn(1,1);
		board.turn(2,2);
		assertEquals("O", board.getWinner());
	}
	
	@Test
	public void winHorizontallyAsXTopRow() {
		board = new TicTacToe();
		board.turn(0,1);
		board.turn(2,0);
		board.turn(0,0);
		board.turn(2,2);
		board.turn(0,2);
		assertEquals("X", board.getWinner());
	}
	
	@Test
	public void winHorizontallyAsOMiddleRow() {
		board = new TicTacToe();
		board.turn(0,0);
		board.turn(1,0);
		board.turn(0,2);
		board.turn(1,1);
		board.turn(2,2);
		board.turn(1,2);
		assertEquals("O", board.getWinner());
	}
	
	@Test
	public void winVerticallyAsXLeftColumn() {
		board = new TicTacToe();
		board.turn(0,0);
		board.turn(1,2);
		board.turn(1,0);
		board.turn(0,2);
		board.turn(2,0);
		assertEquals("X", board.getWinner());
	}
	
	@Test
	public void winVerticallyAsOMiddleColumn() {
		board = new TicTacToe();
		board.turn(0,0);
		board.turn(0,1);
		board.turn(1,2);
		board.turn(1,1);
		board.turn(2,0);
		board.turn(2,1);
		assertEquals("O", board.getWinner());
	}
	
	@Test
	public void winVerticallyAsXRightColumn() {
		board = new TicTacToe();
		board.turn(0,2);
		assertEquals("X", board.getLocation(0, 2));
		board.turn(0,0);
		assertEquals("O", board.getLocation(0, 0));
		board.turn(1,2);
		assertEquals("X", board.getLocation(1, 2));
		board.turn(1,0);
		assertEquals("O", board.getLocation(1, 0));
		board.turn(2,2);
		assertEquals("X", board.getLocation(2, 2));
		assertEquals("X", board.getWinner());
	}
	
	@Test
	public void ForceATie() {
		board = new TicTacToe();
		board.turn(1,1);
		board.turn(0,0);
		board.turn(2,0);
		board.turn(0,2);
		board.turn(0,1);
		board.turn(2,1);
		board.turn(1,2);
		board.turn(1,0);
		board.turn(2,2);
		assertEquals("TIE", board.getWinner());
	}
	
	@Test
	public void PlayATurn(){
		board = new TicTacToe();
		board.turn(0,0);
		assertEquals("X", board.getLocation(0,0));
	}
	

}