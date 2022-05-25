package com.qa.arrays;

import java.util.ArrayList;


public class Runner {

	public static void main(String[] args) {

		Arrays arrays = new Arrays();
		arrays.arrayNum();
		
		ExTwo exTwo = new ExTwo();
		exTwo.num(66);
		
ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i=0; i<20; i++) {
			num.add(i, i+1);
		}
		
//		for (Integer nums : num) {
//			System.out.println(nums);
//		}
		
		
		Enhanced enhanced = new Enhanced();
		// enhanced.evenOdd(5);
		
		for (int tf : num) {
			
			// boolean a = enhanced.evenOdd(tf);
			if (enhanced.evenOdd(tf)) {
				int b = tf*tf*tf;
				System.out.println(b);
				
			} else{
				int b = tf*tf;
				System.out.println(b);
			}
			}
		
		StringManipulation str = new StringManipulation();
		
		System.out.println(str.weather());
		
		// str.vertical("Hello World");
		str.verticalLine("Hello World");
		
		str.verticalReverse("Hello world");
		
	}

}
