package Game;

import javax.swing.JButton;
//this class allow us to generate the player turns, we will use it generally in multiplayer mod but also in solo mod with playeryellow turn
public class PlayersTurn {
	//we are creating 4 method(one for each player)
	public static void PlayerYellowTurn(JButton p1,JButton p2,JButton p3,JButton p4,int position,int initialX,int initialY) {
		InsideGameRules.NotOurTurn(p1,p2,p3,p4); 
		if(p1.getX()==initialX && p1.getY()==initialY) {
			p1.setBounds(Lists.arrayY[0].getCoordx(),Lists.arrayY[0].getCoordy(),25,25); //if the pion of the yellow player is out the square we increment the pionsontheboardyellow variable
			GameVariables.pionsontheboardyellow++;
		}else {                      
			
		position=GameVariables.random_integer_player+position;				//we increment the position for the yellow player in the yellow coordinates array this will make the move for the yellow player
		if(position<58){//verification, if the pion is in the home secure area.58 correspond to the final position for each colour
		p1.setBounds(Lists.arrayY[position].getCoordx(),Lists.arrayY[position].getCoordy(),25,25);
		}else {
			p1.setEnabled(false);		//if he reaches the home safe area we will block the Jbutton
			p1.setBounds(311,325,25,25);		//and we will set the position of this Jbutton
			
		}
		}
		}
	//we are simply doing the same thing for each player, the coordinates and the position array are changing for each color
	//here it is for the red player
	public static void PlayerRedTurn(JButton p1,JButton p2,JButton p3,JButton p4,int position,int initialX,int initialY) {
		InsideGameRules.NotOurTurn(p1,p2,p3,p4);
		if(p1.getX()==initialX && p1.getY()==initialY) {
			p1.setBounds(Lists.arrayR[0].getCoordx(),Lists.arrayR[0].getCoordy(),25,25);
			GameVariables.pionsontheboardred++;
		}else {                      
		
		position=GameVariables.random_integer_ia1+position;
		if(position<58){
		p1.setBounds(Lists.arrayR[position].getCoordx(),Lists.arrayR[position].getCoordy(),25,25);
		}else {
			p1.setEnabled(false);
			p1.setBounds(280,289,25,25);
			
		}
		}
		}
	//same thing for the green player
	public static void PlayerGreenTurn(JButton p1,JButton p2,JButton p3,JButton p4,int position,int initialX,int initialY) {
		InsideGameRules.NotOurTurn(p1,p2,p3,p4);
		if(p1.getX()==initialX && p1.getY()==initialY) {
			p1.setBounds(Lists.arrayG[0].getCoordx(),Lists.arrayG[0].getCoordy(),25,25);
			GameVariables.pionsontheboardgreen++;
		}else {                      
		
		position=GameVariables.random_integer_ia2+position;
		if(position<58){
		p1.setBounds(Lists.arrayG[position].getCoordx(),Lists.arrayG[position].getCoordy(),25,25);
		}else {
			p1.setEnabled(false);
			p1.setBounds(311,255,25,25);
			
		}
		}
		}
	//same thing for the blue player
	public static void PlayerBlueTurn(JButton p1,JButton p2,JButton p3,JButton p4,int position,int initialX,int initialY) {
		InsideGameRules.NotOurTurn(p1,p2,p3,p4);
		if(p1.getX()==initialX && p1.getY()==initialY) {
			p1.setBounds(Lists.arrayB[0].getCoordx(),Lists.arrayB[0].getCoordy(),25,25);
			GameVariables.pionsontheboardblue++;
		}else {                      
		
		position=GameVariables.random_integer_ia3+position;
		if(position<58){
		p1.setBounds(Lists.arrayB[position].getCoordx(),Lists.arrayB[position].getCoordy(),25,25);
		}else {
			p1.setEnabled(false);
			p1.setBounds(347,289,25,25);
			
		}
		}
		}
}
