package com.qa.enums;

public enum Country {
	
	ENGLAND("London", 8.982f, false),
	FRANCE("Paris", 2.161f, false),
	GERMANY("Berlin", 3.645f, false),
	SPAIN("Madrid", 3.223f, false);
	
	private final String capitalCity;
	private final float population;
	private final boolean landLocked;
	
	private Country(String capitalCity, float population, boolean landLocked) {
		this.capitalCity = capitalCity;
		this.population = population;
		this.landLocked = landLocked;
	}
	
	private final String continent = "Europe";
	
	public String details() {
		return "Captial:"+capitalCity + " Population(millions):" + population + " " + continent + " LandLocked:" + landLocked;
		
	}
	
	public float averageIncome(long GDP) {
		return (long)(GDP/(population* 1000000));
	}
	
	public float populationDensity(long area) {
		return area/(population*1000000);
	}
	
}
