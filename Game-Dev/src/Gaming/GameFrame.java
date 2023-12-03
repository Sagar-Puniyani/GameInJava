package Gaming;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	public GameFrame(){
		Board board = new Board();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Game Dev In Java");
		this.setSize(1500 , 950 );
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(board);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GameFrame();
		
	}
}