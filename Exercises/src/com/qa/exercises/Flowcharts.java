package com.qa.exercises;

public class Flowcharts {
	
	public void flowChartA(){
	
	
		for(int a=100; a<200; a++) {
		System.out.println(a);
		
		}
	 
	}	

	public void flowChartB() {
		
		
		for (int a=100; a<=200; a++) {
			
			if (a%2==0) {
			System.out.println("-"+ a);
			continue;
			}
			else {
				System.out.println("*"+a);
			}
		 
		}
		
		System.out.println("Completed");	
		
	}
	
	public void qThree() {
		
		for (int a=1; a<=10; a++) {
			
			for(int b=1; b<=a; b++) {
				System.out.println(a);
			}
			

		}
		
	}
	
	public void coins(double money) {
		
		double pennies = money*100;
		System.out.println("Total in pennies: " + pennies);
		
		// Condition of loop pennies > 0
		
		while (pennies>0) {
			
			if (pennies>=2000) {
			
				pennies-=2000;
				System.out.println("?20");
			}else if(pennies>=1000) {
				pennies-=1000;
				System.out.println("?10");
				
			}else if(pennies>=500) {
				pennies-=500;
				System.out.println("?5");
				
			}else if(pennies>=200) {
				pennies-=200;
				System.out.println("?2");	
					
				
			}else if(pennies>=100) {
				pennies-=100;
				System.out.println("?1");
				

			}else if(pennies>=50) {
				pennies-=50;
				System.out.println("50p");
				
			}else if(pennies>=20) {
				pennies-=20;
				System.out.println("20p");
				
			}else if(pennies>=10) {
				pennies-=10;
				System.out.println("10p");
				
			}else if(pennies>=5) {
				pennies-=5;
				System.out.println("5p");
				
			}else if(pennies>=2) {
				pennies-=2;
				System.out.println("2p");
				
			}else if(pennies>=1) {
				pennies-=1;
				System.out.println("1p");
				
			}else {
				System.out.println("Error");
			}
		}
		
	}
	
	
}
