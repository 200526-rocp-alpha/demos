package com.revature.collections;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// Collections Framework also called the Collections API 
		// a collection is group of individual objects
		// 2 problems with arrays: 1. static size , 2. only 1 datatype can be stored within it
		// int[] 1, 2, 3, 4, String[] "hello", "rug", "desk";
		
		// A common solution to an array is to create an ArrayList
		
		ArrayList words = new ArrayList(); // we are implementing the Collection Framework
		words.add("tiger");
		words.add("elephant");
		words.add("hello");
		
		words.add(32);
		words.add(42);
		
		System.out.println(words);
		// to retrieve we use the .get();
		System.out.println("The second element is: " + words.get(1));
		
		// we must use CASTING to specify the data type that we're retrieving and storing in a variable
		int e = (int) words.get(3);
		System.out.println("Our int is: " + e);
		
		ArrayList<Integer> myIntegers = new ArrayList<Integer>();
		myIntegers.add(23);
		myIntegers.add(34);
		myIntegers.add(103);
		
		for (int i=0; i<myIntegers.size(); i++) {
			System.out.println("the int in my ArrayList is: " + myIntegers.get(i));
		}
 
	}

}
