package com.revature.practice;

public class Car extends Vehicle {

	// since Car extends Vehicle, it has 
	// int wheels
	// String motor; ... we don't see this because it's abstracted away.
	
	@Override            // Overriding a method is an example of Polymorphism  
	public void drive() {
		System.out.println("Drives smoothly along the roads.");
		
	}
	
	// now we are overloading the method
	// another example of Polymorphism is overloading
	public void drive(int miles) {
		System.out.println("the car just drove " + miles + "miles.");
	}
}
