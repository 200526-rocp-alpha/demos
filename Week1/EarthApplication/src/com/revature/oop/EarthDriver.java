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
		// This is a test to show that I can push to GitHub
		
//		Animal thing1 = new Animal(3, "grey", 190.43);
//		thing1.eat();
		
		Bird bird1 = new Bird(2, "red", 30);
		bird1.eat();
		
		Bird pidgeon = new Bird(1, "greyish-blue", 2.2);
		pidgeon.sleep();
		
		Bird xyz = new Bird(3, "blue", 5);
		Bird eagle = new Bird(5, "white", 7.2);
		// Bird.fly();
		
		//Bird.fly();//.....this makes no sense. the methods are NOT static
		// a NON-STATIC must behave on an instantiated object.\\
		
		pidgeon.fly(); // only child classes can inherit methods and properties of the parent class.
		
		FlyingMammal bat = new FlyingMammal(1, "dark grey", 0.5);
		Bird parrot = new Bird(45, "green", 30.4);
		bat.fly();
		parrot.fly();
		
		// Animal blob = new Animal(1, "brown", 0.5);
		// You can't instantiate an Abstract class!!!!!
		
	}

}
