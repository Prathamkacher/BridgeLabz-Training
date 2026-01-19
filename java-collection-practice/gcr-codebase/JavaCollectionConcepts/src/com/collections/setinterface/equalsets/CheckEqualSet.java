package com.collections.setinterface.equalsets;

import java.util.*;


public class CheckEqualSet {

	public static boolean isSetEqual(Set<Integer> set1, Set<Integer> set2) {
		
		if(set1 == null || set2 == null) {
			return false;
		}
		
		return set1.equals(set2);
	}
}
