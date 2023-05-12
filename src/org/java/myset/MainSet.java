package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		
		Random rnd = new Random();
		
		while (nums.size() != 5) {
			int num = rnd.nextInt(2,12);
			
			nums.add(num);
		}
		
		System.out.println(nums);
	}
	
}
