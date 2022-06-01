package com.qa.interfaces;

public class Runner {

	public static void main(String[] args) {

		BMW bmw = new BMW();
		System.out.println(bmw.make());
		bmw.alloys();
		bmw.interior();
		bmw.colourScheme();

	}

}
