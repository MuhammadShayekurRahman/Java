package com.qa.inputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {

	static Person muhammad = new Person("Muhammad", 23, "Tech Specialist");
	static Person lewis = new Person("Lewis", 32, "Tech Specialist");
	static Person ronaldo = new Person("Ronaldo", 36, "Footballer");
	static Person messi = new Person("Messi", 35, "Footballer");
	
	
	
	
	
	
	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(muhammad);
		personList.add(lewis);
		personList.add(ronaldo);
		personList.add(messi);
		
		//System.out.println(personList);
		
		personList.stream()
		.forEach(n->System.out.println(n));
		
		List<Person> result =
		personList.stream()
		.filter(str-> str.getName().equals("Ronaldo"))
		.collect(Collectors.toList());
		
		System.out.println(result);
		

		
	}
	
	
	

}
