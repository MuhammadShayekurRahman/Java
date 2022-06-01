package com.qa.abstraction;

public class Runner {

	public static void main(String[] args) {

		Pizza pizza = new Pizza();
		pizza.calories();
		pizza.taste(5);
		
		System.out.println("================================================");
		
		Burger burger = new Burger();
		burger.calories();
		burger.taste(10);

	}

}
