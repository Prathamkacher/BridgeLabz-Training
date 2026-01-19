package com.collections.setinterface.equalsets;

import java.util.*;

public class CheckEqualSetMain {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		boolean result = CheckEqualSet.isSetEqual(set1, set2);
		
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Are sets equal: " + result);
	}
}
