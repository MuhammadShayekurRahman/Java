package com.qa.details;

public class Details {
	// Atributes
	private String firstName;
	private String lastName;
	private int sortCode;
	private int accountNumber;
	
	// Default constructor
	
	public Details () {
		
	}
	
	// Constructor
	public Details(String firstName, String lastName, int sortCode, int accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sortCode = sortCode;
		this.accountNumber = accountNumber;
		
	}
	
	// Getters and Setters
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
	
	public int getSortCode() {
		return sortCode;
	}
	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	//methods
	@Override
	public String toString() {
		return "Details [firstName=" + firstName + ", lastName=" + lastName + ", sortCode=" + sortCode
				+ ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	
}
	

