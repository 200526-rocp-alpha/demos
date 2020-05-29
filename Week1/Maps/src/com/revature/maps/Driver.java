package com.revature.maps;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		// Maps consist of key/value pairs
		// think of a dictionary (key = word, value = definition)
		// you cannot have duplicate keys, but you CAN have duplicate definitions
		
		// let's build a HashMap that represents a dictionary:
		HashMap<String, String> dictionary = new HashMap<String, String>();

		dictionary.put("outgoing", "extroverted in nature");
		dictionary.put("intelligent", "sharp witted");
		dictionary.put("timid", "introverted in nature");
		dictionary.put("shy", "introverted in nature");
	
		System.out.println(dictionary);
		// HashMap has no particular order
		// LinkedMap WILL maintain order (of insertion)
		// TreeMap will sort KEYS by natural order (that's alphabetical order for Strings)\
		
		// how to iterate through a Map (use an enhanced for loop_)
		for (String word : dictionary.keySet()) { // this just returns Keys....
			System.out.println("The Key is: " + word);
			// System.out.println(word.hashCode());
		}
		
		
		for (String definition : dictionary.values()) {
			System.out.println("The Value is: " + definition);
		}
		
		// to print out both the key and value:
		for(Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue() + "\n"); // %s , %b escape sequences are used to format output
		}
		
		//...and that's all for Maps!
		
	
	}
	
}
