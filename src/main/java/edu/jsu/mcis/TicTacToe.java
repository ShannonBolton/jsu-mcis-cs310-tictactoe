package edu.jsu.mcis;


public class TicTacToe {
	private String board[][];
	private boolean playerXTurn;
	private String winner;
	private int zero = 0;
	private int one = 1;
	private int two = 2;
	
	public TicTacToe() {
		board = new String[3][3];
		playerXTurn = true;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = "-";
			}
		}
	}

	public void turn(int row, int col){
		if(board[row][col] == "-") {
			if(playerXTurn == true) {
				board[row][col] = "X";
			}
			else {
				board[row][col] = "O";
			}
			playerXTurn = !playerXTurn;
		}
		CheckForAWinner();
	}
	
	public void CheckForAWinner(){
		if(board[zero][zero].equals(board[one][one]) && board[zero][zero].equals(board[two][two])){
			winner = board[zero][zero];
		}
		else if(board[zero][two].equals(board[one][one]) && board[zero][two].equals(board[two][zero])){
			winner = board[zero][two];
		}
		else if(board[zero][zero] != "-" && board[zero][zero].equals(board[zero][one]) && board[zero][zero].equals(board[zero][two])){
			winner = board[zero][zero];
		}
		else if(board[one][zero] != "-" && board[one][zero].equals(board[one][one]) && board[one][zero].equals(board[one][two])){
			winner = board[one][zero];
		}
		else if(board[two][zero] != "-" && board[two][zero].equals(board[two][one]) && board[two][zero].equals(board[two][two])){
			winner = board[two][zero];
		}
		else if(board[zero][zero] != "-" &&board[zero][zero].equals(board[one][zero]) && board[zero][zero].equals(board[two][zero])){
			winner = board[zero][zero];
		}
		else if(board[zero][one] != "-" &&board[zero][one].equals(board[one][one]) && board[zero][one].equals(board[two][one])){
			winner = board[zero][one];
		}
		else if(board[zero][two] != "-" &&board[zero][two].equals(board[one][two]) && board[zero][two].equals(board[two][two])){
			winner = board[zero][two];
		}
		else {
			winner = "TIE";
		}
	}
	
	
	public String getLocation(int row, int col){	
		return board[row][col];
	}

	public String getWinner() {
		return winner;
	}

}