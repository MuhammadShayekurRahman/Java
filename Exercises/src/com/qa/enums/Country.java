package com.qa.enums;

public enum Country {
	
	ENGLAND("London", 8.982f),
	FRANCE("Paris", 2.161f),
	GERMANY("Berlin", 3.645f),
	SPAIN("Madrid", 3.223f);
	
	private final String capitalCity;
	private final float population;
	
	private Country(String capitalCity, float population) {
		this.capitalCity = capitalCity;
		this.population = population;
	}
	
	private final String continent = "Europe";
	
	public String details() {
		return "Captial:"+capitalCity + " Population (millions):" + population + " " + continent;
		
	}
	
	public float averageIncome(int GDP) {
		return GDP/(population* 1000000);
	}
	
}
