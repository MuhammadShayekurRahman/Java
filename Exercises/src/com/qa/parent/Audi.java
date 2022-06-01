package com.qa.parent;

public class Audi extends Car{
	private boolean turbo;
	private String trim;
	
	public Audi() {
		super();
	}

	
	
	public Audi(boolean turbo, String trim) {
		super();
		this.turbo = turbo;
		this.trim = trim;
	}



	public Audi(int doors, int wheels, int bhp, String make, String model, boolean turbo, String trim) {
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

	public void go() {
		System.out.println("Accelarate!");
	}


	@Override
	public String toString() {
		return "Audi [turbo=" + turbo + ", trim=" + trim + ", toString()=" + super.toString() + "]";
	}
	
	

}
