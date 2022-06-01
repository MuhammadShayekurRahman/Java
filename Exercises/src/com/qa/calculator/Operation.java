package com.qa.calculator;

import java.util.Scanner;

public class Operation {

	Scanner scanner = new Scanner(System.in);
	
	public int operation(int y) {
		
		int x = 0;
	
		switch (y){
		case 1: x=1;
		break;
		case 2 : x=2;
		break;
		case 3 : x=3;
		break;
		case 4 : x=4;
		break;
		default: System.out.println("Problem");
		
		}
		return x;
		

		
	}
		
	
}
