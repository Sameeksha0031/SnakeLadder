package com.SnakeLadder.java;

public class SnakeLadder {
	
	static int startingPosition = 0;
	static int endingPosition = 100; 
	static int option;
	static int number_on_dice;
	
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
    	     startingPosition = startingPosition + number_on_dice;
    	     System.out.println(" Player Move "+ number_on_dice );
    	  
    	     break;
    	    
    	case 1:     
    	     System.out.println(" Snake ");
    	     startingPosition = startingPosition - number_on_dice;
    	     if(startingPosition < 0)
    	    	   {
    	    		   startingPosition = 0;
    	    	   } 
    	     System.out.println(" Player Move behind "+ number_on_dice+ " steps"  );

    	     break;
    	
    	case 2:
    		     if(startingPosition < 0)
     	         {
     		       startingPosition = 0;
     	         } 
     	            System.out.println(" No Move");
    		  
    	    	}    	
    }

	public static void main(String[] args) {
		
		SnakeLadder dice = new SnakeLadder();
		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println(" Player at Starting Position:"+ startingPosition);
		System.out.println();
		dice.play();
	}

}
