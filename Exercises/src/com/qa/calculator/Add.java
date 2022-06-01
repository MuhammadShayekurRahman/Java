package com.qa.calculator;

import java.util.Scanner;

public class Add {
	
	public void add() {
	Scanner scanner = new Scanner(System.in);
	int firstNum;
	int secondNum;
	
	System.out.println("Enter First Number:");
	firstNum = scanner.nextInt();
	System.out.println("Enter Second Number");
	secondNum = scanner.nextInt();
	
	System.out.println("Answer:"+Math.addExact(firstNum, secondNum));
	
	
	}
	
	
}
