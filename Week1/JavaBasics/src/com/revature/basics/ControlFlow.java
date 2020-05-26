package com.revature.basics;

public class ControlFlow {

	public static void main(String[] args) {
		// IF/ELSE Statements
		
		boolean hungry = false; // we will toggle this
		
		boolean niceSmells = true;
		int hungerLevel = 3;
		
		if (hungerLevel > 5 || niceSmells) {
			// some code happens
			System.out.println("Man, I'm starvin'...");
		} else {
			System.out.println("I'm good."); 
		}
		
		int favoriteTemp = 72;
		int currentTemp = 20;
		String statement;
		
		if (currentTemp < favoriteTemp) { 
			statement = "It's too cold";
		} else if (currentTemp > favoriteTemp) {
			statement = "It's way too hot!";
		} else if (currentTemp == favoriteTemp) {
			statement = "It's just perfect";
		} else {
			statement = "I'm not sure";
		}
		System.out.println(statement);
		
		// **************SWITCH STATEMENTS *********
		
		int month = 10;
		String monthName;
		
		
		switch(month) {
		case 10: monthName = "January";
			break;
		case 5: monthName = "Feb";
			break;
		case 3: monthName = "March";
			break;
		case 4: monthName = "April";
			break;
		default: monthName = "Too lazy to write out that month name";
			break;
		}
		
		System.out.println("The month is: " + monthName);
		
		
	}

	
	
	

}
