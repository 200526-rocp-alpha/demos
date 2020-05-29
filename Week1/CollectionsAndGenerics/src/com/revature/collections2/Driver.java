package com.revature.collections2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// 1. We will create a Car class
		// 2. We will create an ArrayList to store Car objects
		// 3. We will use an *Enhanced For Loop* to iterate throughout our List of Cars
		// Remember * java.util.Collection > List interface > ArrayList class (create Obj) 

		Car jeep = new Car("Jeep", "Grand Cherokee", 20000, true);
		
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(jeep);
		cars.add(new Car("Tesla", "S3", 70000, true));
		
		System.out.println(cars);
		
		// Enhanced For Loop
		// also called a For Each Method
		
		for (Car c : cars) {
			System.out.println("The model is: " + c.getModel());  // The model is : Grand cherokee, The model is: S3
			// this is an example of encapsulation!!
		}
		
		
	}

}
