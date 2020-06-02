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
			System.out.println("Enter an exercise class to enroll in (Q to quit): ");
			String classToEnrollIn = scan.nextLine();
			
			if(!classToEnrollIn.equals("Q")) {
				this.enrolledClasses += "\n " + classToEnrollIn; // but what about when a User types Q?
				this.monthlyDues += costOfClasses;
			} else {
				asking = false; // this will break our loop; 1 or 0 false
			}
			// some clean up code here that will still execute even if asking == false;
		} while (asking);
		
	}
	
	// 3. Method to view balance
	public void viewMonthlyDues() {
		System.out.println("Your balance left on Monthly Dues is " + this.monthlyDues + ".");
	}
	
	// 4. Method to pay monthlyDues
	public void payMonthlyDues(double payment) {
		this.monthlyDues -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		// then incorporate the view Monthly Dues:
		viewMonthlyDues();
		
	}
	
	// 5. Show Info 
	public void showInfo() {
		System.out.println("\nName: " + this.firstName + " " + this.lastName +  
				"\nMember ID: " + this.memberId + 
				"\nClasses enrolled in: " + this.enrolledClasses + 
				"\nMonthly Dues: " + this.monthlyDues);
		
	}
	

	

}
