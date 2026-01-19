package com.collections.listinterface.reverselist;

import java.util.*;

public class ReverseList {

	// Reverse arraylist
	public static void reverseArrayList(List<Integer> list) {
		int left = 0;
		int right = list.size() - 1;
		
		
		while(left < right) {
			int temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			
			left++;
			right--;
		}
	}
	
	// Reverse linkedlist
	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
		LinkedList<Integer> reversed = new LinkedList<>();
		
		for(Integer val : list) {
			reversed.addFirst(val);
		}
		
		return reversed;
	}
}
