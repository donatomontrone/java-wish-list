package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		
		 str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		 
		 System.out.println(str);
		 
		 String[] strArray = str.split(" ");
	
		
		Map<String, Integer> words = new HashMap<>();
		
		
		for (String word : strArray) {
			
			if (word.isBlank()) continue;
			
			 if (words.containsKey(word)) {
				 
				words.put(word, words.get(word) + 1);
				
			 } else {			
				 
				 words.put(word, 1);	 
			 }
			 
			 words.remove("");
		}
		
		System.out.println(words);

	}
}