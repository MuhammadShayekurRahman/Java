package com.qa.interfaces;

public class BMW extends Car{

	@Override
	public void colourScheme() {

		System.out.println("Blue/Black");
	}

	public void alloys() {
		System.out.println("Chrome");
	}

	@Override
	public void interior() {
		System.out.println("Leather");
	}

	@Override
	public String make() {
		// TODO Auto-generated method stub
		return "BMW";
	}
	
	

}
