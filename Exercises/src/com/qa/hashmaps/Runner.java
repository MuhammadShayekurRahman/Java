package com.qa.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Runner {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();
        
        capitalCities.put("England", "London");
        capitalCities.put("Russia","Moscow");
        capitalCities.put("Japan","Tokyo");
        
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities);
        System.out.println(capitalCities.hashCode());
        
        System.out.println("=============================================");
        // Keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        
        // Values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        
        // All
        for (Entry<String, String> i : capitalCities.entrySet()) {
            System.out.println(i);
        }
        
        
        //////////////////////
        
        Map<String, Integer> people = new HashMap<>();

        people.put("Nick", 25);
        people.put("Jordan", 26);
        people.put("John", 33);

        for (Entry<String, Integer> i : people.entrySet()) {
            System.out.println(i);
        }
    }
    
    
}