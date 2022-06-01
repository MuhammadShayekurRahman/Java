package com.qa.parent;

public class Car {

	private int doors = 4;
	private int wheels = 4;
	private int bhp;
	private String make;
	private String model;
	
	// Default Constructor
	public Car() {
		
	}

	public Car(int doors, int wheels, int bhp, String make, String model) {
		super();
		this.doors = doors;
		this.wheels = wheels;
		this.bhp = bhp;
		this.make = make;
		this.model = model;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getBhp() {
		return bhp;
	}

	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void horn() {
		System.out.println("Beep");
	}
	
	public void sound() {
		System.out.println("Vroom");
	}
	
	
	
	
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", wheels=" + wheels + ", bhp=" + bhp + ", make=" + make + ", model=" + model
				+ "]";
	}
	
	
	
	
	
	
}
