package com.SnakeLadder.java;

public class SnakeLadder {
	
	static int startingPosition = 0;
	static int endingPosition = 100; 
	static int option;
	static int number_on_dice;
	static int position_of_player = 0;
	
    public int playerRolls() {
    	System.out.println(" Player Rolls the Dice ");
		int number = (int)((Math.random() * 10 ) % 6 + 1 ) ;
		System.out.println(" Number came on dice : "+ number);
		return number;
	}
    
    public void play() {
    	number_on_dice=playerRolls();
    	option = (int)(Math.random() * 10) % 3;
    	switch (option){	
    	case 0:
    	     System.out.println(" Ladder ");
    	     int a = position_of_player;
    	     position_of_player = position_of_player + number_on_dice;
    	     if (position_of_player > 100){   //UC5
	        	  position_of_player = a;
	        	   break;
	            }else {
	            	System.out.println(" Ladder Position is "+  position_of_player);
	            }     
    	  
    	     break;
    	    
    	case 1:     
    	     System.out.println(" Snake ");
    	     position_of_player =  position_of_player - number_on_dice;
	    	   if( position_of_player < 0)
	    	   {
	    		   position_of_player = 0;
	    	   } 
	    	 System.out.println(" Snake Position is "+  position_of_player);

    	     break;
    	
    	case 2:
    		 if( position_of_player < 0)
	           {
		            position_of_player = 0;
	              } 
	          System.out.println(" No position "+  position_of_player);
	          break;
    		  
    	   	}    	
    }

	public static void main(String[] args) {
		
		SnakeLadder dice = new SnakeLadder();
		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println(" Player at Starting Position:"+ startingPosition);
		System.out.println();
		while ( position_of_player < endingPosition ) {
		dice.play();
		System.out.println();
		}
	}

}
