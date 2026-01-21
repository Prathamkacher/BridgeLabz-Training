package com.collections.setinterface.symmetricdifference;

import java.util.*;

public class SymmetricDifference {

	public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		
		union.removeAll(intersection);
		
		return union;
	}
}
