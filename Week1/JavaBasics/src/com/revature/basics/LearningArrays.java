package com.revature.basics;

import java.util.Arrays;

public class LearningArrays {

	public static void main(String[] args) {
		// an int or a String can store a single value...
		// we use ARRAYS to store multiple values
		/**
		 * an ARRAY is a way to store a collection of elements
		 * an ARRAY can only store one type of data
		 * 
		 */
		
		int[] values = new int[10];
		// 1. we declare that the array only stores INTEGERS
		// 2. we INITIALIZE the array with a certain capacity
		
		values[0] = 1;
		values[1] = 2;
		
		 //_0_ _1__ _2__ _3__ _4___ _5__ _6_ _7__ _8__ _9_
		System.out.println("This is the first element " + values[0]);
		System.out.println("This is the second element " + values[1]);
		
		// how do we create a String array with 5 spaces?
		String[] words = new String[5]; // arrays are static in size
		words[0] = "dog";
		words[1] = "cat";
		words[2] = "elephant";
		words[3] = "mouse";
		
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(values));
		
		String[] anotherArray = {"Hello", "My", "name", "is"};
		
		System.out.println(Arrays.toString(anotherArray));
		String[] fullname = new String[] {"Uladzislau","Shoka"};
		System.out.println(fullname[0]);
		
		// System.out.println(words[6]);
		
		String lastname = fullname[1];
		System.out.println(lastname);
		
		lastname = lastname + "agfghasf";
		System.out.println(lastname);
		System.out.println(fullname[1]);
		
	}

}
