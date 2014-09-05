import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	private TicTacToe ticTacToe;
	
    public String getLocation(int row, int col) {
        return ticTacToe.getLocation(row,col);
    }
    
    public String getWinner() {
        return ticTacToe.getWinner();
    }
	
	public void startNewGame() {
		ticTacToe = new TicTacToe();
	}
	
    public void markLocation(int row, int col) {
		ticTacToe.turn(row, col);
	}
}