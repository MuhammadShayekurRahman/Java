package com.qa.tutorials;

import java.util.Scanner;
import javax.swing.JOptionPane;


import java.util.ArrayList;
import java.util.Random;

public class Runner {

	public static void main(String[] args) {
	
		
		//Scanner (User input)
//	Scanner scanner = new Scanner(System.in);	
//	System.out.println("What is your name? ");
//	String name = scanner.nextLine();
//	System.out.println("How old are you? ");
//	int age = scanner.nextInt();
//	
//	System.out.println("Hello "+name);
//	System.out.println("Age: "+age);
	
		// GUI Basics
//		String name = JOptionPane.showInputDialog("Enter your name:");
//		JOptionPane.showMessageDialog(null, "Hello " + name);
//		
//		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
//		JOptionPane.showMessageDialog(null, "You are " +  age);
		
		
		// Math basics
//	double x = 10;
//	double y = 20;
//	
//	double a = Math.max(x, y);
//	double b = Math.min(x, y);
//	double c = Math.sqrt(x);
//	System.out.println(x+ " "+ y);
//	
//	
		// Pythagoras App in terminal
//		double d;
//		double e;
//		double f;
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter side x: ");
//	d = scanner.nextDouble();
//	System.out.println("Enter side y: ");
//	e = scanner.nextDouble();
//	
//	f = Math.sqrt((d*d)+(e*e));
//	System.out.println("C sq is:" + f);
//	scanner.close();
	
		// Random Number generator
//	Random random = new Random();
//	int x = random.nextInt(6)+1;
//	System.out.println(x);
		
		// (SELF) RND Num with user input
//	 int x;
//	 Scanner scanner = new Scanner(System.in);
//	 System.out.println("Welcome to the Random Number Generator!");
//	 System.out.println("Please Enter Limit: ");
//	 x = scanner.nextInt();
//	 Random random = new Random();
//	 int y = random.nextInt(x)+1;
//	 System.out.println(y);
	 

		// iff Statements 
//	int age = 17;
//	
//	if (age>=18) {
//		System.out.println("You are an adult");
//	}
//	else if (age>=75) {
//		System.out.println("OK Boomer!");
//	}
//	else {
//		System.out.println("Too young!");
//	}
//		
//	}

		
		
		// Switches (Used instead of if statements 
//	String day = "Mondayy";
//	
//	switch (day) {
//	case "Monday": System.out.println("It is Monday");
//	break;
//	case "Tuesday": System.out.println("It is Tuesday");
//	break;
//	case "Wednesday": System.out.println("It is Wednesday");
//	break;
//	case "Thursday": System.out.println("It is Thursday");
//	break;
//	case "Friday": System.out.println("It is Friday");
//	break;
//	default: System.out.println(day+": Not Correct day");
//	}
	
		// Arrays 
		
//	String[] cars = {"BMW", "Mercedes", "Tesla"};
//	System.out.println(cars[0]);
//	
//	String[] chocolate = new String[3];
//	chocolate[0] = "Galaxy";
//	chocolate[1] = "Cadbury";
//	chocolate[2] = "Mars";
//	
//	for (int i=0; i<chocolate.length; i++) {
//		System.out.println(chocolate[i]);
//	}
	
		
		// 2D Arrays
	
//	String[][] cars = new String [2][3];
//	cars[0][0]= "BMW";
//	cars[0][1]= "Lambo";
//	cars[0][2]= "Ferrari";
//	cars[1][0]= "Mercedes";
//	cars[1][1]= "Toyota";
//	cars[1][2]= "Nissan";
//	
//	for(int i=0; i<cars.length; i++) {
//		System.out.println();
//		for (int j=0; j<cars[i].length; j++) {
//			System.out.println(cars[i][j]);
//		}
//	}

		
		// String functions
		
//	String name = "shayek";
	// boolean result = name.equals("shayek");
	// int result = name.length();
	// char result = name.charAt(0);
	// int result = name.indexOf("h"); // Finds position of letter
	// boolean result = name.isEmpty();
//	String result = name.toUpperCase();
//	String result = name.toLowerCase();
//	String result = name.trim(); // Removes empty space
//	String result = name.replace("s", "z");
	
//	System.out.println(result);
	

		// Wrapper Class
		// boolean = Boolean
		// char = Character
		// int = Integer
		
		//Integer x = 1;
		
		// ArrayLists
		
//		ArrayList<String> food = new ArrayList<String>();
//		
//		food.add("Pizza");
//		food.add("Chicken");
//		food.add("Hotdogs");
//		
//		food.set(0, "Sushi");
//		food.remove(2);
//		// food.clear();
//		for (int i=0; i<food.size(); i++) {
//			System.out.println(food.get(i));
//		}
//		
		//Enhanced for loops
		
//		for (String string : food) {
//		System.out.println(string);	
//		}	
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i=0; i<20; i++) {
			num.add(i, i+1);
		}
		
//		for (Integer nums : num) {
//			System.out.println(nums);
//		}
		
		
			
		
		
}
}	

