package Game;
//in this class we will create the coordinates for all of the case of the game board
import java.awt.List;
import java.util.Arrays;

import Game.Coordinates;
public class Lists {
//public static  Coordinates[] arrayY = new Coordinates[3];

	  //Yellow 4 initial coordinates
	    	 static Coordinates cordY1=new Coordinates(128 , 415 , 25 , 25);
	    	 static Coordinates cordY2=new Coordinates(192 , 415 , 25 , 25);
	    	 static Coordinates cordY3=new Coordinates(129 , 475 , 25 , 25);
	    	 static Coordinates cordY4=new Coordinates(192 , 475 , 25 , 25);
	  //Red 4 initial coordinates 
	    	 static Coordinates cordR1=new Coordinates(125 , 103 , 25 , 25);
	    	 static Coordinates cordR2=new Coordinates(188 , 103 , 25 , 25);
	    	 static Coordinates cordR3=new Coordinates(125 , 163 , 25 , 25);
	    	 static Coordinates cordR4=new Coordinates(188 , 163 , 25 , 25);
	  //Blue 4 initial coordinates 
	    	 static Coordinates cordB1=new Coordinates(438 , 419 , 25 , 25);
	    	 static Coordinates cordB2=new Coordinates(500 , 419 , 25 , 25);
	    	 static Coordinates cordB3=new Coordinates(438 , 479 , 25 , 25);
	    	 static Coordinates cordB4=new Coordinates(500 , 479 , 25 , 25);
	  //Green 4 initial coordinates 
	    	 static Coordinates cordG1=new Coordinates(435 , 106 , 25 , 25);
	    	 static Coordinates cordG2=new Coordinates(497 , 106 , 25 , 25);
	    	 static Coordinates cordG3=new Coordinates(434 , 164 , 25 , 25);
	    	 static Coordinates cordG4=new Coordinates(497 , 164 , 25 , 25);
	    	 
	    	 
	  //Principal path coordinates 
	    	 static Coordinates cord1=new Coordinates(310 , 526 , 25 , 25);
	    	 static Coordinates cord2=new Coordinates(275 , 526 , 25 , 25);
	    	 static Coordinates cord3=new Coordinates(280 , 493 , 25 , 25);
	    	 static Coordinates cord4=new Coordinates(280 , 457 , 25 , 25);
	    	 static Coordinates cord5=new Coordinates(280 , 425 , 25 , 25);
	    	 static Coordinates cord6=new Coordinates(280 , 390 , 25 , 25);
	    	 static Coordinates cord7=new Coordinates(280 , 360 , 25 , 25);
	 
	    	 static Coordinates cord8=new Coordinates(242 , 325 , 25 , 25);
	    	 static Coordinates cord9=new Coordinates(209 , 325 , 25 , 25);
	    	 static Coordinates cord10=new Coordinates(175 , 325 , 25 , 25);
	    	 static Coordinates cord11=new Coordinates(142 , 325 , 25 , 25);
	    	 static Coordinates cord12=new Coordinates(109 , 325 , 25 , 25);
	    	 static Coordinates cord13=new Coordinates(74 , 325 , 25 , 25);
	    	 static Coordinates cord14=new Coordinates(74 , 290 , 25 , 25);
	    	 static Coordinates cord15=new Coordinates(74 , 257 , 25 , 25);
	    	 static Coordinates cord16=new Coordinates(108 , 257 , 25 , 25);
	    	 static Coordinates cord17=new Coordinates(141 , 257 , 25 , 25);
	    	 static Coordinates cord18=new Coordinates(176 , 257 , 25 , 25);
	    	 static Coordinates cord19=new Coordinates(208 , 257 , 25 , 25);
	    	 static Coordinates cord20=new Coordinates(243 , 257 , 25 , 25);
	    	 
