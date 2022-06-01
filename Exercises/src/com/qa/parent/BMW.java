package com.qa.parent;

public class BMW extends Car{
	
	private boolean turbo;
	private String trim;
	
	public BMW() {
		super();
	}
	
	

	public BMW(boolean turbo, String trim) {
		super();
		this.turbo = turbo;
		this.trim = trim;
	}




	public BMW(int doors, int wheels, int bhp, String make, String model, boolean turbo, String trim) {
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
	public String toString() {
		return "BMW [turbo=" + turbo + ", trim=" + trim + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void horn() {
		System.out.println("BEEP!!!");
	}

	








	
	
	
	
}
