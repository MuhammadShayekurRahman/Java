package com.qa.exercises;

public class Results {
	
	public void examResults(double physics, double chemistry, double biology) {
		double sumResults = physics + chemistry + biology;
		double examPercent = sumResults*100/450;
		System.out.println("You have a achived a percentage of " + examPercent + "%");
		
		if (physics<40 || chemistry<40 || biology<40) {
			
			System.out.println("You have failed");
			
		} else {
			if (examPercent>70) {
				System.out.println("First Class");
			}
			else if (examPercent>50) {
				System.out.println("Second Class");
			}
			else if (examPercent>40) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail :(");
			}
		}
		
	}
	
	public void display(double physics, double chemistry, double biology) {
		System.out.println("Congratulations on finishing your exams!");
        System.out.println("The results for your Phsyics exam is: "+ physics + "/150");
        System.out.println("The results for your Chemistry exam is: " + chemistry + "/150");
        System.out.println("The results for your Biology exam is: " + biology + "/150");
        double sumResults = physics + chemistry + biology;
        System.out.println("Your total score is: " + sumResults);
        
	}
	

}