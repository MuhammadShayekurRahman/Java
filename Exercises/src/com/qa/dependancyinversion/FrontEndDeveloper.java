package com.qa.dependancyinversion;

public class FrontEndDeveloper implements Developer{


	@Override
	public void dev(String devType) {
		if (devType=="FrontEnd") {
			System.out.println("JavaScript is used everywhere anyway.");
		}
		
	}

}
