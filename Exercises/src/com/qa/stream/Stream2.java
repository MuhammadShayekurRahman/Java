package com.qa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ronaldo");
		names.add("Messi");
		names.add("Neymar");
		names.add("Mbappe");
		names.add("Benzema");
		names.add("Muhammad");
		
		long count = names.stream()
				.filter(str->str.length()>5)
				.count();
		
		System.out.println("There are "+ count + " names loner than 5 characters");
		
		List<String> sorted = names.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Sorted List:");
		sorted.forEach(n->System.out.println(n));

	}
	

}
