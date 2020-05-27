package com.revature.oop;

public interface Flyable {

	// whatever implements this interface, MUST implement the methods defined
	// Interfaces are named after the functionality we are trying to abstract away
	
	// INTERFACES ONLY HAVE ABSTRACT METHODS -- it's an abstraction of a general idea of a method
	// in an abstract class, there's no body 
	
	public void fly();
	
	// a class can implement multiple interfaces
	// a class can only EXTEND 1 class
	// interfaces are java's solution to multiple inheritance
	
}
