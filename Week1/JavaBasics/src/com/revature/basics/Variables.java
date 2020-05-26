package com.revature.basics;

public class Variables {
	
	public static void main(String[] args) {
		// a variable is where you store data
		
		// x = 10; // = is an ASSIGNMENt operator
		// Java is a strongly typed language
		// Primitive data types are like buckets of reserved memory
		int x = 10;
		String word = "Sophia";
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("Maximum value is: " + max);
		System.out.println("Minimum value is: " + min);
		
		//int y = 10000000000000;
		
		// shortcut for System.out.println();
		//sout + ctrl + space
		
		byte reallySmallNumber = 127; // 8 bits of reserved memory
		short shortNumber = 32767; // 16 bits of memory
		int var = 1000000000; // 32 bits of memory
		//long bigNumber = 2,147,483L; // 64 bits of memory;
		long yzx = 1231233339L; // 64 bits 
		
		float anotherNumber = 753; // 32 bits of mem;
		double balance = 22.53;
		
		char letter = 'f'; // 16 bits of memory;
		boolean isDecision = true; //1 bit of memory
		
		String myWord = "This is my word";
		System.out.println(myWord);
		
		
		String one = "1";
		int oneInt = Integer.parseInt(one);
		System.out.println(one);
		
		int n = 1;
		System.out.println(n);
		
		System.out.println(n + oneInt);
		// Challenge: find a method to convert our value one (of type String) to an int.
		// The print the value of n + one --> 2 The result should be 2
		
		
	}
	
}
