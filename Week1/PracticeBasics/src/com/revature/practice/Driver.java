package com.revature.practice;

import java.util.Scanner;
// you can also import with ctrl + shift + o
public class Driver {

	public static void main(String[] args) { // shortcut for main method is: typ main, press ctrl + space, enter
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello! Please enter your name: ");
		String name = scan.nextLine(); // the nextLine() method captures a value that we want to store in a variable
		
		System.out.println("What's your favorite color?");
		String color = scan.nextLine(); // we use next line for Strings
		
		System.out.println("How old are you?");
		int age = scan.nextInt(); // we use nextInt() to capture Integers...nextDouble() to capture doubles
		
		scan.close(); // it is best practice to close our scanner.

		System.out.println("Hi, " + name + " you are " + age + " years old and youre favorite color is " + color + "."); // this will print our captured value.
		
		char m = 'm'; // single quotes denotes a Character, double quotes denotes a String.
	}

}
