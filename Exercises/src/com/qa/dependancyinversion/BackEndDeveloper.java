package com.qa.dependancyinversion;

public class BackEndDeveloper implements Developer{


	@Override
	public void dev(String devType) {
		if (devType=="BackEnd") {
			System.out.println("C# is just Microsoft Java anyway.");
		}
		
	}

}
