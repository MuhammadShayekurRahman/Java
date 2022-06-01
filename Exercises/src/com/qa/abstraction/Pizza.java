package com.qa.abstraction;

public class Pizza extends Food{

	
	public void calories() {
		System.out.println("Too much cheese bruh");
		
	}

	public void taste(int rating) {
		if (rating>5 && rating<=10) {
			System.out.println("Yummyyy");
		}else if(rating>0 && rating<=5) {
			System.out.println("Ewwwww");
		}else {
			System.out.println("Error - Enter Value between 1 and 10");
		}
			
		
	}

	
}
