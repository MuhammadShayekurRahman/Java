package com.qa.calculator;

import java.util.Scanner;

public class Divide {
	public void divide() {
		Scanner scanner = new Scanner(System.in);
		int firstNum;
		int secondNum;
		
		System.out.println("Enter First Number:");
		firstNum = scanner.nextInt();
		System.out.println("Enter Second Number");
		secondNum = scanner.nextInt();
		
		System.out.println("Answer:"+ Math.floorDiv(firstNum, secondNum));
		
		
		}
}
