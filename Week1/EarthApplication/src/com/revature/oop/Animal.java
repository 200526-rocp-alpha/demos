package com.revature.oop;

//an ABSTRACT CLASS can ONLY be extended --> it is meant to be a parent\
// Abstract Classes canNOT be instantiated.

public abstract class Animal {
	int age;
	String color;
	double weight;
	
	// this is our constructor
	public Animal(int age, String color, double weight) {
		super();
		this.age = age;
		this.color = color;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Zzz...");
	}
	
}
