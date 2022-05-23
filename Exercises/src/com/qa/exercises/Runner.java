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
		double physics = 30;
		double chemistry = 100;
		double biology = 100;
		results.display(physics, chemistry, biology);
		results.examResults(physics, chemistry, biology);
		
		System.out.println("==========================================================================================");
		
		//BlackJack
		
		BlackJack blackJack = new BlackJack();
		blackJack.play(21, 3);
		
		System.out.println("==========================================================================================");
		
		// FizzBuzz
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.num(16);
		
		System.out.println("==========================================================================================");
		
		// Flowcharts
		
		Flowcharts flowcharts = new Flowcharts();
		flowcharts.flowChartA();
		flowcharts.flowChartB();
		flowcharts.qThree();
		
	}


}
