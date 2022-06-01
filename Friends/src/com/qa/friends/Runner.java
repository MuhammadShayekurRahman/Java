package com.qa.friends;

public class Runner {

	public static void main(String[] args) {
		Details details = new Details();
		System.out.println(details);

		Details joeyT = new Details("Joey", "Tribbiani", "New York", "Actor", 30);
		System.out.println(joeyT);
		
		Details rossGShort = new Details("Geller", "New York", "Proffesor");
		rossGShort.setAge(30);
		System.out.println(rossGShort);
		
		Details rossG = new Details("Ross", "Geller", "New York", "Proffesor", 30);
		System.out.println(rossG);
		
		Details pheobeB = new Details("Phoebe", "Buffay");
		pheobeB.setAddress("New York");
		pheobeB.setAge(30);
		System.out.println(pheobeB);
		
		rossG.getFirstName();
		
	}

}
