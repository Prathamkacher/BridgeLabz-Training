package com.collections.setinterface.unionintersection;

import java.util.*;


public class UnionIntersectionOfSets {

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		
		Set<Integer> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}
	
	public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
		
		Set<Integer> result = new HashSet<>(set1);
		result.retainAll(set2);
		return result;
	}
}
