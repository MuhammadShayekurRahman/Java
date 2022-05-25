package com.qa.arrays;

public class ExTwo {

	public void num(int x) {
		if (x>=10 && x<=99) {
		
			String number = String.valueOf(x);
			char[] digit = number.toCharArray();
			
			
			System.out.println(x);
			System.out.println("#1="+digit[0] +" "+ "#2="+digit[1]);
			
			
			int y = Character.getNumericValue(digit[0]);
			int z= Character.getNumericValue(digit[1]);
			System.out.println(y+z);
			
			
//			for (int i=0; i<digit.length; i++) {
//				System.out.println(digit[i]);
//			}
		
		} else {
			System.out.println("Please enter Value betweem 10 and 99");
		}
		
	}
	
}
