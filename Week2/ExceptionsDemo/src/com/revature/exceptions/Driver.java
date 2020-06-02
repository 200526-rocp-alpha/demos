package com.revature.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
//		System.out.println(divider(10, 0)); // should print 5
//		
//		System.out.println(dividerLBYL(10, 0));
		
		System.out.println(dividerEAFP(10, 5));
		
		System.out.println(getANumberEAFP());
		
		System.out.println("I made it!");

	}
	
	// There are two approaches to dealing with errors/exceptions
	// 1. LBYL approach: test that an object is not null before we deal with it
	// 2. EAFP approach: perform an operation and then respond with an exception
		// we use a try/catch block in this scenario
	
	public static int divider(int x, int y) {
		return x/y;
	}
	
	// 1. LBYL approach
	public static int dividerLBYL(int x, int y) {
		// we are going to set up some control flow/ logic
		if (y != 0) {
			return x/y;
		} else {
			System.out.println("Sorry! No 0's allowed.");
			return 0;
		}
	}
	
	// 2. EAFP approach
	public static int dividerEAFP(int x, int y) {
		// in this approach TRY a certain block of code, and then CATCH the exception
		try {
			return x/y;
		} catch (ArithmeticException e) { // InputMismatchExcption
			System.out.println(e);
			return 0;
		} finally { // finally will always run!
			System.out.println("I finally made it too!");
			// finally block is used to clean up / close resources
			// i.e scan.close(), connection.cl
		}
		
	}
	
	public static int getANumberLBYL() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer!");
		
		String input = scan.next();
		
		boolean isANumber = true;
		
		for(int i=0; i<input.length(); i++) {
			if(!Character.isDigit(input.charAt(i))) {
				isANumber = false;
			}
		}
		
		if(isANumber) {
			return Integer.parseInt(input);
		} else {
			System.out.println("That wasn't a number silly!");
			return 0;
		} // WOOF that's a lot of code.
	}
	
	public static int getANumberEAFP() { // using an Exception is much easier
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer!");
		
		try {
			return scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("That wasn't a number, silly!");
			return 0;
		}
		
	}

}
