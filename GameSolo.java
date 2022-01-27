package Game;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.Eat;
import Game.Lists;
import Game.Winners;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;

public class GameSolo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					GameSolo frame = new GameSolo();
					frame.setVisible(true);
			}
		});
		}
	public static int playerRoundP1=0;			//we create 4 static variables
	public static int playerRoundP2=0;
	public static int playerRoundP3=0;
	public static int playerRoundP4=0;


	public GameSolo() {
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820,675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// we are 16 JButtons for all of the Pions, we attribute them a picture and we use setEnabled(false) for the moment
		JButton RedPion1 = new JButton("");											//here we create 4 Red Pion
		RedPion1.setIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));	
		RedPion1.setBounds(124, 163, 30, 30);
		contentPane.add(RedPion1);
	    RedPion1.setDisabledIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));
		RedPion1.setEnabled(false);
	
		JButton RedPion2 = new JButton("");
		RedPion2.setIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));
		RedPion2.setBounds(187, 163, 30, 30);
		contentPane.add(RedPion2);
		RedPion2.setDisabledIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));
		RedPion2.setEnabled(false);
		
		JButton RedPion3 = new JButton("");
		RedPion3.setIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));
		RedPion3.setBounds(125, 103, 30, 30);
		contentPane.add(RedPion3);
		RedPion3.setDisabledIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));
	    RedPion3.setEnabled(false);
		
		JButton RedPion4 = new JButton("");
		RedPion4.setIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));
		RedPion4.setBounds(188, 103, 30, 30);
		contentPane.add(RedPion4);
		RedPion4.setDisabledIcon(new ImageIcon("C:\\Javaproject\\REDpion.png"));
		RedPion4.setEnabled(false);
		
		
		
		JButton YellowPion1 = new JButton("");										//the same, we create 4 Yellow pions
		YellowPion1.setIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion1.setBounds(124, 473, 30, 30);
		contentPane.add(YellowPion1);
		YellowPion1.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion1.setEnabled(false);
		
		JButton YellowPion2 = new JButton("");
		YellowPion2.setIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion2.setBounds(187, 473, 30, 30);
		contentPane.add(YellowPion2);
		YellowPion2.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion2.setEnabled(false);
		
		JButton YellowPion4 = new JButton("");
		YellowPion4.setIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion4.setBounds(187, 413, 30, 30);
		contentPane.add(YellowPion4);
		YellowPion4.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion4.setEnabled(false);
		
		JButton YellowPion3 = new JButton("");
		YellowPion3.setIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion3.setBounds(124, 413, 30, 30);
		contentPane.add(YellowPion3);
		YellowPion3.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Yellowpion.png"));
		YellowPion3.setEnabled(false);
		
		
		
		JButton GreenPion1 = new JButton("");												//creation of 4 Green Pions
		GreenPion1.setIcon(new ImageIcon("C:\\Javaproject\\GreenPion.png"));
		GreenPion1.setBounds(435, 106, 30, 30);
		contentPane.add(GreenPion1);
		GreenPion1.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Greenpion.png"));
		GreenPion1.setEnabled(false);
		
		JButton GreenPion2 =    new JButton("");
		GreenPion2.setIcon(new ImageIcon("C:\\Javaproject\\GreenPion.png"));
		GreenPion2.setBounds(434, 164, 30, 30);
		contentPane.add(GreenPion2);
		GreenPion2.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Greenpion.png"));
		GreenPion2.setEnabled(false);
		
		JButton GreenPion3 = new JButton("");
		GreenPion3.setIcon(new ImageIcon("C:\\Javaproject\\GreenPion.png"));
		GreenPion3.setBounds(496, 163, 30, 30);
		contentPane.add(GreenPion3);
		GreenPion3.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Greenpion.png"));
		GreenPion3.setEnabled(false);
		
		JButton GreenPion4 = new JButton("");
		GreenPion4.setIcon(new ImageIcon("C:\\Javaproject\\GreenPion.png"));
		GreenPion4.setBounds(497, 106, 30, 30);
		contentPane.add(GreenPion4);
		GreenPion4.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Greenpion.png"));
		GreenPion4.setEnabled(false);
		
		
		
		JButton BluePion1 = new JButton("");										//and we create 4 Blue Pions
		BluePion1.setIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion1.setBounds(435, 478, 30, 30);
		contentPane.add(BluePion1);
		BluePion1.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion1.setEnabled(false);
		
		JButton BluePion2 = new JButton("");
		BluePion2.setIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion2.setBounds(498, 479, 30, 30);
		contentPane.add(BluePion2);
		BluePion2.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion2.setEnabled(false);
		
		JButton BluePion3 = new JButton("");
		BluePion3.setIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion3.setBounds(435, 418, 30, 30);
		contentPane.add(BluePion3);
		BluePion3.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion3.setEnabled(false);
		
		JButton BluePion4 = new JButton("");
		BluePion4.setIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion4.setBounds(499, 419, 30, 30);
		contentPane.add(BluePion4);
		BluePion4.setDisabledIcon(new ImageIcon("C:\\Javaproject\\Bluepion.png"));
		BluePion4.setEnabled(false);
		
		JLabel BoardPicture = new JLabel("");										//we create a JLabel for the Game Board Picture
		BoardPicture.setIcon(new ImageIcon("C:\\Javaproject\\3164XU3XEQL.png"));
		BoardPicture.setBounds(68, 47, 512, 512);
		contentPane.add(BoardPicture);
		BoardPicture.setOpaque(false);
		
		JLabel DiceOne = new JLabel("");											// we are creating 6 JLabel for each throw of dice and we put a picture for each of them
		DiceOne.setIcon(new ImageIcon("C:\\Javaproject\\un.PNG"));					//picture of dice one
		DiceOne.setBounds(705, 488, 91, 91);
		contentPane.add(DiceOne);
		DiceOne.setVisible(false);
		
		JLabel DiceTwo = new JLabel("");										//dice Two
		DiceTwo.setIcon(new ImageIcon("C:\\Javaproject\\deux.PNG"));
		DiceTwo.setBounds(705, 393, 91, 91);
		contentPane.add(DiceTwo);
		DiceTwo.setVisible(false);
		
		JLabel DiceThree = new JLabel("");										//dice Three
		DiceThree.setIcon(new ImageIcon("C:\\Javaproject\\trois.PNG"));
		DiceThree.setBounds(705, 300, 91, 91);
		contentPane.add(DiceThree);
		DiceThree.setVisible(false);
		
		JLabel DiceFour = new JLabel("");										//dice Four
		DiceFour.setIcon(new ImageIcon("C:\\Javaproject\\quatre.PNG"));
		DiceFour.setBounds(705, 208, 91, 91);
		contentPane.add(DiceFour);
		DiceFour.setVisible(false);
			
		JLabel DiceFive = new JLabel("");										//dice Five
		DiceFive.setIcon(new ImageIcon("C:\\Javaproject\\cinq.PNG"));
		DiceFive.setBounds(705, 117, 91, 91);
		contentPane.add(DiceFive);
		DiceFive.setVisible(false);
		
		JLabel DiceSix = new JLabel("");										//dice Six
		DiceSix.setIcon(new ImageIcon("C:\\Javaproject\\six.PNG"));
		DiceSix.setBounds(705, 24, 91, 91);
		contentPane.add(DiceSix);
		DiceSix.setVisible(false);
		
		JButton ThrowButton = new JButton("Push to throw");						//creation of throw JButton to generate the dice throw
		JButton OkButton = new JButton("Ok !");
		OkButton.setVisible(false);
		OkButton.setBounds(458, 570, 89, 23);
		contentPane.add(OkButton);
		ThrowButton.setBounds(262, 570, 119, 23);
		contentPane.add(ThrowButton);
																				//creation of a JLabel which will show us the throw of the red player
		JLabel infored = new JLabel("Red");
		infored.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infored.setForeground(Color.RED);
		infored.setBounds(590, 429, 22, 14);
		infored.setVisible(false);
		contentPane.add(infored);
		
		JLabel infogreen = new JLabel("Green");									//creation of a JLabel which will show us the throw of the green player
		infogreen.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infogreen.setForeground(SystemColor.desktop);
		infogreen.setBounds(609, 429, 30, 14);
		infogreen.setVisible(false);
		contentPane.add(infogreen);
		
		JLabel infoyellow = new JLabel("Yellow");								//creation of a label which will show us the throw of the yellow player
		infoyellow.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infoyellow.setForeground(Color.ORANGE);
		infoyellow.setBounds(639, 429, 30, 14);
		infoyellow.setVisible(false);
		contentPane.add(infoyellow);
		
		JLabel infoblue = new JLabel("Blue");									//creation of a label which will show us the throw of the blue player
		infoblue.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infoblue.setForeground(Color.BLUE);
		infoblue.setBounds(665, 70, 30, 14);
		infoblue.setVisible(false);
		contentPane.add(infoblue);
			
		JButton ContinueButton = new JButton("Continue");						//creation of continue button, it allow us to make a new throw
		ContinueButton.setBounds(458, 570, 122, 23);
		contentPane.add(ContinueButton);
		ContinueButton.setVisible(false);
		BoardPicture.setOpaque(false);
		
		validate();
		repaint();
		
		Random rand = new Random();
		ThrowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameVariables.random_integer_player = rand.nextInt(7-1) + 1;		//random number (between 1-6) is generated to throw dice for each player, this is our random number
				GameVariables.random_integer_ia1=rand.nextInt(7-1) + 1;				//Red player random number
				GameVariables.random_integer_ia2=rand.nextInt(7-1) + 1;				//Green player random number
				GameVariables.random_integer_ia3=rand.nextInt(7-1) + 1;				//Blue player random number
			ThrowButton.setVisible(false);
			
			ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_player,1); // we call the method to throw dice from the ThrowDice.java class
	
			if(GameVariables.pionsontheboardyellow==0) {		//if all of the player pions are in the square 
			InsideGameRules.verifySixPlayer(YellowPion1,YellowPion2,YellowPion3,YellowPion4,GameVariables.random_integer_player); // we verifiy if he throws 6 or not, if it is the case he can move one of his pions.VerifySix method is defined in Inside Game rules class
			if(GameVariables.random_integer_player==6) {
				ThrowButton.setVisible(true);				//if he throws 6 he can play again
			}else {
				OkButton.setVisible(true);					//if he doesn't throw 6, he cannot throw again. he must click on OK i finish
			}
			}
			
			if(GameVariables.pionsontheboardyellow>0) {			//if the player has got already 1 or more pions out the square, he can move them without throwing 6. 
				if(GameVariables.random_integer_player==6) {	//if he throws 6 he can play again
					ThrowButton.setVisible(true);
					InsideGameRules.OurTurn(YellowPion1,YellowPion2,YellowPion3,YellowPion4); //Our turn is a function to make the buttons enabled
			}else {
				InsideGameRules.OurTurn(YellowPion1,YellowPion2,YellowPion3,YellowPion4); 
				OkButton.setVisible(true);
			}
			}
			}
		});
		
		
		//this part allow us to move the pions
		YellowPion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP1==0 && GameVariables.random_integer_player !=6) {	//we verify if this pions is in the square or out of the square
				}else {
					playerRoundP1++;		//if the players throw 6 and his pions is inside the square he can play
				PlayersTurn.PlayerYellowTurn(YellowPion1,YellowPion2,YellowPion3,YellowPion4,GameVariables.YellowPion1Position,124,473); //we call the playeryellow method from the playersTurn.java class to allow the player to move his pions
				if(playerRoundP1==1) { //if his pion is outside of the square, he can also move it.
					GameVariables.YellowPion1Position=GameVariables.YellowPion1Position+GameVariables.random_integer_player-6; //this is a little GUI solution
				}else {
					GameVariables.YellowPion1Position=GameVariables.YellowPion1Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4); //we verify if the player won the game by calling YellowWin method from the Winners Class
				Eat.PlayerYelloweat(YellowPion1,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4); // we verifiy if the first pion of the yellow player can eat another pion by using the eatYellow method from the Eat class
			}
		});
		
		//we are basically doing the same thing for each of the pions, there is just the order of the variables for methods that we are changing
		YellowPion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (playerRoundP2==0 && GameVariables.random_integer_player !=6) {
					
				}else {
					playerRoundP2++;
				PlayersTurn.PlayerYellowTurn(YellowPion2,YellowPion1,YellowPion3,YellowPion4,GameVariables.YellowPion2Position,187,473);
				if(playerRoundP2==1) {
					GameVariables.YellowPion2Position=GameVariables.YellowPion2Position+GameVariables.random_integer_player-6;
				}else {
					GameVariables.YellowPion2Position=GameVariables.YellowPion2Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
				Eat.PlayerYelloweat(YellowPion2,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4);
			}
		});
		
		//the move for the YellowPion3, same thing
		YellowPion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (playerRoundP3==0 && GameVariables.random_integer_player !=6) {
					
				}else {
					playerRoundP3++;
				PlayersTurn.PlayerYellowTurn(YellowPion3,YellowPion1,YellowPion2,YellowPion4,GameVariables.YellowPion3Position,124,413);
				if(playerRoundP3==1) {
					GameVariables.YellowPion3Position=GameVariables.YellowPion3Position+GameVariables.random_integer_player-6;
				}else {
					GameVariables.YellowPion3Position=GameVariables.YellowPion3Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
				Eat.PlayerYelloweat(YellowPion3,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4);
			}
		});
		
		//and finally the moves of the YellowPion4
		YellowPion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP4==0 && GameVariables.random_integer_player !=6) {
				}else {
					playerRoundP4++;
				PlayersTurn.PlayerYellowTurn(YellowPion4,YellowPion1,YellowPion2,YellowPion3,GameVariables.YellowPion4Position,187,413);
				if(playerRoundP4==1) {
					GameVariables.YellowPion4Position=GameVariables.YellowPion4Position+GameVariables.random_integer_player-6;
				}else {
					GameVariables.YellowPion4Position=GameVariables.YellowPion4Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4);   
				Eat.PlayerYelloweat(YellowPion4,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4);
			}
		});
		
		
		OkButton.addActionListener(new ActionListener() {		//this button generates the actions of the CPU players
			public void actionPerformed(ActionEvent e) {
				
				OkButton.setVisible(false);
				ContinueButton.setVisible(true);			//Firstly it generates the dice throw of the 3 CPU players
				ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_ia1,2);
				ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_ia2,3);
				ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_ia3,4);
			
				//Red player turn, we verify also if he can eat any pion
				AiForPlayers.IaTurnForRedPlayer(RedPion1,RedPion2,RedPion3,RedPion4,Lists.arrayR); // here we are using a method AIForRedPlayers from AIforplayers class, it will automatically call the artifical intelligence to make the moves of the red pions.
				Eat.PlayerRedeat(RedPion1,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);//we verifiy if the first pion of the red player can eat another pion
				Eat.PlayerRedeat(RedPion2,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);//same thing, we verifiy if the second pion of the red player can or not eat another pion
				Eat.PlayerRedeat(RedPion3,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);//same verification for the third pions of the red player
				Eat.PlayerRedeat(RedPion4,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);//same thing for the fourth red pion
				
				//Green player turn, we verify also if he can eat any pion
				AiForPlayers.IaTurnForGreenPlayer(GreenPion1,GreenPion2,GreenPion3,GreenPion4,Lists.arrayG);// here we are using a method AIForGreenPlayers from AIforplayers class, it will automatically call the artifical intelligence to make the moves of the Green pions.
				Eat.PlayerGreeneat(GreenPion1, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);// Eat verification for the green pions 
				Eat.PlayerGreeneat(GreenPion2, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);
				Eat.PlayerGreeneat(GreenPion3, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);
				Eat.PlayerGreeneat(GreenPion4, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);
				
				//Blue player turn, we verify also if he can eat any pion
				AiForPlayers.IaTurnForBluePlayer(BluePion1,BluePion2,BluePion3,BluePion4,Lists.arrayB);// here we are using a method AIForBluePlayers from AIforplayers class, it will automatically call the artifical intelligence to make the moves of the blue pions.
				Eat.PlayerBlueeat(BluePion1,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);//eat verification for the blue player
				Eat.PlayerBlueeat(BluePion2,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);
				Eat.PlayerBlueeat(BluePion3,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);
				Eat.PlayerBlueeat(BluePion4,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		ContinueButton.addActionListener(new ActionListener() {	//continue button to clean the GUI after a throw
			public void actionPerformed(ActionEvent e) {
				ContinueButton.setVisible(false);
				ThrowDice.throwFinish(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue);
				ThrowButton.setVisible(true);
				
			}
		});
	}
}
