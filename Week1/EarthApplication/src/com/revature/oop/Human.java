package com.revature.oop;

// OOP (Object Oriented Programing) is all about the objects!
// Objects do the WORK in software applications (people walk, animals eat, trees grow)
// Similarly Objects have a behavior (called a method) that we ASK them to perform.

// A Class is a blueprint for an object
// a class is a template used to create objects and to define properties
// classes also contain instructions for how objects can be created (constructors)
// A class, instantiates an object (Class > object)

public class Human {
	
	String name;
	int age;
	String hairColor;
	String superPower;
	
	// If we want to create a Human, we need to include a constructor...
	// A default (no args constructor) constructor is created if we don't specify one (by the compiler).

	public Human() { // we recreated the default/ no-args constructor
		
	}
	
	public Human(String name, int age, String hairColor, String superPower) {
		super(); // the super keyword inherits the properties of the parent class
		this.name = name;
		this.age = age;
		this.hairColor = hairColor;
		this.superPower = superPower;
	}



	public void speak() {
		System.out.println("Hello there, my name is " + this.name); // reference a property of the object that's invoking speak()
		// make them say "Hello there, my name is _______ "
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void work() {
		System.out.println("Working...");
	}

}
