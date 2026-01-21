package com.collections.setinterface.settosortedlist;

import java.util.*;

public class SetToSortedList {

	public static List<Integer> setToSortedList(Set<Integer> set) {
		
		List<Integer> list = new ArrayList<Integer>(set);
		
		Collections.sort(list);
		
		return list;
	}
}
