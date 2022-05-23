package com.qa.exercises;

public class Runner {

	public static void main(String[] args) {
		
		
		Operators operators = new Operators();
		// Operators 
		operators.add(123.123, 500);
		operators.minus(5, 2);
		operators.multiply(5, 5);
		operators.divide(10, 0);
		
		System.out.println("==========================================================================================");
		
		// Results
		Results results = new Results();
		results.display(30, 100, 100);
		results.examResults(30, 100, 100);
		
		System.out.println("==========================================================================================");
		
		//BlackJack
		
		BlackJack blackJack = new BlackJack();
		blackJack.play(21, 3);
		
		System.out.println("==========================================================================================");
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.num(16);
		
	}


}
