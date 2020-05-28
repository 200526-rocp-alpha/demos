package com.revature.practice;

public class Driver {

	public static void main(String[] args) {
		System.out.println("I'm in the main method!");

		Car porsche = new Car(4, "quiet", true, "Bose Stereo");
		porsche.drive();
		
		Motorcycle kawasaki = new Motorcycle(2, "loud", "purple");
		kawasaki.drive();
		
		Car hond = new Car(0, null, false, null);
	}

}
