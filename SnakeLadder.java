package com.SnakeLadder.java;

public class SnakeLadder {
	
	static int startingPosition = 0;
	static int endingPosition = 100; 
	
    public int playerRolls() {
    	System.out.println(" Player Rolls the Dice ");
		int number = (int)((Math.random() * 10 ) % 6 + 1 ) ;
		System.out.println(" Number came on dice : "+ number);
		return number;
		
	}

	public static void main(String[] args) {
		
		SnakeLadder dice = new SnakeLadder();
		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println(" Player at Starting Position:"+ startingPosition);
		System.out.println();
		dice.playerRolls();
	}

}
