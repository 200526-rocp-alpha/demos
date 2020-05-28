package com.revature.practice;

public class Motorcycle extends Vehicle {

	String handleBarColor;
	
	@Override
	public void drive() {
		System.out.println("Zooming down the road");
		
	}

	public Motorcycle(int wheels, String motor, String handleBarColor) {
		super(wheels, motor);
		this.handleBarColor = handleBarColor;
	}
	
}
