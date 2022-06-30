package com.qa.exgenerics;

public class Runner {

	public static <T> void itemArray(T[] items) {
		for (T item : items) {
			System.out.println(item);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = { 1, 2, 3, 4, 5};
		Character[] charArray = { 'M', 'U', 'H', 'A', 'M', 'M', 'A', 'D'};

		System.out.println("Integer array:");
		itemArray(intArray);

		System.out.println("Character array:");
		itemArray(charArray);

	}

}
