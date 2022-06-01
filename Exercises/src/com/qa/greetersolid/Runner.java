package com.qa.greetersolid;

public class Runner {

	public static void main(String[] args) {

		FormalGreeting formal = new FormalGreeting();
		
		Greeter greeter = new Greeter(formal);
		
		System.out.println(greeter.greet());

	}

}
