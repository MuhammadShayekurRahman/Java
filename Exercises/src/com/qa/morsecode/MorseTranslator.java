package com.qa.morsecode;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

	public String translate(String input) {
		Map<String, String> morseMap = new HashMap<>();
		
		morseMap.put(".-","A");
		morseMap.put("-...","B");
		morseMap.put("-.-.","C");
		morseMap.put("-..","D");
		morseMap.put(".","E");
		morseMap.put("..-.","F");
		morseMap.put("--.","G");
		morseMap.put("....","H");
		morseMap.put("..","I");
		morseMap.put(".---","J");
		morseMap.put("-.-","K");
		morseMap.put(".-..","L");
		morseMap.put("--","M");
		morseMap.put("-.","N");
		morseMap.put("---","O");
		morseMap.put(".--.","P");
		morseMap.put("--.-","Q");
		morseMap.put(".-.","R");
		morseMap.put("...","S");
		morseMap.put("-","T");
		morseMap.put("..-","U");
		morseMap.put("...-","V");
		morseMap.put(".--","W");
		morseMap.put("-..-","X");
		morseMap.put("-.--","Y");
		morseMap.put("--..","Z");
		morseMap.put("/", " ");
		
		

		
		String word = "";
		
		String[] parts = input.split(" ");
		for (String part: parts) {
			
			word += morseMap.get(part);
		}
		return word;
		
		
	
	}

}
