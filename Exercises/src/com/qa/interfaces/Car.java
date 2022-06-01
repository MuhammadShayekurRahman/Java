package com.qa.interfaces;

public abstract class Car implements Colour, Alloys, Interior {
	
	public void alloys() {
		System.out.println("Standard");
	};

	public abstract String make();

	

}
