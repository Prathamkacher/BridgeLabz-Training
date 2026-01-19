package com.collections.listinterface.removeduplicates;

import java.util.*;


public class RemoveDuplicate {

	public static List<Integer> removeDuplicate(List<Integer> list) {
		
		List<Integer> result = new ArrayList<>();
		
		for(Integer val : list) {
			if(!result.contains(val)) {
				result.add(val);
			}
		}
		
		return result;
	}
}
