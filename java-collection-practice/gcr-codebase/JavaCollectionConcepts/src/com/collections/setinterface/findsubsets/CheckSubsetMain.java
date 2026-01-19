package com.collections.setinterface.findsubsets;

import java.util.HashSet;
import java.util.Set;

public class CheckSubsetMain {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(4);
		set1.add(6);
		set1.add(8);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(3);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		set2.add(9);
		
		boolean result = CheckSubset.isSubset(set1, set2);
		
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Is set 1 is subset of set 2: " + result);
	}
}
