package com.revature.collections3;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		/*
		 * HashSets & LinkedSets --> implement the Set Interface
		 * -- Sets differ from Lists because they don't allow duplicates
		 * -- (lists do allow duplicate values)
		 * -- a hashset stores objects using a hashtable for storage.
		 */
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(2); 
		nums.add(3);
		nums.add(2); 
		
		for (int num : nums) {
			System.out.println(num);
		}
		
		Animal a1 = new Animal("Dog", 7);
		Animal a2 = new Animal("Cat", 12);
		Animal a3 = new Animal("Platypus", 2);
		Animal a4 = new Animal("Dog", 7);
		
		HashSet<Animal> set = new HashSet<Animal>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		
		for (Animal animal : set) { // for each individual element, print it.
			System.out.println(animal);
		}
		
		System.out.println("Content Comparison: " + a1.equals(a4)); // .equals() = a method that compares content
		// .equals() will only return true IF I override this method
		System.out.println("Memory Comparison: " + (a1 == a4)); // and the == operator is an operator that compares 
		System.out.println(a1.hashCode() + " " + a4.hashCode());
		

	}

}
