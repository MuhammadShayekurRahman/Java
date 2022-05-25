package com.qa.arrays;

public class Arrays {
	
	public void arrayNum() {
		
//		Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
//		Create a for loop that populates an integer array with values, outputting them at each iteration.
//		Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
//		
		
					//		int[] num = new int[10];
					//		num = new int[]{1,2,3,4,5,6,7,8,9,10};
					//
					//		for (int i=0;i<num.length; i++) {
					//			System.out.println(num[i]);
					//		}
		
//		int[] numA = new int[10];
//		
//		for (int i=0; i<numA.length; i++) {
//			numA[i] = i;
//			System.out.println(numA[i]);
//		}
		
		int[] numB = new int[10];
				
				for (int i=1; i<numB.length; i++) {
					int j=i*10;
					numB[i] = j;
					System.out.println(numB[i]);
				}	
	}

}
