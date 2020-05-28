package com.revature.practice;

public class Tractor extends Vehicle {

	double sizeOfScooperInCubicFeet;
	
	// public, default, private, protected = access modifiers
	// abstract, static, final, synchronized = non access modifiers
	// void is a keyword - it determines the return type.
	@Override
	public void drive() { 
		System.out.println("Just pickin' up some dirt");
		
	}

	public Tractor(int wheels, String motor, double sizeOfScooperInCubicFeet) {
		super(wheels, motor);
		this.sizeOfScooperInCubicFeet = sizeOfScooperInCubicFeet;
	}


}
