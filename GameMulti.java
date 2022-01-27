package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.Winners;

public class GameMulti extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMulti frame = new GameMulti();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	int playerRoundP1Yellow=0;
	int playerRoundP2Yellow=0;
	int playerRoundP3Yellow=0;
	int playerRoundP4Yellow=0;
	
	int playerRoundP1Red=0;
	int playerRoundP2Red=0;
	int playerRoundP3Red=0;
	int playerRoundP4Red=0;
	
	int playerRoundP1Green=0;
	int playerRoundP2Green=0;
	int playerRoundP3Green=0;
	int playerRoundP4Green=0;
	
	int playerRoundP1Blue=0;
	int playerRoundP2Blue=0;
	int playerRoundP3Blue=0;
	int playerRoundP4Blue=0;
	int whoIsPlaying=1;
	
	
	public GameMulti() { //we make a copy paste, from the GameSolo frame. it is the same frame with same parameters and same name.
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820,675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		// we are creating all of the pions
		JButton RedPion1 = new JButton("");
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
		
		
		JButton YellowPion1 = new JButton("");
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
		
		JButton GreenPion1 = new JButton("");
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
		
		JButton BluePion1 = new JButton("");
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
		
		JLabel BoardPicture = new JLabel("New label");
		BoardPicture.setIcon(new ImageIcon("C:\\Javaproject\\3164XU3XEQL.png"));
		BoardPicture.setBounds(68, 47, 512, 512);
		contentPane.add(BoardPicture);
		BoardPicture.setOpaque(false);
		
		
		JLabel DiceOne = new JLabel("");
		DiceOne.setIcon(new ImageIcon("C:\\Javaproject\\un.PNG"));
		DiceOne.setBounds(705, 488, 91, 91);
		contentPane.add(DiceOne);
		DiceOne.setVisible(false);
		
		JLabel DiceTwo = new JLabel("");
		DiceTwo.setIcon(new ImageIcon("C:\\Javaproject\\deux.PNG"));
		DiceTwo.setBounds(705, 393, 91, 91);
		contentPane.add(DiceTwo);
		DiceTwo.setVisible(false);
		
		JLabel DiceThree = new JLabel("");
		DiceThree.setIcon(new ImageIcon("C:\\Javaproject\\trois.PNG"));
		DiceThree.setBounds(705, 300, 91, 91);
		contentPane.add(DiceThree);
		DiceThree.setVisible(false);
		
		JLabel DiceFour = new JLabel("");
		DiceFour.setIcon(new ImageIcon("C:\\Javaproject\\quatre.PNG"));
		DiceFour.setBounds(705, 208, 91, 91);
		contentPane.add(DiceFour);
		DiceFour.setVisible(false);
		
		JLabel DiceFive = new JLabel("");
		DiceFive.setIcon(new ImageIcon("C:\\Javaproject\\cinq.PNG"));
		DiceFive.setBounds(705, 117, 91, 91);
		contentPane.add(DiceFive);
		DiceFive.setVisible(false);
		
		JLabel DiceSix = new JLabel("");
		DiceSix.setIcon(new ImageIcon("C:\\Javaproject\\six.PNG"));
		DiceSix.setBounds(705, 24, 91, 91);
		contentPane.add(DiceSix);
		DiceSix.setVisible(false);
		
		JButton ThrowButtonYellow = new JButton("Push to throw");
		ThrowButtonYellow.setBackground(Color.ORANGE);
		ThrowButtonYellow.setVisible(true);
		JButton OkButton = new JButton("Ok !");
		OkButton.setVisible(false);
		OkButton.setBounds(458, 570, 89, 23);
		contentPane.add(OkButton);
		
		ThrowButtonYellow.setBounds(262, 592, 119, 23);
		contentPane.add(ThrowButtonYellow);
		

		JLabel infored = new JLabel("Red");
		infored.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infored.setForeground(Color.RED);
		infored.setBounds(590, 429, 22, 14);
		infored.setVisible(false);
		contentPane.add(infored);
		
		JLabel infogreen = new JLabel("Green");
		infogreen.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infogreen.setForeground(SystemColor.desktop);
		infogreen.setBounds(609, 429, 30, 14);
		infogreen.setVisible(false);
		contentPane.add(infogreen);
		
		JLabel infoyellow = new JLabel("Yellow");
		infoyellow.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infoyellow.setForeground(Color.ORANGE);
		infoyellow.setBounds(639, 429, 30, 14);
		infoyellow.setVisible(false);
		contentPane.add(infoyellow);
		
		JLabel infoblue = new JLabel("Blue");
		infoblue.setFont(new Font("Tahoma", Font.PLAIN, 9));
		infoblue.setForeground(Color.BLUE);
		infoblue.setBounds(665, 70, 30, 14);
		infoblue.setVisible(false);
		contentPane.add(infoblue);
		
		JButton ThrowButtonRed = new JButton("Push to throw");
		ThrowButtonRed.setBackground(Color.RED);
		ThrowButtonRed.setBounds(262, 592, 119, 23);
		ThrowButtonRed.setVisible(false);
		contentPane.add(ThrowButtonRed);
		
		JButton ThrowButtonGreen = new JButton("Push to throw");
		ThrowButtonGreen.setBackground(SystemColor.desktop);
		ThrowButtonGreen.setBounds(262, 592, 119, 23);
		ThrowButtonGreen.setVisible(false);
		contentPane.add(ThrowButtonGreen);
		
		JButton ThrowButtonBlue = new JButton("Push to throw");
		ThrowButtonBlue.setBackground(Color.CYAN);
		ThrowButtonBlue.setBounds(262, 592, 119, 23);
		ThrowButtonBlue.setVisible(false);
		contentPane.add(ThrowButtonBlue);
		
		validate();
		repaint();
		Random rand = new Random();
			//random number is generated to throw dice for each player
		
	
		ThrowButtonYellow.addActionListener(new ActionListener() {			//in this part we create a throw button for each colour, the code is the same that the GameSolo codes.
			public void actionPerformed(ActionEvent e) {
				GameVariables.random_integer_player = rand.nextInt(7-1) + 1;		//random number is generated to throw dice for each player
				ThrowButtonYellow.setVisible(false);
				
				ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_player,1);			//method to throw dice
				
				if(GameVariables.pionsontheboardyellow==0) {
					InsideGameRules.verifySixPlayer(YellowPion1,YellowPion2,YellowPion3,YellowPion4,GameVariables.random_integer_player);
				if(GameVariables.random_integer_player==6) {
					ThrowButtonYellow.setVisible(true);
				}else {
					OkButton.setVisible(true);
				}
				}
				
				if(GameVariables.pionsontheboardyellow>0) {
					if(GameVariables.random_integer_player==6) {
						ThrowButtonYellow.setVisible(true);
						InsideGameRules.OurTurn(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
				}else {
					InsideGameRules.OurTurn(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
					OkButton.setVisible(true);
				}
				}
				
				 
				
				}
			});
		ThrowButtonRed.addActionListener(new ActionListener() {		//throw button for the red player
		public void actionPerformed(ActionEvent e) {
			GameVariables.random_integer_ia1=rand.nextInt(7-1) + 1;
			ThrowButtonRed.setVisible(false);
			ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_ia1,2);			//method to throw dice
			if(GameVariables.pionsontheboardred==0) {
				InsideGameRules.verifySixPlayer(RedPion1,RedPion2,RedPion3,RedPion4,GameVariables.random_integer_ia1);
			if(GameVariables.random_integer_ia1==6) {
				ThrowButtonRed.setVisible(true);
			}else {
				OkButton.setVisible(true);
			}
			}
			if(GameVariables.pionsontheboardred>0) {
				if(GameVariables.random_integer_ia1==6) {
					ThrowButtonRed.setVisible(true);
					InsideGameRules.OurTurn(RedPion1,RedPion2,RedPion3,RedPion4);
			}else {
				InsideGameRules.OurTurn(RedPion1,RedPion2,RedPion3,RedPion4);
				OkButton.setVisible(true);
			}
			}
			
		}
	});
		ThrowButtonGreen.addActionListener(new ActionListener() {		//same thing, throw button for the green player
			public void actionPerformed(ActionEvent e) {
				GameVariables.random_integer_ia2=rand.nextInt(7-1) + 1;
				ThrowButtonGreen.setVisible(false);
				ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_ia2,3);			//method to throw dice
				if(GameVariables.pionsontheboardgreen==0) {
					InsideGameRules.verifySixPlayer(GreenPion1,GreenPion2,GreenPion3,GreenPion4,GameVariables.random_integer_ia2);
				if(GameVariables.random_integer_ia2==6) {
					ThrowButtonGreen.setVisible(true);
				}else {
					OkButton.setVisible(true);
				}
				}
				if(GameVariables.pionsontheboardgreen>0) {
					if(GameVariables.random_integer_ia2==6) {
						ThrowButtonGreen.setVisible(true);
						InsideGameRules.OurTurn(GreenPion1,GreenPion2,GreenPion3,GreenPion4);
				}else {
					InsideGameRules.OurTurn(GreenPion1,GreenPion2,GreenPion3,GreenPion4);
					OkButton.setVisible(true);
				}
				}
				
			}
		});
		ThrowButtonBlue.addActionListener(new ActionListener() {		//same thing, throw button for the blue player
			public void actionPerformed(ActionEvent e) {
				GameVariables.random_integer_ia3=rand.nextInt(7-1) + 1;
				ThrowButtonBlue.setVisible(false);
				ThrowDice.thrw(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue,GameVariables.random_integer_ia3,4);			//method to throw dice
				if(GameVariables.pionsontheboardblue==0) {
					InsideGameRules.verifySixPlayer(BluePion1,BluePion2,BluePion3,BluePion4,GameVariables.random_integer_ia3);
				if(GameVariables.random_integer_ia3==6) {
					ThrowButtonBlue.setVisible(true);
				}else {
					OkButton.setVisible(true);
				}
				}
				if(GameVariables.pionsontheboardblue>0) {
					if(GameVariables.random_integer_ia3==6) {
						ThrowButtonBlue.setVisible(true);
						InsideGameRules.OurTurn(BluePion1,BluePion2,BluePion3,BluePion4);
				}else {
					InsideGameRules.OurTurn(BluePion1,BluePion2,BluePion3,BluePion4);
					OkButton.setVisible(true);
				}
				}
				
			}
		});
		
		YellowPion1.addActionListener(new ActionListener() {		//even this part has the same code than the solo game, we are doing the same thing for all of the pions like in the solo game
			public void actionPerformed(ActionEvent e) {			//we will not detail this part of Pions button because we have already explain in GameSolo. Please consult the GameSolo.java class for details
			
				if (playerRoundP1Yellow==0 && GameVariables.random_integer_player !=6) {
					
				}else {
					playerRoundP1Yellow++;
				PlayersTurn.PlayerYellowTurn(YellowPion1,YellowPion2,YellowPion3,YellowPion4,GameVariables.YellowPion1Position,124,473);
				if(playerRoundP1Yellow==1) {
					GameVariables.YellowPion1Position=GameVariables.YellowPion1Position+GameVariables.random_integer_player-6;
				}else {
					GameVariables.YellowPion1Position=GameVariables.YellowPion1Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
				Eat.PlayerYelloweat(YellowPion1,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4);
			}
		});
		YellowPion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP2Yellow==0 && GameVariables.random_integer_player !=6) {
					
				}else {
					playerRoundP2Yellow++;
					PlayersTurn.PlayerYellowTurn(YellowPion2,YellowPion1,YellowPion3,YellowPion4,GameVariables.YellowPion2Position,187,473);
				if(playerRoundP2Yellow==1) {
					GameVariables.YellowPion2Position=GameVariables.YellowPion2Position+GameVariables.random_integer_player-6;
				}else {
					GameVariables.YellowPion2Position=GameVariables.YellowPion2Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
				Eat.PlayerYelloweat(YellowPion2,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4);
			}
		});
		YellowPion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP3Yellow==0 && GameVariables.random_integer_player !=6) {
					
				}else {
					playerRoundP3Yellow++;
					PlayersTurn.PlayerYellowTurn(YellowPion3,YellowPion1,YellowPion2,YellowPion4,GameVariables.YellowPion3Position,124,413);
				if(playerRoundP3Yellow==1) {
					GameVariables.YellowPion3Position=GameVariables.YellowPion3Position+GameVariables.random_integer_player-6;
				}else {
					GameVariables.YellowPion3Position=GameVariables.YellowPion3Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
				Eat.PlayerYelloweat(YellowPion3,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4);
			}
		});
		YellowPion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP4Yellow==0 && GameVariables.random_integer_player !=6) {
					
				}else {
					playerRoundP4Yellow++;
					PlayersTurn.PlayerYellowTurn(YellowPion4,YellowPion1,YellowPion2,YellowPion3,GameVariables.YellowPion4Position,187,413);
				if(playerRoundP4Yellow==1) {
					GameVariables.YellowPion4Position=GameVariables.YellowPion4Position+GameVariables.random_integer_player-6;
				}else {
					GameVariables.YellowPion4Position=GameVariables.YellowPion4Position+GameVariables.random_integer_player;
				}
				
			}   Winners.YellowWin(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
				Eat.PlayerYelloweat(YellowPion4,RedPion1,RedPion2,RedPion3,RedPion4,GreenPion1,GreenPion2,GreenPion3,GreenPion4,BluePion1,BluePion2,BluePion3,BluePion4);
			}
		});
		RedPion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP1Red==0 && GameVariables.random_integer_ia1 !=6) {
					
				}else {
					playerRoundP1Red++;
					PlayersTurn.PlayerRedTurn(RedPion1,RedPion2,RedPion3,RedPion4,GameVariables.RedPion1Position,124,163);
				if(playerRoundP1Red==1) {
					GameVariables.RedPion1Position=GameVariables.RedPion1Position+GameVariables.random_integer_ia1-6;
				}else {
					GameVariables.RedPion1Position=GameVariables.RedPion1Position+GameVariables.random_integer_ia1;
				}
				
			}   Winners.RedWin(RedPion1,RedPion2,RedPion3,RedPion4);
			Eat.PlayerRedeat(RedPion1,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);
			}
		});
		RedPion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP2Red==0 && GameVariables.random_integer_ia1 !=6) {
					
				}else {
					playerRoundP2Red++;
					PlayersTurn.PlayerRedTurn(RedPion2,RedPion1,RedPion3,RedPion4,GameVariables.RedPion2Position,187,163);
				if(playerRoundP2Red==1) {
					GameVariables.RedPion2Position=GameVariables.RedPion2Position+GameVariables.random_integer_ia1-6;
				}else {
					GameVariables.RedPion2Position=GameVariables.RedPion2Position+GameVariables.random_integer_ia1;
				}
				
			}    Winners.RedWin(RedPion1,RedPion2,RedPion3,RedPion4);
			Eat.PlayerRedeat(RedPion2,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);
			}
		});
		RedPion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP3Red==0 && GameVariables.random_integer_ia1 !=6) {
					
				}else {
					playerRoundP3Red++;
					PlayersTurn.PlayerRedTurn(RedPion3,RedPion1,RedPion2,RedPion4,GameVariables.RedPion3Position,125,103);
				if(playerRoundP3Red==1) {
					GameVariables.RedPion3Position=GameVariables.RedPion3Position+GameVariables.random_integer_ia1-6;
				}else {
					GameVariables.RedPion3Position=GameVariables.RedPion3Position+GameVariables.random_integer_ia1;
				}
				
			}    Winners.RedWin(RedPion1,RedPion2,RedPion3,RedPion4);
			Eat.PlayerRedeat(RedPion3,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);
			}
		});
		
		RedPion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP4Red==0 && GameVariables.random_integer_ia1 !=6) {
					
				}else {
					playerRoundP4Red++;
					PlayersTurn.PlayerRedTurn(RedPion4,RedPion1,RedPion2,RedPion3,GameVariables.RedPion4Position,188,103);
				if(playerRoundP4Red==1) {
					GameVariables.RedPion4Position=GameVariables.RedPion4Position+GameVariables.random_integer_ia1-6;
				}else {
					GameVariables.RedPion4Position=GameVariables.RedPion4Position+GameVariables.random_integer_ia1;
				}
				
			}    Winners.RedWin(RedPion1,RedPion2,RedPion3,RedPion4);
			Eat.PlayerRedeat(RedPion4,YellowPion1,YellowPion2,YellowPion3,YellowPion4,GreenPion1, GreenPion2, GreenPion3, GreenPion4, BluePion1, BluePion2, BluePion3, BluePion4);
			}
		});
		
		GreenPion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP1Green==0 && GameVariables.random_integer_ia2 !=6) {
					
				}else {
					playerRoundP1Green++;
					PlayersTurn.PlayerGreenTurn(GreenPion1,GreenPion2,GreenPion3,GreenPion4,GameVariables.GreenPion1Position,435,106);
				if(playerRoundP1Green==1) {
					GameVariables.GreenPion1Position=GameVariables.GreenPion1Position+GameVariables.random_integer_ia2-6;
				}else {
					GameVariables.GreenPion1Position=GameVariables.GreenPion1Position+GameVariables.random_integer_ia2;
				}
				
			}   Winners.GreenWin(GreenPion1,GreenPion2,GreenPion3,GreenPion4);
			Eat.PlayerGreeneat(GreenPion1, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		GreenPion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP2Green==0 && GameVariables.random_integer_ia2 !=6) {
					
				}else {
					playerRoundP2Green++;
					PlayersTurn.PlayerGreenTurn(GreenPion2,GreenPion1,GreenPion3,GreenPion4,GameVariables.GreenPion2Position,434,164);
				if(playerRoundP2Green==1) {
					GameVariables.GreenPion2Position=GameVariables.GreenPion2Position+GameVariables.random_integer_ia2-6;
				}else {
					GameVariables.GreenPion2Position=GameVariables.GreenPion2Position+GameVariables.random_integer_ia2;
				}
				
			}   Winners.GreenWin(GreenPion1,GreenPion2,GreenPion3,GreenPion4);
			Eat.PlayerGreeneat(GreenPion2, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		GreenPion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP3Green==0 && GameVariables.random_integer_ia2 !=6) {
					
				}else {
					playerRoundP3Green++;
					PlayersTurn.PlayerGreenTurn(GreenPion3,GreenPion1,GreenPion2,GreenPion4,GameVariables.GreenPion3Position,496,163);
				if(playerRoundP3Green==1) {
					GameVariables.GreenPion3Position=GameVariables.GreenPion3Position+GameVariables.random_integer_ia2-6;
				}else {
					GameVariables.GreenPion3Position=GameVariables.GreenPion3Position+GameVariables.random_integer_ia2;
				}
				
			}   Winners.GreenWin(GreenPion1,GreenPion2,GreenPion3,GreenPion4);
			Eat.PlayerGreeneat(GreenPion3, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		
		GreenPion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP4Green==0 && GameVariables.random_integer_ia2 !=6) {
					
				}else {
					playerRoundP4Green++;
					PlayersTurn.PlayerGreenTurn(GreenPion4,GreenPion1,GreenPion2,GreenPion3,GameVariables.GreenPion4Position,497,106);
				if(playerRoundP4Green==1) {
					GameVariables.GreenPion4Position=GameVariables.GreenPion4Position+GameVariables.random_integer_ia2-6;
				}else {
					GameVariables.GreenPion4Position=GameVariables.GreenPion4Position+GameVariables.random_integer_ia2;
				}
				
			}   Winners.GreenWin(GreenPion1,GreenPion2,GreenPion3,GreenPion4);
			Eat.PlayerGreeneat(GreenPion4, YellowPion1,YellowPion2,YellowPion3,YellowPion4,BluePion1, BluePion2, BluePion3, BluePion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		
		BluePion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP1Blue==0 && GameVariables.random_integer_ia3 !=6) {
					
				}else {
					playerRoundP1Blue++;
					PlayersTurn.PlayerBlueTurn(BluePion1,BluePion2,BluePion3,BluePion4,GameVariables.BluePion1Position,435,478);
				if(playerRoundP1Blue==1) {
					GameVariables.BluePion1Position=GameVariables.BluePion1Position+GameVariables.random_integer_ia3-6;
				}else {
					GameVariables.BluePion1Position=GameVariables.BluePion1Position+GameVariables.random_integer_ia3;
				}
				
			}   Winners.BlueWin(BluePion1,BluePion2,BluePion3,BluePion4);
			Eat.PlayerBlueeat(BluePion1,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		
		BluePion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP2Blue==0 && GameVariables.random_integer_ia3 !=6) {
					
				}else {
					playerRoundP2Blue++;
					PlayersTurn.PlayerBlueTurn(BluePion2,BluePion1,BluePion3,BluePion4,GameVariables.BluePion2Position,498,479);
				if(playerRoundP2Blue==1) {
					GameVariables.BluePion2Position=GameVariables.BluePion2Position+GameVariables.random_integer_ia3-6;
				}else {
					GameVariables.BluePion2Position=GameVariables.BluePion2Position+GameVariables.random_integer_ia3;
				}
				
			}   Winners.BlueWin(BluePion1,BluePion2,BluePion3,BluePion4);
			Eat.PlayerBlueeat(BluePion2,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		
		BluePion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP3Blue==0 && GameVariables.random_integer_ia3 !=6) {
					
				}else {
					playerRoundP3Blue++;
					PlayersTurn.PlayerBlueTurn(BluePion3,BluePion1,BluePion2,BluePion4,GameVariables.BluePion3Position,435,418);
				if(playerRoundP3Blue==1) {
					GameVariables.BluePion3Position=GameVariables.BluePion3Position+GameVariables.random_integer_ia3-6;
				}else {
					GameVariables.BluePion3Position=GameVariables.BluePion3Position+GameVariables.random_integer_ia3;
				}
				
			}   Winners.BlueWin(BluePion1,BluePion2,BluePion3,BluePion4);
			Eat.PlayerBlueeat(BluePion3,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		
		BluePion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (playerRoundP4Blue==0 && GameVariables.random_integer_ia3 !=6) {
					
				}else {
					playerRoundP4Blue++;
					PlayersTurn.PlayerBlueTurn(BluePion4,BluePion1,BluePion2,BluePion3,GameVariables.BluePion4Position,499,419);
				if(playerRoundP4Blue==1) {
					GameVariables.BluePion4Position=GameVariables.BluePion4Position+GameVariables.random_integer_ia3-6;
				}else {
					GameVariables.BluePion4Position=GameVariables.BluePion4Position+GameVariables.random_integer_ia3;
				}
				
			}   Winners.BlueWin(BluePion1,BluePion2,BluePion3,BluePion4);
			Eat.PlayerBlueeat(BluePion4,YellowPion1,YellowPion2,YellowPion3,YellowPion4, GreenPion1, GreenPion2, GreenPion3, GreenPion4,RedPion1,RedPion2,RedPion3,RedPion4);
			}
		});
		
		OkButton.addActionListener(new ActionListener() {		//this part allow us to know who is playing
			public void actionPerformed(ActionEvent e) {
				OkButton.setVisible(false);
				if(whoIsPlaying==1) {					//1 correspond to yellow player
					ThrowButtonYellow.setVisible(false);
					InsideGameRules.NotOurTurn(YellowPion1,YellowPion2,YellowPion3,YellowPion4);
					ThrowButtonRed.setVisible(true);
					whoIsPlaying=2;
				}else {
				if(whoIsPlaying==2) {					//2 correspond to red player
					ThrowButtonRed.setVisible(false);
					ThrowButtonGreen.setVisible(true);
					InsideGameRules.NotOurTurn(RedPion1,RedPion2,RedPion3,RedPion4);
					whoIsPlaying=3;
				}else {
				if(whoIsPlaying==3){					//3 correspond to green player
					ThrowButtonGreen.setVisible(false);
					ThrowButtonBlue.setVisible(true);
					InsideGameRules.NotOurTurn(GreenPion1,GreenPion2,GreenPion3,GreenPion4);
					whoIsPlaying=4;
				}else {
					if(whoIsPlaying==4) {				//4 is for the blue player
						ThrowButtonBlue.setVisible(false);
						ThrowButtonYellow.setVisible(true);
						InsideGameRules.NotOurTurn(BluePion1,BluePion2,BluePion3,BluePion4);
						ThrowDice.throwFinish(DiceOne,DiceTwo,DiceThree,DiceFour,DiceFive,DiceSix,infoyellow,infored,infogreen,infoblue);//we clean the GUI
						whoIsPlaying=1;		//after a round in clockwise, it is the yellow player turns.
					}
				}
				}
			}
			}
		
		});
}
}
