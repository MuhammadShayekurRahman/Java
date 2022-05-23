package com.qa.exercises;

public class FizzBuzz {

	public void num(int x) {
		
		if (x%3<=0 && x%5<=0) {
			System.out.println("FizzBuzz");
		}
		else if (x%3<=0){
			
			System.out.println("Fizz");
			
		}
		else if (x%5<=0){
			
			System.out.println("Buzz");
			
		}
		else {
			System.out.println(x + ": No FizzBuzz bruh");
		}
	}
	
}
