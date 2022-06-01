package com.qa.restaurant;

import java.util.Scanner;

public class Staff {

	private int id;
	private String firstName;
	private String lastName;
	private String role;
	private double wage;
	

	
	public Staff() {
	}


	public Staff(int id, String firstName, String lastName, String role, int wage) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.wage = wage;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + ", wage=£"
				+ wage + "]";
	}
	
	public void newStaff(int x) {
		Scanner scanner = new Scanner(System.in);
		setId(x);
		System.out.println("Please enter details of new Staff");
		
		System.out.println("First Name:");
		// scanner.next();
		setFirstName(scanner.nextLine());
		
		System.out.println("Last Name:");
		setLastName(scanner.nextLine());
		System.out.println("Job Role:");
		setRole(scanner.nextLine());
		System.out.println("Wage:");
		setWage(scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Staff [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + ", wage=£"
				+ wage + "]");
		
	}
	
	
}
