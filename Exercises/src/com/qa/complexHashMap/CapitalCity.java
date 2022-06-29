package com.qa.complexHashMap;

import java.util.Objects;

public class CapitalCity {
	
	private String cityName;
	private int population;
	private int GDP;
	
	
	
	public CapitalCity(String cityName, int population, int gDP) {
		super();
		this.cityName = cityName;
		this.population = population;
		GDP = gDP;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getGDP() {
		return GDP;
	}
	public void setGDP(int gDP) {
		GDP = gDP;
	}
	
	@Override
	public String toString() {
		return "CapitalCity [cityName=" + cityName + ", population=" + population + ", GDP=" + GDP + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(GDP, cityName, population);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CapitalCity other = (CapitalCity) obj;
		return GDP == other.GDP && Objects.equals(cityName, other.cityName) && population == other.population;
	}
	
	
	
	

}
