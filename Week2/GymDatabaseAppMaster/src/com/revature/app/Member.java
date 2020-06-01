package com.revature.app;

import java.util.Scanner;

public class Member {

	private String firstName;
	private String lastName;
	private String tier; // 65+ is Tier "A", >= 18 "B", <18 = "C"
	private String memberId;// A1002; this will be a unique combo of the Tier and the incremented ID
	private String enrolledClasses = ""; // this.enrolledClasses += classToEnrollIn 
	private int monthlyDues = 0;
	
	private static final int costOfClasses = 100; // this static property belongs to all objects
	private static int id = 1000; // the value of this increases every time we add a new member

	// Constructor
	public Member() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		this.firstName = scan.nextLine();
		
		System.out.println("Enter your last name: ");
		this.lastName = scan.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
		if (age >= 65) {
			this.tier = "A";
		} else if (age >= 18) {
			this.tier = "B";
		} else {
			this.tier = "C";
		}
		
		setMemberId();
		
	}
	
	// 1. method to generate an Id
	private void setMemberId() {
		id++;
		this.memberId = this.tier + id; // we concatenating
	}
	
	@Override
	public String toString() {
		return "Member [firstName=" + firstName + ", lastName=" + lastName + ", tier=" + tier + ", memberId=" + memberId
				+ ", monthlyDues=" + monthlyDues + "]";
	}
	
	// 2. method to enroll in classes 
	public void enroll() {
		
		Scanner scan = new Scanner(System.in);
		
		// the user has the option of entering a class to enroll in or pressing Q to quit
		boolean asking = true; // 

		
		do {
			System.out.println("Enter an exercise class to enroll in: ");
			String classToEnrollIn = scan.nextLine();
			
			
			this.enrolledClasses += "\n " + classToEnrollIn; // but what about when a User types Q
			
		} while (asking);
		
	}
	
	
	// 3. method to pay monthlyDues
	
	// 4. method to view account Info

	

}
