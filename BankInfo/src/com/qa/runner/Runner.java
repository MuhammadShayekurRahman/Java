package com.qa.runner;

import com.qa.details.Details;

public class Runner {

	public static void main(String[] args) {
		
		Details account = new Details("Shayek", "Rahman", 214365, 43453098);
		System.out.println("The Account details are below:");
		System.out.println(account);
		
	}

}
