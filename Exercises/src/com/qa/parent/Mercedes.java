package com.qa.parent;

public class Mercedes extends Car {
	
	private boolean turbo;
	private String trim;
	
	public Mercedes() {
		super();
	}

	
	
	public Mercedes(boolean turbo, String trim) {
		super();
		this.turbo = turbo;
		this.trim = trim;
	}



	public Mercedes(int doors, int wheels, int bhp, String make, String model, boolean turbo, String trim) {
		super(doors, wheels, bhp, make, model);
		this.turbo = turbo;
		this.trim = trim;
		
	}



	public boolean isTurbo() {
		return turbo;
	}



	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}



	public String getTrim() {
		return trim;
	}



	public void setTrim(String trim) {
		this.trim = trim;
	}

	@Override
	public void sound() {
		System.out.println("VROOM VRROOM!");
	}
	


	@Override
	public String toString() {
		return "Mercedes [turbo=" + turbo + ", trim=" + trim + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
