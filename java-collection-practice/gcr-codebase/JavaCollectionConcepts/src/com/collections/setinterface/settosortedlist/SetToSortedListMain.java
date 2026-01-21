package com.collections.setinterface.settosortedlist;

import java.util.*;

public class SetToSortedListMain {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(111);
		set.add(201);
		set.add(315);
		set.add(95);
		set.add(40);
		
		System.out.println("Input set: " + set);

		List<Integer> sortedList = SetToSortedList.setToSortedList(set);
		
		System.out.println("Sorted list: " + sortedList);
	}
}
