package com.qa.solid;

public class Mechanic {
	
	public boolean serviceDue;
	public boolean oilChange;
	public int issues;
	
	public void service() {
		serviceDue = false;
		System.out.println("The service has been carried out");
	
	}

}
