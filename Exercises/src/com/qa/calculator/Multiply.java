package com.qa.calculator;

import java.util.Scanner;

public class Multiply {
	
	public void multiply() {
		Scanner scanner = new Scanner(System.in);
		int firstNum;
		int secondNum;
		
		System.out.println("Enter First Number:");
		firstNum = scanner.nextInt();
		System.out.println("Enter Second Number");
		secondNum = scanner.nextInt();
		
		System.out.println("Answer:"+ Math.multiplyExact(firstNum, secondNum));
		
		
		}
}
