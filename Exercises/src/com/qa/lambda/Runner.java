package com.qa.lambda;

import java.util.ArrayList;

public class Runner {

	public static <T> void printArrayList(ArrayList<T> items) {
		
		items.forEach(n -> System.out.println(n));
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		ArrayList<String> chars = new ArrayList<>();
		chars.add("A");
		chars.add("B");
		chars.add("C");
		chars.add("D");
		chars.add("E");
		
		System.out.println("Integer array:");
		printArrayList(nums);
		
		System.out.println("Char array:");
		printArrayList(chars);
	}

}
