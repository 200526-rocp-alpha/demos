package com.revature.practice;

import java.util.Random;
import java.util.Scanner;

public class Driver {

	
	// Let's generate some random numbers!
	
	/**
	 *  You can use....
	 * -- Math class comes from java.lang.Math
	 * -- Random class comes from java.util.Random
	 */
	
	
	public static void main(String[] args) {

		// java.lang.Math lends us methods like random()
		// java.util.Random but be instantiated but it also gives us a nextInt() method
		System.out.println(getWholeRandomNumber());
		System.out.println(getRandomNumber());
		
		System.out.println(getRangedRandomNumber(2,6));
		
		System.out.println(generateRandomClassInt(142));
		
		System.out.println(generateRandomClassRangedInt(4, 10));
		
		guessingGame();


	}
	
	// completed guessing game to demo boolean logic + randomNumbers using range.
	public static void guessingGame() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a range!");
		System.out.println("Min: ");
		int x = scan.nextInt();
		System.out.println("Max: ");
		int y = scan.nextInt();
		
		int z = getRangedRandomNumber(x, y);
		
		System.out.println("Guess a number!");
		int guess = scan.nextInt();
		
		if (guess == z) {
			System.out.println("Correct, the answer was " + z + "!");
		} else {
			System.out.println("Sorry, the answer was " + z + " but you guessed " + guess + ".");
		}
	}
	
	// this is what happens when we use the Math class to
	// generate a random number
	
	public static double getRandomNumber() {
		double x = Math.random();
		return x; //  < 1.0 and > 0.0;
		
	}
	
	public static int getWholeRandomNumber() {
		double y = (Math.random() * 10); // think 0.79 * 10 ... 7.9...7
		int x = (int) y;
		
		System.out.println("The value of the previous double y is: " + y);
		return x; // when you cast to int, it automatically truncates and rounds DOWN
	}
	
	// 2 - 6
	public static int getRangedRandomNumber(int min, int max) {
		
		return (int) (Math.random() * ((max-min) + 1)) + min; 

		// what do we import to access the Math class and use random()
		// java.lang.Math
	}
	
	public static int generateRandomClassInt(int upperRange) {
		// Random comes from java.util.Random !!!!!!!!!!
		
		Random random = new Random();
		int x = random.nextInt(upperRange);
		
		return x;
		
	}
	
	// this is a new feature in Java 8 >> its called the ints() method
	public static int generateRandomClassRangedInt(int min, int max) {
		Random random = new Random();
		 
		int x = random.ints(min, (max +1)).findFirst().getAsInt();
		return x;
	}
	
	// Autoboxing....
	// it's when you use the Wrapper Class Integer.parseInt()
	// ... or Integer.vaueOf().....
	
	
	
	
	
	
	

}
