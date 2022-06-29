package com.qa.complexHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Runner {

	public static void main(String[] args) {
		
		CapitalCity London = new CapitalCity("London", 1000000, 1000000);
		CapitalCity Paris = new CapitalCity("Paris", 1000000, 1000000);
		CapitalCity Berlin = new CapitalCity("Berlin", 1000000, 1000000);
		
		Map<String, CapitalCity> countryMap = new HashMap<>();
		
		countryMap.put("England", London);
		countryMap.put("France", Paris);
		countryMap.put("Germany", Berlin);
		
		for (Entry<String, CapitalCity> i : countryMap.entrySet()) {
			System.out.println(i);
		}
		
		
	}

}
