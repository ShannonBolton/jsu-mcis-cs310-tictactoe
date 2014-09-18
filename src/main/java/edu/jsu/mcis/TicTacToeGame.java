package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGame extends JPanel implements MouseListener {

	private JPanel game;
	private TicTacToe ttt;
	private JLabel[][] labels;
	
	public TicTacToeGame(){
		setLayout(new BorderLayout());
		game = new JPanel();
		game.setLayout(new GridLayout(3,3));
		ttt = new TicTacToe();
		labels = new JLabel[3][3];
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				String mark = ttt.getLocation(i,j);
				labels[i][j] = new JLabel("");
				labels[i][j].setText(mark);
				labels[i][j].addMouseListener(this);
				labels[i][j].setPreferredSize(new Dimension(40,40));
				labels[i][j].setName("Location" +i+j);
				game.add(labels[i][j]);
				}
			}
		add(game, BorderLayout.CENTER);
	}

	public String makeMark(int row, int column){
		return ttt.turn(row, column);
	}
	
	public void mouseClicked(MouseEvent event1)
	{}
	public void mousePressed(MouseEvent event1)
	{}
	public void mouseEntered(MouseEvent event1)
	{}
	public void mouseExited(MouseEvent event1)
	{}
	public void mouseReleased(MouseEvent event1)
	{
		if(event1.getModifiers() == InputEvent.BUTTON1_MASK){
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if(event1.getSource() == (JLabel)labels[i][j]){
						ttt.turn(i,j);
						labels[i][j].setText(ttt.getLocation(i,j));
					}
				}
			}
			if(ttt.getWinner() != "-"){
				//ttt.CheckForAWinner();
				Winner();
			}
			else {}
		}
	}
	public void Winner(){
		(new Thread(new Runnable(){
			public void run(){
			JOptionPane pane = new JOptionPane();
			pane.showMessageDialog(null, "The winner is " + ttt.getWinner(), "Game Over", 0);
			}})).start();
	}

	
	public static void main(String[] args) {
		TicTacToeGame ticTacToeGame = new TicTacToeGame();
		JFrame window = new JFrame("Tic Tac Toe");
		window.add(ticTacToeGame);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}

}