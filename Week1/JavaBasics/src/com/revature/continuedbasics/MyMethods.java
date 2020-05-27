package com.revature.continuedbasics;

public class MyMethods {
	
	
	static void myPrintMethod(String word) { // void methods return nothing .... they just do something
		System.out.println(word);
	}
	
	static String myStringyMethod(String word) { // this must RETURN a value of type String
		return word + " is my word.";
	}
	
	static int addNumbers(int x, int y) {
		return x + y;
	}

}
