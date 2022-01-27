package Game;

import javax.swing.JLabel;
//this class is to generate the throw of the dice. we are using a big switch statement to handles all situations
public class ThrowDice {
	public static void thrw(JLabel D1,JLabel D2,JLabel D3,JLabel D4,JLabel D5,JLabel D6,JLabel infoyellow,JLabel infored,JLabel infogreen,JLabel infoblue, int rand,int playernb) {
		switch (rand) {						//the number of the dice will be printed thanks to switch statement
		  case 1:
		    D1.setVisible(true);						//this part is simply GUI part, because we are setting the positions of each JLABEL(dice pictures)
		    if(playernb==1) {	
		    	infoyellow.setBounds(639,527,30,14);	//playersnumbers are using, 1 is to represent the yellow players,2 for the red, 3 for the Green and 4 for the blue
		    	infoyellow.setVisible(true);			//this if allow us to print a JLABEL next to the Dice picture in order to know who throws what ??
		    }
		    if(playernb==2) {							// if it is the red player we set a red label
		    	infored.setBounds(590,527,30,14);
		    	infored.setVisible(true);
		    }
		    if(playernb==3) {							// same case , if it is the green player a green info we set a green label
		    	infogreen.setBounds(609,527,30,14);
		    	infogreen.setVisible(true);
		    }
		    if(playernb==4) {							//same thing, if it is the blue player, a blue info label is setting.
		    	infoblue.setBounds(675,527,30,14);
		    	infoblue.setVisible(true);
		    }
		    break;
		  case 2:	
			D2.setVisible(true);			//if the throw is 2
			 if(playernb==1) {
			    	infoyellow.setBounds(639,429,30,14);
			    	infoyellow.setVisible(true);
			    }
			    if(playernb==2) {
			    	infored.setBounds(590,429,30,14);
			    	infored.setVisible(true);
			    }
			    if(playernb==3) {
			    	infogreen.setBounds(609,429,30,14);
			    	infogreen.setVisible(true);
			    }
			    if(playernb==4) {
			    	infoblue.setBounds(675,429,30,14);
			    	infoblue.setVisible(true);
			    }
		    break;
		  case 3:							//if the throw is 3
		    D3.setVisible(true);
		    if(playernb==1) {
		    	infoyellow.setBounds(639,342,30,14);
		    	infoyellow.setVisible(true);
		    }
		    if(playernb==2) {
		    	infored.setBounds(590,342,30,14);
		    	infored.setVisible(true);
		    }
		    if(playernb==3) {
		    	infogreen.setBounds(609,342,30,14);
		    	infogreen.setVisible(true);
		    }
		    if(playernb==4) {
		    	infoblue.setBounds(675,342,30,14);
		    	infoblue.setVisible(true);
		    }
		   
		    break;
		  case 4:						//if the throw is 4
		    D4.setVisible(true);
		    if(playernb==1) {
		    	infoyellow.setBounds(639,254,30,14);
		    	infoyellow.setVisible(true);
		    }
		    if(playernb==2) {
		    	infored.setBounds(590,254,30,14);
		    	infored.setVisible(true);
		    }
		    if(playernb==3) {
		    	infogreen.setBounds(609,254,30,14);
		    	infogreen.setVisible(true);
		    }
		    if(playernb==4) {
		    	infoblue.setBounds(675,254,30,14);
		    	infoblue.setVisible(true);
		    }
		    
		    break;
		  case 5:								//if the throw is 5
		    D5.setVisible(true);	
		    if(playernb==1) {
		    	infoyellow.setBounds(639,156,30,14);
		    	infoyellow.setVisible(true);
		    }
		    if(playernb==2) {
		    	infored.setBounds(590,156,30,14);
		    	infored.setVisible(true);
		    }
		    if(playernb==3) {
		    	infogreen.setBounds(609,156,30,14);
		    	infogreen.setVisible(true);
		    }
		    if(playernb==4) {
		    	infoblue.setBounds(675,156,30,14);
		    	infoblue.setVisible(true);
		    }
		    
		    break;
		  case 6:									//if the throw is 6
		    D6.setVisible(true);						
		    if(playernb==1) {
		    	infoyellow.setBounds(639,62,30,14);
		    	infoyellow.setVisible(true);
		    }
		    if(playernb==2) {
		    	infored.setBounds(590,62,30,14);
		    	infored.setVisible(true);
		    }
		    if(playernb==3) {
		    	infogreen.setBounds(609,62,30,14);
		    	infogreen.setVisible(true);
		    }
		    if(playernb==4) {
		    	infoblue.setBounds(675,62,30,14);
		    	infoblue.setVisible(true);
		    }
		   
		    break;
		}
		
	}
	// we create a throwfinish method, to clean the frame after a throw.It will make them all invisible
public static void throwFinish (JLabel D1,JLabel D2,JLabel D3,JLabel D4,JLabel D5,JLabel D6,JLabel infoyellow,JLabel infored,JLabel infogreen,JLabel infoblue){
		
		D1.setVisible(false);
		D2.setVisible(false);
		D3.setVisible(false);
		D4.setVisible(false);
		D5.setVisible(false);
		D6.setVisible(false);
		infoyellow.setVisible(false);
		infored.setVisible(false);
		infoblue.setVisible(false);
		infogreen.setVisible(false);
	}
}
