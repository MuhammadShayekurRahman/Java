package com.qa.arrays;

public class StringManipulation {


	public String weather() {
		String string1 = "yesterday it was raining";
		String string2 = "today it is sunny";
		
		String string3 = string1.toUpperCase().concat(", "+string2.toUpperCase());
		System.out.println(string3.substring(string1.length()+2));
		System.out.println(string2.substring(0, 11).toUpperCase() + string1.substring(16, 24).toUpperCase());
		return null;
		
	}
	
	public int countString(String x) {
		return x.length();
	}
	
	public void vertical(String x) {

		for(char ch: x.toCharArray())
		System.out.println(ch);
	}
	
	public void verticalLine(String x) {
		
//		for(int i=0; i<x.length(); i++) {
//			System.out.println(x.substring(i, i+1));
//		}
		
//		String[] y = x.split(" ");
//		System.out.println(y[1]);
//		
//		for (int i=0; i<y.length; i++) {
//			System.out.println(y[i]);
//		}
		String word = "";
		
		for (int i=0; i<x.length(); i++) {
			if (x.substring(i,i+1).equals(" ")) {
				
				System.out.println(word);
				word="";
				
			}else {
				word += x.substring(i, i+1);
			}
		}
		System.out.println(word);
	}
	
	public void verticalReverse(String x) {
		
		String word = "";
		for (int i=x.length(); i>0; i--) {
			if(x.substring(i-1, i).equals(" ")) {
				System.out.println(word);
				word="";
			}else {
				word = x.substring(i-1, i) + word;
			}
		}
		System.out.println(word);
	}

}
