package com.qa.restaurant;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Staff staff = new Staff();
		System.out.println(staff);
		
//		Staff staff1 = new Staff(1, "lil", "Durk", "Manager", 25000);
//		System.out.println(staff1);
		
		System.out.println("Please enter details of new Staff");
		staff.setId(1);
		System.out.println("First Name:");
		staff.setFirstName(scanner.nextLine());
		System.out.println("Last Name:");
		staff.setLastName(scanner.nextLine());
		System.out.println("Job Role:");
		staff.setRole(scanner.nextLine());
		System.out.println("Wage:");
		staff.setWage(scanner.nextDouble());
		
		System.out.println(staff);
		
		
	}

}
