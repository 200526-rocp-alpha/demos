package com.revature.practice;

public class Car extends Vehicle {

	boolean sunroof;
	String steroBrand;
	
	// since Car extends Vehicle, it has:
	// int wheels
	// String motor; ... we don't see this because it's abstracted away.
	

	@Override            // Overriding a method is an example of Polymorphism  
	public void drive() {
		System.out.println("Drives smoothly along the roads.");
		
	}
	
	// now we are overloading the method
	// another example of Polymorphism is overloading (changing the amount of arguments_
	public void drive(int miles) {
		System.out.println("the car just drove " + miles + "miles.");
	}
	
	public Car(int wheels, String motor, boolean sunroof, String steroBrand) {
		super(wheels, motor);    // This is an example of inheritance! 
		this.sunroof = sunroof;
		this.steroBrand = steroBrand;
	}
	
}
