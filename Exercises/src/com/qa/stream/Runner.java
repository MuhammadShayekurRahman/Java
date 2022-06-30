package com.qa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
	System.out.println("Test");
	
	List<Integer> number = Arrays.asList(2,3,4,5,6,7,8);
//	Stream<Integer> square = number.stream();
//	
//	System.out.println(square);
	
	int even = number.stream()
			.filter(x -> x%2==0)
			.reduce((a, b)-> a+b)
			.get();
	System.out.println(even);
	
	
	
	}

}
