package Game;

import javax.swing.JButton;
import javax.swing.JOptionPane;
//this class is to create the artifical intelligence for the CPU players. There are 3 method, one for red, one for green and one for blue
public class AiForPlayers {
	public static void IaTurnForRedPlayer(JButton P1,JButton P2, JButton P3,JButton P4,Coordinates[] array) { //this is for the red player
		if(GameVariables.pionsontheboardred==0) {		//if all of the red pions are in the square area
			if(GameVariables.random_integer_ia1==6) {			//we verify if the Red CPU throws 6			
				GameVariables.pionsontheboardred++;				//if he throws 6, we increment this variable
				P1.setBounds(array[GameVariables.RedPion1Position].getCoordx(),array[GameVariables.RedPion1Position].getCoordy(),25,25); // he moves his first pion
			}
		}else {
		if(GameVariables.pionsontheboardred==1){		//if the red player has already a pion out the square, he can simply play it
			GameVariables.RedPion1Position=GameVariables.random_integer_ia1+GameVariables.RedPion1Position; //we increment is position depending on his throw
			if(GameVariables.RedPion1Position<58) {	//58 correspond to the home safe area
			P1.setBounds(array[GameVariables.RedPion1Position].getCoordx(),array[GameVariables.RedPion1Position].getCoordy(),25,25);	//if it is the case he will not play him again.
			}else{
				P1.setBounds(280,289,25,25);					
				GameVariables.pionsontheboardred++;		// once his first pion is in the home safe area, he can now play his second pion
					P2.setBounds(array[GameVariables.RedPion2Position].getCoordx(),array[GameVariables.RedPion2Position].getCoordy(),25,25);
			}
		}else {
				
		if(GameVariables.pionsontheboardred==2) {
			GameVariables.RedPion2Position=GameVariables.random_integer_ia1+GameVariables.RedPion2Position;
					
					if(GameVariables.RedPion2Position<58) { //same thing, we verifiy if his 2nd pions is in the home safe area if it is the case he will play with his third pion now
						P2.setBounds(array[GameVariables.RedPion2Position].getCoordx(),array[GameVariables.RedPion2Position].getCoordy(),25,25);
					}else {
						P2.setBounds(280,289,25,25);
						GameVariables.pionsontheboardred++;
						P3.setBounds(array[GameVariables.RedPion3Position].getCoordx(),array[GameVariables.RedPion3Position].getCoordy(),25,25);
					}
				
			
		}else {
		if(GameVariables.pionsontheboardred==3) {
			GameVariables.RedPion3Position=GameVariables.random_integer_ia1+GameVariables.RedPion3Position;
			if(GameVariables.RedPion3Position<58) {	//same thing,we verifiy if his 3rd pion is the home safe area, if it is the case he will play with his last pion
			P3.setBounds(array[GameVariables.RedPion3Position].getCoordx(),array[GameVariables.RedPion3Position].getCoordy(),25,25);
		}else{
			P3.setBounds(280,289,25,25);
			GameVariables.pionsontheboardred++;
			P4.setBounds(array[GameVariables.RedPion4Position].getCoordx(),array[GameVariables.RedPion4Position].getCoordy(),25,25);
		
		}
		}
		else {
			
		if(GameVariables.pionsontheboardred==4) {
			GameVariables.RedPion4Position=GameVariables.random_integer_ia1+GameVariables.RedPion4Position;
		}	if(GameVariables.RedPion4Position<58) {
			P4.setBounds(array[GameVariables.RedPion4Position].getCoordx(),array[GameVariables.RedPion4Position].getCoordy(),25,25);
		}else{
			P4.setBounds(280,289,25,25);
			JOptionPane.showMessageDialog(null,"Red player wins");	//he will win once his 4th pion is also in the home safe area
			System.exit(0);
		}
		}
		}
		}
		}
	}
	//we are simply doing the same thing for each player, the positions of the coordinates and the array are changing
	//same thing for the green player with the green variables
	public static void IaTurnForGreenPlayer(JButton P1,JButton P2, JButton P3,JButton P4,Coordinates[] array) {
		if(GameVariables.pionsontheboardgreen==0) {
			if(GameVariables.random_integer_ia2==6) {						
				GameVariables.pionsontheboardgreen++;
				P1.setBounds(array[GameVariables.GreenPion1Position].getCoordx(),array[GameVariables.GreenPion1Position].getCoordy(),25,25);
			}
		}else {
		if(GameVariables.pionsontheboardgreen==1){
			GameVariables.GreenPion1Position=GameVariables.random_integer_ia2+GameVariables.GreenPion1Position;
			if(GameVariables.GreenPion1Position<58) {
			P1.setBounds(array[GameVariables.GreenPion1Position].getCoordx(),array[GameVariables.GreenPion1Position].getCoordy(),25,25);
			}else{
				P1.setBounds(311,255,25,25);					
				GameVariables.pionsontheboardgreen++;
					P2.setBounds(array[GameVariables.GreenPion2Position].getCoordx(),array[GameVariables.GreenPion2Position].getCoordy(),25,25);
			}
		}else {
				
		if(GameVariables.pionsontheboardgreen==2) {
			GameVariables.GreenPion2Position=GameVariables.random_integer_ia2+GameVariables.GreenPion2Position;
					
					if(GameVariables.GreenPion2Position<58) {
						P2.setBounds(array[GameVariables.GreenPion2Position].getCoordx(),array[GameVariables.GreenPion2Position].getCoordy(),25,25);
					}else {
						P2.setBounds(311,255,25,25);
						GameVariables.pionsontheboardgreen++;
						P3.setBounds(array[GameVariables.GreenPion3Position].getCoordx(),array[GameVariables.GreenPion3Position].getCoordy(),25,25);
					}
				
			
		}else {
		if(GameVariables.pionsontheboardgreen==3) {
			GameVariables.GreenPion3Position=GameVariables.random_integer_ia2+GameVariables.GreenPion3Position;
			if(GameVariables.GreenPion3Position<58) {
			P3.setBounds(array[GameVariables.GreenPion3Position].getCoordx(),array[GameVariables.GreenPion3Position].getCoordy(),25,25);
		}else{
			P3.setBounds(311,255,25,25);
			GameVariables.pionsontheboardgreen++;
			P4.setBounds(array[GameVariables.GreenPion4Position].getCoordx(),array[GameVariables.GreenPion4Position].getCoordy(),25,25);
		
		}
		}
		else {
			
		if(GameVariables.pionsontheboardgreen==4) {
			GameVariables.GreenPion4Position=GameVariables.random_integer_ia2+GameVariables.GreenPion4Position;
		}	if(GameVariables.GreenPion4Position<58) {
			P4.setBounds(array[GameVariables.GreenPion4Position].getCoordx(),array[GameVariables.GreenPion4Position].getCoordy(),25,25);
		}else{
			P4.setBounds(311,255,25,25);
			JOptionPane.showMessageDialog(null,"Green player wins");
			System.exit(0);
			
		}
		}
		}
		}
		}
}
	//same thing for the blue player with the blue variables
	public static void IaTurnForBluePlayer(JButton P1,JButton P2, JButton P3,JButton P4,Coordinates[] array) {
		if(GameVariables.pionsontheboardblue==0) {
			if(GameVariables.random_integer_ia3==6) {						
				GameVariables.pionsontheboardblue++;
				P1.setBounds(array[GameVariables.BluePion1Position].getCoordx(),array[GameVariables.BluePion1Position].getCoordy(),25,25);
			}
		}else {
		if(GameVariables.pionsontheboardblue==1){
			GameVariables.BluePion1Position=GameVariables.random_integer_ia3+GameVariables.BluePion1Position;
			if(GameVariables.BluePion1Position<58) {
			P1.setBounds(array[GameVariables.BluePion1Position].getCoordx(),array[GameVariables.BluePion1Position].getCoordy(),25,25);
			}else{
				P1.setBounds(347,289,25,25);					
				GameVariables.pionsontheboardblue++;
					P2.setBounds(array[GameVariables.BluePion2Position].getCoordx(),array[GameVariables.BluePion2Position].getCoordy(),25,25);
			}
		}else {
				
		if(GameVariables.pionsontheboardblue==2) {
			GameVariables.BluePion2Position=GameVariables.random_integer_ia3+GameVariables.BluePion2Position;
					
					if(GameVariables.BluePion2Position<58) {
						P2.setBounds(array[GameVariables.BluePion2Position].getCoordx(),array[GameVariables.BluePion2Position].getCoordy(),25,25);
					}else {
						P2.setBounds(347,289,25,25);
						GameVariables.pionsontheboardblue++;
						P3.setBounds(array[GameVariables.BluePion3Position].getCoordx(),array[GameVariables.BluePion3Position].getCoordy(),25,25);
					}
				
			
		}else {
		if(GameVariables.pionsontheboardblue==3) {
			GameVariables.BluePion3Position=GameVariables.random_integer_ia3+GameVariables.BluePion3Position;
			if(GameVariables.BluePion3Position<58) {
			P3.setBounds(array[GameVariables.BluePion3Position].getCoordx(),array[GameVariables.BluePion3Position].getCoordy(),25,25);
		}else{
			P3.setBounds(347,289,25,25);
			GameVariables.pionsontheboardblue++;
			P4.setBounds(array[GameVariables.BluePion4Position].getCoordx(),array[GameVariables.BluePion4Position].getCoordy(),25,25);
		
		}
		}
		else {
			
		if(GameVariables.pionsontheboardblue==4) {
			GameVariables.BluePion4Position=GameVariables.random_integer_ia3+GameVariables.BluePion4Position;
		}	if(GameVariables.BluePion4Position<58) {
			P4.setBounds(array[GameVariables.BluePion4Position].getCoordx(),array[GameVariables.BluePion4Position].getCoordy(),25,25);
		}else{
			P4.setBounds(347,289,25,25);
			JOptionPane.showMessageDialog(null,"Blue player wins");
			System.exit(0);
			
		}
		}
		}
		}
		}		
	}
}