	    	 static Coordinates cord21=new Coordinates(277 , 222 , 25 , 25);
	    	 static Coordinates cord22=new Coordinates(277 , 187 , 25 , 25);
	    	 static Coordinates cord23=new Coordinates(277 , 155 , 25 , 25);
	    	 static Coordinates cord24=new Coordinates(277 , 122 , 25 , 25);
	    	 static Coordinates cord25=new Coordinates(277 , 87 , 25 , 25);
	    	 static Coordinates cord26=new Coordinates(277 , 50 , 25 , 25); 
	    	 static Coordinates cord27=new Coordinates(310 , 50 , 25 , 25);
	    	 static Coordinates cord28=new Coordinates(345 , 50 , 25 , 25);
	    	 
	    	 static Coordinates cord29=new Coordinates(345 , 85 , 25 , 25);
	    	 static Coordinates cord30=new Coordinates(345 , 120 , 25 , 25);
	    	 static Coordinates cord31=new Coordinates(345 , 155 , 25 , 25);
	    	 static Coordinates cord32=new Coordinates(345 , 190 , 25 , 25);
	    	 static Coordinates cord33=new Coordinates(345 , 225 , 25 , 25);
	    	 static Coordinates cord34=new Coordinates(380 , 258 , 25 , 25);
	    	 static Coordinates cord35=new Coordinates(414 , 258 , 25 , 25);
	    	 static Coordinates cord36=new Coordinates(447 , 258 , 25 , 25);  	 
	    	 static Coordinates cord37=new Coordinates(480 , 258 , 25 , 25);
	    	 static Coordinates cord38=new Coordinates(515 , 258 , 25 , 25);
	    	 static Coordinates cord39=new Coordinates(549 , 258 , 25 , 25);
	    	 
	    	 static Coordinates cord40=new Coordinates(549 , 292 , 25 , 25);
	    	 static Coordinates cord41=new Coordinates(549 , 323 , 25 , 25);
	    	 static Coordinates cord42=new Coordinates(515 , 323 , 25 , 25);
	    	 static Coordinates cord43=new Coordinates(480 , 323 , 25 , 25);
	    	 static Coordinates cord44=new Coordinates(448 , 323 , 25 , 25);
	    	 static Coordinates cord45=new Coordinates(413 , 323 , 25 , 25);
	    	 static Coordinates cord46=new Coordinates(380 , 323 , 25 , 25);
	    	 
	    	 static Coordinates cord47=new Coordinates(345 , 359 , 25 , 25);
	    	 static Coordinates cord48=new Coordinates(345 , 392 , 25 , 25);
	    	 static Coordinates cord49=new Coordinates(345 , 428 , 25 , 25);
	    	 static Coordinates cord50=new Coordinates(345 , 460 , 25 , 25);
	    	 static Coordinates cord51=new Coordinates(345 , 495 , 25 , 25);
	    	 static Coordinates cord52=new Coordinates(345 , 528 , 25 , 25);
	    	 
	    	 static Coordinates cord53=new Coordinates(310 , 526 , 25 , 25);
	    	 static Coordinates cord54=new Coordinates(275 , 526 , 25 , 25);
	    	 static Coordinates cord55=new Coordinates(280 , 493 , 25 , 25);
	    	 
	    
	    	
	    	 //final yellow path
	    	 static Coordinates cord56=new Coordinates(311 , 499 , 25 , 25);
	    	 static Coordinates cord57=new Coordinates(311 , 460 , 25 , 25);
	    	 static Coordinates cord58=new Coordinates(311 , 428 , 25 , 25);
	    	 static Coordinates cord59=new Coordinates(311 , 393 , 25 , 25);
	    	 static Coordinates cord60=new Coordinates(311 , 358 , 25 , 25);
	    	 static Coordinates cord61=new Coordinates(311 , 325 , 25 , 25);
	    	 
	    	 //final red path
	    	 static Coordinates cord63=new Coordinates(108 , 289 , 25 , 25);
	    	 static Coordinates cord64=new Coordinates(142 , 289 , 25 , 25);
	    	 static Coordinates cord65=new Coordinates(175 , 289 , 25 , 25);
	    	 static Coordinates cord66=new Coordinates(210 , 289 , 25 , 25);
	    	 static Coordinates cord67=new Coordinates(245 , 289 , 25 , 25);
	    	 static Coordinates cord68=new Coordinates(280 , 289 , 25 , 25);
	    	 
