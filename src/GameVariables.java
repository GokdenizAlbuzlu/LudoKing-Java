package Game;
//here we are creating all of the variables in static that we will use during the game
//we declare them in static to reuse them everywhere in our program
public class GameVariables {
	public static int random_integer_player;		//this 4 random variables will correspond to the dice throw for the Solo mod and for the multiplayer mod
	public static int random_integer_ia1;
	public static int random_integer_ia2;
	public static int random_integer_ia3;
	
	public static int pionsontheboardyellow=0;	//this is a counter, it will counts the number of pions out the square for each player
	public static int pionsontheboardred=0;
	public static int pionsontheboardgreen=0;
	public static int pionsontheboardblue=0;
												//the next 16 variables are creating to make the moves
	public static int RedPion1Position=0;		//we will stock the position of the first red pion
	public static int RedPion2Position=0;		//second red pion
												//etc...
	public static int RedPion3Position=0;
	public static int RedPion4Position=0;
	
	public static int YellowPion1Position=0;
    public static int YellowPion2Position=0;
	public static int YellowPion3Position=0;
	public static int YellowPion4Position=0;
	
	public static int GreenPion1Position=0;
	public static int GreenPion2Position=0;
	public static int GreenPion3Position=0;
	public static int GreenPion4Position=0;
	
	public static int BluePion1Position=0;
	public static int BluePion2Position=0;
	public static int BluePion3Position=0;
	public static int BluePion4Position=0;
	
}
