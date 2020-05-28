package com.revature.practice;

// we make this class ABSTRACT because it holds the shared properties
// of motorcycles, cars, and tractors.
public abstract class Vehicle {
	int wheels;
	String motor; // "Really loud motor"
	
	public abstract void drive();
	

}
