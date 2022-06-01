package com.qa.friends;

public class Details {

	private String firstName;
	private String lastName;
	private String address;
	private String jobTitle;
	private int age;
	
	public Details() {
		
	}
	
	public Details (String firstName, String lastName, String address, String jobTitle, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	
	public Details (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public Details (String lastName, String address, String jobTitle) {
		this.lastName = lastName;
		this.address = address;
		this.jobTitle = jobTitle;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Details [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", jobTitle="
				+ jobTitle + ", age=" + age + "]";
	}
	
	
	
	
}
