package com.revature.continuedbasics;

public class ForLoops {

	public static void main(String[] args) {
		int[] values = new int[100]; // capacity = 100, 0-99
		
		values[50] = 50;
		
		// System.out.println(values[50]);
		
		// for loop
		/** The 3 steps to make a for loop:
		 * 1. Initialize the variable
		 * 2. Set the termination condition
		 * 3. Increment & reset the variable
		 * 
		 * -- execute code to be performed
		 */
		
		for(int i=0; i<= values.length-1; i++) { // our values array does not have a 100th index
			values[i] = i + 1; // assign values
			//System.out.println(values[i]);	// print the values
		}

//		for(int i=49; i<=values.length-1; i++) { //this prints 50 - 100
//			values[i] = i + 1;
//			System.out.println(values[i]);
//		}
		
		// Challenge: create a for loop to only print even numbers in the values array.
//		
int[] newValues = new int[100]; 
//		for(int i=0; i<=values.length-1; i += 2) {
//			newValues[i] = i;
//			System.out.println(newValues[i]);
			// i only want to print our even numbers
			
//			if(newValues[i] % 2 == 0) {
//				
//				System.out.println(newValues[i]);
//			}
		
		
	  	for (int i=0; i<100; i++) {
	   		newValues[i] = i+2;
	   	System.out.println(newValues[i]);
	  		
	  	}

		
		
		
		
		
	}

}
