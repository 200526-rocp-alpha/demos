package com.revature.oop;

public class Bird extends Animal implements Flyable {

	public Bird(int age, String color, double weight) {
		super(age, color, weight);
	}
	
	// Bird has automatically inherited the sleep() and eat() methods.
	// This is because Animal is the parent class of Bird.
	
	@Override // this is an example of Polymorphism -- we are overriding a method.
	public void fly() {
		System.out.println("It ruffles its feathers and soars through the sky");
		
	}
	
	
}
