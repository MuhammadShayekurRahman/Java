package com.qa.exercises;

public class Runner {

	public static void main(String[] args) {
		
		
		Operators operators = new Operators();
		// Operators 
		operators.add(123.123, 500);
		operators.minus(5, 2);
		operators.multiply(5, 5);
		operators.divide(10, 5);
		
		System.out.println("==========================================================================================");
		
		// Results
		Results results = new Results();
		results.display(100, 100, 100);
		results.examResults(100, 100, 100);
		
	}


}