	    	 //final blue path
	    	 static Coordinates cord69=new Coordinates(515 , 289 , 25 , 25);
	    	 static Coordinates cord70=new Coordinates(483 , 289 , 25 , 25);
	    	 static Coordinates cord71=new Coordinates(448 , 289 , 25 , 25);
	    	 static Coordinates cord72=new Coordinates(413 , 289 , 25 , 25);
	    	 static Coordinates cord73=new Coordinates(380 , 289 , 25 , 25);
	    	 static Coordinates cord74=new Coordinates(347 , 289 , 25 , 25);
	    
	    	 //final green path
	    	 static Coordinates cord75=new Coordinates(311 , 86 , 25 , 25);
	    	 static Coordinates cord76=new Coordinates(311 , 120 , 25 , 25);
	    	 static Coordinates cord77=new Coordinates(311 , 155 , 25 , 25);
	    	 static Coordinates cord78=new Coordinates(311 , 190 , 25 , 25);
	    	 static Coordinates cord79=new Coordinates(311 , 223 , 25 , 25);
	    	 static Coordinates cord80=new Coordinates(311 , 255 , 25 , 25);
	    	
	    	 //Principal color's paths without initial place
	    	 //we create 4 array (yellow, red, green, blue) with the positions.
             public static  Coordinates[] arrayY = new Coordinates[] {cord3,cord4,cord5,cord6,cord7,cord8,cord9,cord10,cord11,cord12,cord13,cord14,cord15,cord16,cord17,cord18,cord19,cord20,cord21,cord22,cord23,cord24,cord25,cord26,cord27,cord28,cord29,cord30,cord31,cord32,cord33,cord34,cord35,cord36,cord37,cord38,cord39,cord40,cord41,cord42,cord43,cord44,cord45,cord46,cord47,cord48,cord49,cord50,cord51,cord52,cord53,cord56,cord57,cord58,cord59,cord60,cord61};
             public static  Coordinates[] arrayR = new Coordinates[] {cord16,cord17,cord18,cord19,cord20,cord21,cord22,cord23,cord24,cord25,cord26,cord27,cord28,cord29,cord30,cord31,cord32,cord33,cord34,cord35,cord36,cord37,cord38,cord39,cord40,cord41,cord42,cord43,cord44,cord45,cord46,cord47,cord48,cord49,cord50,cord51,cord52,cord53,cord54,cord55,cord4,cord5,cord6,cord7,cord8,cord9,cord10,cord11,cord12,cord13,cord14,cord63,cord64,cord65,cord66,cord67,cord68};
             public static  Coordinates[] arrayG = new Coordinates[] {cord29,cord30,cord31,cord32,cord33,cord34,cord35,cord36,cord37,cord38,cord39,cord40,cord41,cord42,cord43,cord44,cord45,cord46,cord47,cord48,cord49,cord50,cord51,cord52,cord53,cord54,cord55,cord4,cord5,cord6,cord7,cord8,cord9,cord10,cord11,cord12,cord13,cord14,cord15,cord16,cord17,cord18,cord19,cord20,cord21,cord22,cord23,cord24,cord25,cord26,cord27,cord75,cord76,cord77,cord78,cord79,cord80};
             public static  Coordinates[] arrayB = new Coordinates[] {cord42,cord43,cord44,cord45,cord46,cord47,cord48,cord49,cord50,cord51,cord52,cord53,cord54,cord55,cord4,cord5,cord6,cord7,cord8,cord9,cord10,cord11,cord12,cord13,cord14,cord15,cord16,cord17,cord18,cord19,cord20,cord21,cord22,cord23,cord24,cord25,cord26,cord27,cord28,cord29,cord30,cord31,cord32,cord33,cord34,cord35,cord36,cord37,cord38,cord39,cord40,cord69,cord70,cord71,cord72,cord73,cord74};
	    	 
       
}