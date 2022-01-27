package Game;

import javax.swing.JButton;
//this class is a very simple class to disabled or enabled the buttons.
public class InsideGameRules {
	public static void NotOurTurn(JButton p1,JButton p2,JButton p3,JButton p4) {//if it is not our turn in the game we have to block the buttons so we cannot click on them
		p1.setEnabled(false);
		p2.setEnabled(false);
		p3.setEnabled(false);
		p4.setEnabled(false);
	}
	public static void OurTurn(JButton p1,JButton p2,JButton p3,JButton p4) {		//if it is our turn we can enable them
		p1.setEnabled(true);
		p2.setEnabled(true);
		p3.setEnabled(true);
		p4.setEnabled(true);
	}
	public static void verifySixPlayer(JButton p1,JButton p2,JButton p3,JButton p4,int playerthrow) {	//same thing, if the player throw a 6 we must enable all of the pions
		if(playerthrow==6) {
			p1.setEnabled(true);
			p2.setEnabled(true);
			p3.setEnabled(true);
			p4.setEnabled(true);
		}
	}
}
