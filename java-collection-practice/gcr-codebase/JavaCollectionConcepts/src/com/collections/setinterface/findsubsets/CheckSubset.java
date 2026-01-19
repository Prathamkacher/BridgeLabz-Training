package com.collections.setinterface.findsubsets;

import java.util.Set;

public class CheckSubset {

	public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
		
		if(set1 == null || set2 == null) {
			return false;
		}
		
		return set2.containsAll(set1);
	}
}
