package com.qa.calculator;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Operation operation = new Operation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select an operator");
		System.out.println("[1] Add : [2] Subtract : [3] Multiply: [4] Divide");
		int opp = scanner.nextInt();
		// operation.operation();
		Add add = new Add();
		Subtract sub = new Subtract();
		Multiply multiply = new Multiply();
		Divide divide = new Divide();
		
		int z = operation.operation(opp);
	
		
		if (z==1) {
			System.out.println("You have selected Add!");
			add.add();
		}else if (z==2) {
			System.out.println("You have selected Subtract!");
			sub.sub();
		}else if(z==3) {
			System.out.println("You have selected Multiply!");
			multiply.multiply();
		} else if(z==4) {
			System.out.println("You have selected Divide!");
			divide.divide();
		}else {
			System.out.println("Error");
		}
	}

}
