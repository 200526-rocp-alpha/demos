package com.revature.librariesdemo;

import java.util.*; // * indicates that I've i've imported everything, 

import com.revature.anotherpackage.MyUtils;
// everything within

// packages > classes > methods

public class Driver {
	
	public static void main(String[] args) {
		
		// initialize an array with 5 spaces.
		int[] values = new int[5]; // _0_ _1_ _2_ _3_ _4_ 
		
		for(int i=0; i<=values.length-1; i++) {
			values[i] = i + 1; // here I am am assigning values to a particular index
			//System.out.println(values[i]); //here I'm printing it out
		}
		// objects within Java have methods that you can invoke
		String s = "cat";
		//System.out.println("The length of s is : " + s.length());
		
		int[] numbers = {42, 106, 87, 2, 0};
		
		System.out.println(numbers);
		// what if I want to print out the Array AS A STRING
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers); // now I'm invoking the sort() method from the Arrays class
		
		System.out.println(Arrays.toString(numbers));
		
		// now we will use the method we just created
		// I want to use our addAThousadn method...
		
		// create a Scanner object to take in user input and then invoke the addAThousand method to it.	
		int n = MyUtils.addAThousand(12); // this works because we've imported it.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("My number plus 1000 is: " + n);
		
	}
	

}
