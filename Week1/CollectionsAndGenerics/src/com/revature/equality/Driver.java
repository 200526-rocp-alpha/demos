package com.revature.equality;

public class Driver {
	
	public static void main(String[] args) {
		// both equals() and == are used to compare 2 objects
		// -- .equals() is a method that checks for CONTENT (Content Comparison)
		// -- == is and operator that checks for the object's ADDRESS in the heap
		
		String s1 = new String("DOG");
		String s2 = new String("DOG");  // a new object is NOT created...
		
		// The below print statements will print either true or false determining if the two are equal
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		// LEARN THIS!!!!!!!!!!!!!!
	}

}
