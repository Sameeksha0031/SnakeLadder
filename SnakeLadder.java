package com.SnakeLadder.java;
import java.util.Scanner;

public class SnakeLadder {
	
	static int startingPosition = 0;
	static int endingPosition = 100; 
	static int option;
	static int number_on_dice;
	static int position_of_playerA = 0;
	static int position_of_playerB = 0;
	
    public int playerRolls() {
    	System.out.println(" Player Rolls the Dice ");
		int number = (int)((Math.random() * 10 ) % 6 + 1 ) ;
		System.out.println(" Number came on dice : "+ number);
		return number;
	}
    
    public void playA() {
    	number_on_dice=playerRolls();
    	option = (int)(Math.random() * 10) % 3;
    	switch (option){	
    	case 0:
    	     System.out.println(" Ladder ");
    	     int a = position_of_playerA;
    	     position_of_playerA = position_of_playerA + number_on_dice;
    	     if (position_of_playerA > 100){   
	        	  position_of_playerA = a;
	        	   break;
	            }else {
	            	System.out.println(" Player A Position is "+  position_of_playerA);
	            }     
    	  
    	     break;
    	    
    	case 1:     
    	     System.out.println(" Snake ");
    	     position_of_playerA =  position_of_playerA - number_on_dice;
	    	   if( position_of_playerA < 0)
	    	   {
	    		   position_of_playerA = 0;
	    	   } 
	    	 System.out.println(" Player A Position is "+  position_of_playerA);

    	     break;
    	
    	case 2:
    		 if( position_of_playerA < 0)
	           {
		            position_of_playerA = 0;
	              } 
	          System.out.println(" No move "+  position_of_playerA);
	          break;
    		  
    	   	}    	
    }
    
    public void playB() {
    	number_on_dice=playerRolls();
    	option = (int)(Math.random() * 10) % 3;
    	switch (option){	
    	case 0:
    	     System.out.println(" Ladder ");
    	     int a = position_of_playerB;
    	     position_of_playerB = position_of_playerB + number_on_dice;
    	     if (position_of_playerB > 100){   
	        	  position_of_playerB = a;
	        	   break;
	            }else {
	            	System.out.println(" Player B Position is "+  position_of_playerB);
	            }     
    	  
    	     break;
    	    
    	case 1:     
    	     System.out.println(" Snake ");
    	     position_of_playerB =  position_of_playerB - number_on_dice;
	    	   if( position_of_playerB < 0)
	    	   {
	    		   position_of_playerB = 0;
	    	   } 
	    	 System.out.println(" Player B Position is "+  position_of_playerB);

    	     break;
    	
    	case 2:
    		 if( position_of_playerB < 0)
	           {
		            position_of_playerB = 0;
	              } 
	          System.out.println(" No move"+  position_of_playerB);
	          break;
    		  
    	   	}    	
    }

	public static void main(String[] args) {
		
		SnakeLadder dice = new SnakeLadder();
		int no_of_times_dice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println(" Player at Starting Position:"+ startingPosition);
		System.out.println();
		System.out.println("Player A input -> 1 \nPlayer B input -> 0");
		while ( position_of_playerA < endingPosition && position_of_playerB <  endingPosition) {
			int turn = sc.nextInt();
		    System.out.println(" ");
		   // no_of_times_dice++; 
		    if(turn == 1) {
		    	dice.playA();
		    }
		    if(turn == 0) {
		    	dice.playB();
		    }
		System.out.println();
		}
		
		if(position_of_playerA == position_of_playerB) {
			  System.out.println("Game Tie..... ");
		 }else if(position_of_playerA > position_of_playerB) {
			 System.out.println("Player 1 wins");
		 }else {
			 System.out.println("Player 2 wins");
		 }
		
	}

}
