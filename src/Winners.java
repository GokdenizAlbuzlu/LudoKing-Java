package Game;

import javax.swing.JButton;
import javax.swing.JOptionPane;
//this class allow us to verify if there is a winner, indeed we verify if 4 pions of a colour are in the home safe area
public class Winners {
	public static void  YellowWin(JButton p1,JButton p2,JButton p3,JButton p4) {
		if((p1.getX()==311) && (p1.getY()==325)) {						//(311 and 325 are the home safe area coordinates for the yellow player for instance)
			if((p2.getX()==311) && (p2.getY()==325)) {
				if((p3.getX()==311) && (p3.getY()==325)) {
					if((p4.getX()==311) && (p4.getY()==325)) {	
						JOptionPane.showMessageDialog(null,"Yellow player wins");	//if all of this pions are in 311 and 325 the yellow player win the game
						System.exit(0);
					}
				}
			}
			
		}
	}
	public static void  RedWin(JButton p1,JButton p2,JButton p3,JButton p4) {	//the same method for the red player
		if((p1.getX()==280) && (p1.getY()==289)) {
			if((p2.getX()==280) && (p2.getY()==289)) {
				if((p3.getX()==280) && (p3.getY()==289)) {
					if((p4.getX()==280) && (p4.getY()==289)) {
						JOptionPane.showMessageDialog(null,"Red player wins");
						System.exit(0);
					}
				}
			}
			
		}
	}
	public static void  GreenWin(JButton p1,JButton p2,JButton p3,JButton p4) {	//same method for the green player
		if((p1.getX()==311) && (p1.getY()==255)) {
			if((p2.getX()==311) && (p2.getY()==255)) {
				if((p3.getX()==311) && (p3.getY()==255)) {
					if((p4.getX()==311) && (p4.getY()==255)) {
						JOptionPane.showMessageDialog(null,"Green player wins");
						System.exit(0);
					}
				}
			}
			
		}
	}
	public static void  BlueWin(JButton p1,JButton p2,JButton p3,JButton p4) {		//same method for the blue player
		if((p1.getX()==347) && (p1.getY()==289)) {
			if((p2.getX()==347) && (p2.getY()==289)) {
				if((p3.getX()==347) && (p3.getY()==289)) {
					if((p4.getX()==347) && (p4.getY()==289)) {
						JOptionPane.showMessageDialog(null,"Blue player wins");
						System.exit(0);
					}
				}
			}
			
		}
	}
}
