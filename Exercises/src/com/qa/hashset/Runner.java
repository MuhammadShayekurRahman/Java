package com.qa.hashset;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Z");
		hashSet.add("C");
		hashSet.add("B");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("Test");
		hashSet.add("Hello World!");
		hashSet.add("5");
		hashSet.add("AA");
		hashSet.add("$");
		hashSet.add("F");
		hashSet.add("F"); // this will overwite the previous "F", as duplicate values are not permitted
		System.out.println(hashSet);
		System.out.println(hashSet.hashCode());
	
		String s = "Hello World";
		System.out.println(s.hashCode());
//		Iterator<String> setIterator = hashSet.iterator();
//		while (setIterator.hasNext()){
//		    String obj = setIterator.next();
//		    setIterator.remove();
//		}
		
		
		hashSet.clear();
		System.out.println(hashSet.contains("Z"));
		System.out.println(hashSet.hashCode());
	}
	

}
