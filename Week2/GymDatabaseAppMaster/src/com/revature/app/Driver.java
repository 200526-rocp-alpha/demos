package com.revature.app;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		// 1. Create a member object 
//		Member member1 = new Member();	// 1.
//		member1.enroll();				// 2.
//		member1.payMonthlyDues(50);		// 3.
//		member1.showInfo();				// 4.
		// after completing the Member class, we will create a way to create users that is much faster than this.... 
		// See below for the solution to this!

		// B. Ask how many members the User wants to add
		System.out.println("Enter the number of new members signing up: ");
		Scanner scan = new Scanner(System.in);
		int numOfMembers = scan.nextInt();
		Member[] members = new Member[numOfMembers];
		
		
		// C. Create n number of new Members;
		for(int i=0; i < numOfMembers; i++) {
			members[i] = new Member();
			members[i].enroll();
			members[i].showInfo();
		}
	}
}
