package com.qa.parent;

public class Runner {

	public static void main(String[] args) {
		
		BMW bmw = new BMW(true, "M Sport");
		System.out.println(bmw);
		
		BMW bmw3 = new BMW(4, 4, 200, "BMW", "3 Series", true, "M-Sport");
		System.out.println(bmw3);

		bmw.horn();
		
		Mercedes c63 = new Mercedes(true, "AMG");
		System.out.println(c63);
		c63.sound();
		
		System.out.println("===================================================");
		
		Audi audi = new Audi();
		Car car = new Audi();
		Object object = new Audi();
		
		System.out.println("===================================================");
		
		audi.go();
		audi.horn();
		
		System.out.println("===================================================");
		
		((Audi) car).go();
		car.horn();
		
		System.out.println("===================================================");
		
		((Audi)object).go();
		((Audi)object).horn();
		System.out.println("===================================================");
		
		
		
	}

}
