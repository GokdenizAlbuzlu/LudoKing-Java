package Game;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;

public class WelcomeMenu {
	public static int Colorchoice =0;

	public static void main(String[] args) {
	showWindow();
	
	
} public static void showWindow() {			//we create the first Frame for our game
	
	JFrame Menu = new JFrame("LUDO KING");

	Menu.getContentPane().setBackground(Color.WHITE);		//customization of the Frame
	Menu.getContentPane().setForeground(Color.WHITE);
	Menu.setBounds(100,100,683,484);
	Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Menu.getContentPane().setLayout(null);
	
	
	JLabel Picture = new JLabel("");				//we create a JLabel to insert a picture
	Picture.setBounds(47, 11, 581, 318);
	Picture.setIcon(new ImageIcon("C:\\Javaproject\\LUDO.png"));
	Menu.getContentPane().add(Picture);
	
	
	JButton PlaySoloButton = new JButton("PLAY SOLO MOD !");			//we create a JButton for Solo Mod
	PlaySoloButton.setBounds(245, 340, 137, 23);
	PlaySoloButton.setForeground(Color.BLUE);
	PlaySoloButton.setFont(new Font("Calibri", Font.PLAIN, 13));
	Menu.getContentPane().add(PlaySoloButton);
	PlaySoloButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			GameSolo GameOpen = new GameSolo();				//it changes the frame when we click on the Solo Mod
			GameOpen.setVisible(true);
			Menu.setVisible(false);
			Menu.dispose();									//We are closing the Menu frame
			}
		
	});
	
	JButton RulesButton = new JButton("Rules");					//Creation of Rules button, the player can see the rules if he desires
	RulesButton.addActionListener(new ActionListener() {	
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "These are the basic rules to play Ludo King:\r\n"			//Message Dialog to print the rules
					+ "\r\n"
					+ "-It is played between 2 to 4 players, with every player having 4 tokens.\r\n"
					+ "The player who manages to get all of his four tokens home\r\n"
					+ " (reaches the centre of the board) first is declared the winner. \r\n"
					+ "The game goes on until all the places are decided.\r\n"
					+ "-A token can only move out from the base and start to \r\n"
					+ "move after a six is rolled by that player.\r\n"
					+ "-Once a six is rolled out, that player gets one more turn to roll the dice.\r\n"
					+ "-When a player rolls six three times in a row, it skips their turn.\r\n"
					+ "-If a token crosses the finish line, the player gets to roll another dice.\r\n"
					+ "-If a token captures another token, the capturing player gets to roll\r\n"
					+ " another dice.\r\n"
					+ "-The board has a total of eight safe squares which are coloured squares\r\n"
					+ " and starred squares.\r\n"
					+ "-The tokens need to exit every player's base and move around the \r\n"
					+ "board to win.");
		
		}
	});
	RulesButton.setBounds(272, 413, 89, 23);
	RulesButton.setForeground(Color.RED);
	RulesButton.setFont(new Font("Calibri", Font.PLAIN, 13));
	Menu.getContentPane().add(RulesButton);
	
	JButton ExitButton = new JButton("Exit");										//we create Exit Button to close the program
	ExitButton.setBounds(523, 372, 89, 23);	
	ExitButton.setForeground(Color.ORANGE);
	Menu.getContentPane().add(ExitButton);
	ExitButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			System.exit(0);														//exit the program
		}
});
			
	JButton PlayMultiButton = new JButton("PLAY MULTIPLAYER MOD !");	
	PlayMultiButton.setForeground(SystemColor.desktop);							//creation of a JButton for the Multiplayer mod
	PlayMultiButton.setFont(new Font("Calibri", Font.PLAIN, 13));
	PlayMultiButton.setBounds(224, 374, 182, 23);
	Menu.getContentPane().add(PlayMultiButton);
	Menu.setVisible(true);
	PlayMultiButton.addActionListener(new ActionListener() {				//Change the frame when we click on this button, the frame of Multiplayer Mod will appear
		public void actionPerformed(ActionEvent e) {
		GameMulti GameOpenMulti = new GameMulti();
		GameOpenMulti.setVisible(true);
		Menu.setVisible(false);
		Menu.dispose();
		}
	});
	
}

public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}
}