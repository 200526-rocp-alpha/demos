package com.revature.continuedbasics;

public class MethodsContinued {

	public static void main(String[] args) {
		//myPrintMethod("Hello there this is a random String!");

		
		String x = MyMethods.myStringyMethod("supercalifragilisticexpialidious");
		// default access modifiers allow access to methods and properties within
		// the same package
		
		int n = MyMethods.addNumbers(50, 100);
		
		System.out.println(x);
		
		int num = MyMethods.addNumbers(10, 20);
		System.out.println(num);
		
	}
}
