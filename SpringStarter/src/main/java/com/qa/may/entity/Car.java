package com.qa.may.entity;

public class Car {
	private String make;
	private String model;
	private String type;
	private boolean electric;
	
	public Car() {
		super();
		
	}
	
	public Car(String make, String model, String type, boolean electric) {
		super();
		this.make = make;
		this.model = model;
		this.type = type;
		this.electric = electric;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", type=" + type + ", electric=" + electric + "]";
	}
	
	
	
}
