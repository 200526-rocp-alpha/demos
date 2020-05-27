package com.revature.oop;

public class EarthDriver {
	
	public static void main(String[] args) {
		// we will have humans and animals doing things on Earth!
		// First, we will create the blueprint (Class) for a human.
		// Then, we will create the blueprint (Class) for an animal

		System.out.println("There's nobody here!");
		
		Human person1 = new Human(); // the NEW keyword is what we use to call the constructor to instantiate a new obj
		//person1.eat();
		// person1 is a VARIABLE of type Human --> this object is now stored in the HEAP
		// the reference variable "person1" points to this particular object.
		
		person1.name = "Bob";
		person1.age = 34;
		person1.hairColor = "brown";
		person1.superPower = "nice hand-writing";
		
		// Bob has an older brother who is so much cooler.
		// Bob's older brother has purple hair and a cool superpower.
		
		Human person2 = new Human();
		person2.name = "Andy";
		person2.age = 40;
		person2.hairColor = "purple";
		person2.superPower = "flying";
		
		
		System.out.println("Person2's name is " + person2.name);
		
		Human person3 = new Human();
		System.out.println(person3.name);
		System.out.println(person3.age);
		
//		System.out.println(person2);
//		System.out.println(person1);
		
		Human person4 = new Human("Sally", 20, "red", "telepathy");
	
		person4.speak(); // I want the speak method to return the name of the Human object that's calling it.
		person1.speak();
		person3.speak();
		
	}

}
