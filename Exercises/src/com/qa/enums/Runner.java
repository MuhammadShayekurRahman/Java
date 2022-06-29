package com.qa.enums;

public class Runner {

	public static void main(String[] args) {
		
		Country england = Country.ENGLAND;
		
		System.out.println(england.details());
		
		System.out.println("£"+england.averageIncome((long) 503000000000f));
		
		System.out.println("Population density of London: " + england.populationDensity(1572)+"km2");

	}

}
