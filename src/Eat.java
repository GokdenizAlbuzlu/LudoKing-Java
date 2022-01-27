package Game;

import javax.swing.JButton;
//this Eat class verifiy the eat functionality
public class Eat {
	//there are 4 big method, one for each of the player
	// firstly, for the yellow player we are verifying all of the pions
	public static void PlayerYelloweat(JButton p1,JButton R1,JButton R2,JButton R3,JButton R4,JButton G1,JButton G2,JButton G3,JButton G4,JButton B1,JButton B2,JButton B3,JButton B4) {
		if((p1.getX()==R1.getX())&&(p1.getY()==R1.getY())) {  //if this 2 pions are at same position, we send the R1 pion to the square area.
			GameVariables.RedPion1Position=0;
		 R1.setBounds(108,257,25,25);
		}
		//the code is the same for the rest, we know that this part is ugly however we must verify all of the case because we have 16 different pions.and we must use 4 different method because the position for each colour is different
		if((p1.getX()==R2.getX())&&(p1.getY()==R2.getY())) {	
			GameVariables.RedPion2Position=0;
			 R2.setBounds(108,257,25,25);
			}
		
		if((p1.getX()==R3.getX())&&(p1.getY()==R3.getY())) {
			GameVariables.RedPion3Position=0;
			 R3.setBounds(108,257,25,25);
			}
		
		if((p1.getX()==R4.getX())&&(p1.getY()==R4.getY())) {
			GameVariables.RedPion4Position=0;
			 R4.setBounds(108,257,25,25);

			}
	
		if((p1.getX()==G1.getX())&&(p1.getY()==G1.getY())) {
			GameVariables.GreenPion1Position=0;
			 G1.setBounds(345,85,25,25);
			}
		if((p1.getX()==G2.getX())&&(p1.getY()==G2.getY())) {
			GameVariables.GreenPion2Position=0;
			 G2.setBounds(345,85,25,25);
			}
		if((p1.getX()==G3.getX())&&(p1.getY()==G3.getY())) {
			GameVariables.GreenPion3Position=0;
			 G3.setBounds(345,85,25,25);
			}
		
		if((p1.getX()==G4.getX())&&(p1.getY()==G4.getY())) {
			GameVariables.GreenPion4Position=0;
			 G4.setBounds(345,85,25,25);
			}
		
		if((p1.getX()==B1.getX())&&(p1.getY()==B1.getY())) {
			GameVariables.BluePion1Position=0;
			 B1.setBounds(515,323,25,25);
			}
		if((p1.getX()==B2.getX())&&(p1.getY()==B2.getY())) {
			GameVariables.BluePion2Position=0;
			 B2.setBounds(515,323,25,25);
			}
		if((p1.getX()==B3.getX())&&(p1.getY()==B3.getY())) {
			GameVariables.BluePion3Position=0;
			 B3.setBounds(515,323,25,25);
			}
		if((p1.getX()==B4.getX())&&(p1.getY()==B4.getY())) {
			GameVariables.BluePion4Position=0;
			 B4.setBounds(515,323,25,25);
			}
	}
	//the same method for the red player 
	public static void PlayerRedeat(JButton p1,JButton R1,JButton R2,JButton R3,JButton R4,JButton G1,JButton G2,JButton G3,JButton G4,JButton B1,JButton B2,JButton B3,JButton B4) {
		if((p1.getX()==R1.getX())&&(p1.getY()==R1.getY())) {
			GameVariables.YellowPion1Position=0;
		 R1.setBounds(280,493,25,25);
		}
		if((p1.getX()==R2.getX())&&(p1.getY()==R2.getY())) {
			GameVariables.YellowPion2Position=0;
			 R2.setBounds(280,493,25,25);
			}
		
		if((p1.getX()==R3.getX())&&(p1.getY()==R3.getY())) {
			GameVariables.YellowPion3Position=0;
			 R3.setBounds(280,493,25,25);
			}
		
		if((p1.getX()==R4.getX())&&(p1.getY()==R4.getY())) {
			GameVariables.YellowPion4Position=0;
			 R4.setBounds(280,493,25,25);
			 
			}
	
		if((p1.getX()==G1.getX())&&(p1.getY()==G1.getY())) {
			GameVariables.GreenPion1Position=0;
			 G1.setBounds(345,85,25,25);
			}
		if((p1.getX()==G2.getX())&&(p1.getY()==G2.getY())) {
			GameVariables.GreenPion2Position=0;
			 G2.setBounds(345,85,25,25);
			}
		if((p1.getX()==G3.getX())&&(p1.getY()==G3.getY())) {
			GameVariables.GreenPion3Position=0;
			 G3.setBounds(345,85,25,25);
			}
		
		if((p1.getX()==G4.getX())&&(p1.getY()==G4.getY())) {
			GameVariables.GreenPion4Position=0;
			 G4.setBounds(345,85,25,25);
			}
		
		if((p1.getX()==B1.getX())&&(p1.getY()==B1.getY())) {
			GameVariables.BluePion1Position=0;
			 B1.setBounds(515,323,25,25);
			}
		if((p1.getX()==B2.getX())&&(p1.getY()==B2.getY())) {
			GameVariables.BluePion2Position=0;
			 B2.setBounds(515,323,25,25);
			}
		if((p1.getX()==B3.getX())&&(p1.getY()==B3.getY())) {
			GameVariables.BluePion3Position=0;
			 B3.setBounds(515,323,25,25);
			}
		if((p1.getX()==B4.getX())&&(p1.getY()==B4.getY())) {
			GameVariables.BluePion4Position=0;
			 B4.setBounds(515,323,25,25);
			}
	}//the same method for the green player
	public static void PlayerGreeneat(JButton p1,JButton R1,JButton R2,JButton R3,JButton R4,JButton G1,JButton G2,JButton G3,JButton G4,JButton B1,JButton B2,JButton B3,JButton B4) {
		if((p1.getX()==R1.getX())&&(p1.getY()==R1.getY())) {
			GameVariables.YellowPion1Position=0;
		 R1.setBounds(280,493,25,25);
		}
		if((p1.getX()==R2.getX())&&(p1.getY()==R2.getY())) {
			GameVariables.YellowPion2Position=0;
			 R2.setBounds(280,493,25,25);
			}
		
		if((p1.getX()==R3.getX())&&(p1.getY()==R3.getY())) {
			GameVariables.YellowPion3Position=0;
			 R3.setBounds(280,493,25,25);
			}
		
		if((p1.getX()==R4.getX())&&(p1.getY()==R4.getY())) {
			GameVariables.YellowPion4Position=0;
			 R4.setBounds(280,493,25,25);
			 
			}
	
		if((p1.getX()==G1.getX())&&(p1.getY()==G1.getY())) {
			GameVariables.BluePion1Position=0;
			 G1.setBounds(515,323,25,25);
			}
		if((p1.getX()==G2.getX())&&(p1.getY()==G2.getY())) {
			GameVariables.BluePion2Position=0;
			 G2.setBounds(515,323,25,25);
			}
		if((p1.getX()==G3.getX())&&(p1.getY()==G3.getY())) {
			GameVariables.BluePion3Position=0;
			 G3.setBounds(515,323,25,25);
			}
		
		if((p1.getX()==G4.getX())&&(p1.getY()==G4.getY())) {
			GameVariables.BluePion4Position=0;
			 G4.setBounds(515,323,25,25);
			}
		
		if((p1.getX()==B1.getX())&&(p1.getY()==B1.getY())) {
			GameVariables.RedPion1Position=0;
			 B1.setBounds(108,257,25,25);
			}
		if((p1.getX()==B2.getX())&&(p1.getY()==B2.getY())) {
			GameVariables.RedPion2Position=0;
			 B2.setBounds(108,257,25,25);
			}
		if((p1.getX()==B3.getX())&&(p1.getY()==B3.getY())) {
			GameVariables.RedPion3Position=0;
			 B3.setBounds(108,257,25,25);
			}
		if((p1.getX()==B4.getX())&&(p1.getY()==B4.getY())) {
			GameVariables.RedPion4Position=0;
			 B4.setBounds(108,257,25,25);
			}
	}
	//the same method for the Blue player
	public static void PlayerBlueeat(JButton p1,JButton R1,JButton R2,JButton R3,JButton R4,JButton G1,JButton G2,JButton G3,JButton G4,JButton B1,JButton B2,JButton B3,JButton B4) {
		if((p1.getX()==R1.getX())&&(p1.getY()==R1.getY())) {
			GameVariables.YellowPion1Position=0;
		 R1.setBounds(280,493,25,25);
		}
		if((p1.getX()==R2.getX())&&(p1.getY()==R2.getY())) {
			GameVariables.YellowPion2Position=0;
			 R2.setBounds(280,493,25,25);
			}
		
		if((p1.getX()==R3.getX())&&(p1.getY()==R3.getY())) {
			GameVariables.YellowPion3Position=0;
			 R3.setBounds(280,493,25,25);
			}
		
		if((p1.getX()==R4.getX())&&(p1.getY()==R4.getY())) {
			GameVariables.YellowPion4Position=0;
			 R4.setBounds(280,493,25,25);
			 
			}
	
		if((p1.getX()==G1.getX())&&(p1.getY()==G1.getY())) {
			GameVariables.GreenPion1Position=0;
			 G1.setBounds(345,85,25,25);
			}
		if((p1.getX()==G2.getX())&&(p1.getY()==G2.getY())) {
			GameVariables.GreenPion2Position=0;
			 G2.setBounds(345,85,25,25);
			}
		if((p1.getX()==G3.getX())&&(p1.getY()==G3.getY())) {
			GameVariables.GreenPion3Position=0;
			 G3.setBounds(345,85,25,25);
			}
		
		if((p1.getX()==G4.getX())&&(p1.getY()==G4.getY())) {
			GameVariables.GreenPion4Position=0;
			 G4.setBounds(345,85,25,25);
			}
		
		if((p1.getX()==B1.getX())&&(p1.getY()==B1.getY())) {
			GameVariables.RedPion1Position=0;
			 B1.setBounds(108,257,25,25);
			}
		if((p1.getX()==B2.getX())&&(p1.getY()==B2.getY())) {
			GameVariables.RedPion2Position=0;
			 B2.setBounds(108,257,25,25);
			}
		if((p1.getX()==B3.getX())&&(p1.getY()==B3.getY())) {
			GameVariables.RedPion3Position=0;
			 B3.setBounds(108,257,25,25);
			}
		if((p1.getX()==B4.getX())&&(p1.getY()==B4.getY())) {
			GameVariables.RedPion4Position=0;
			 B4.setBounds(108,257,25,25);
			}
	}
}
