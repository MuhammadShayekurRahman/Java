package com.qa.dependancyinversion;

public class Project {

	private BackEndDeveloper backEnd;
	private FrontEndDeveloper frontEnd;
	
	public void implement() {
		backEnd.dev("FrontEnd");
		frontEnd.dev("BackEnd");
	}

	public BackEndDeveloper getBackEnd() {
		return backEnd;
	}

	public void setBackEnd(BackEndDeveloper backEnd) {
		this.backEnd = backEnd;
	}

	public FrontEndDeveloper getFrontEnd() {
		return frontEnd;
	}

	public void setFrontEnd(FrontEndDeveloper frontEnd) {
		this.frontEnd = frontEnd;
	}
	
	
	
}
