package com.qa.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		var staffName = new LinkedList<String>();
		 staffName.add("Muhammad");
		 staffName.add("Messi");
		 staffName.add("Rondaldo");
		 
		 System.out.println(staffName);
		 
		 Iterator<String> itr = staffName.iterator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 
		 }

	}

}
