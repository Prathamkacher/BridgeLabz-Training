package com.collections.listinterface.nthendelement;

import java.util.*;


public class FindNthEnd {

	public static String findNthEnd(LinkedList<String> list, int n) {
		
		if(list == null || list.isEmpty() || n <= 0) {
			return null;
		}
		
		int front = 0;
		int back = 0;
		
		for(int i = 0; i < n; i++) {
			if(front >= list.size()) {
				return null;
			}
			front++;
		}
		
		while(front < list.size()) {
			front++;
			back++;
		}
		
		return list.get(back);
	}
}
