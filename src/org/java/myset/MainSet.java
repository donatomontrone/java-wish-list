package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		
		Random rnd = new Random();
		
		while (nums.size() != 5) {
			int randomNum = rnd.nextInt(2,13);
			
			nums.add(randomNum);
		}
		
		System.out.println("Ecco i numeri generati:");
		for (Integer num : nums) {
			System.out.println(num);
		}
	}
	
}
