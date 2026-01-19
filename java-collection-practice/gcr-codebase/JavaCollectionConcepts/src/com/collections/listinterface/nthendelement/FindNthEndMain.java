package com.collections.listinterface.nthendelement;

import java.util.*;


public class FindNthEndMain {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		int n = 2;
		
		String result = FindNthEnd.findNthEnd(list, n);
		
		System.out.println("List: " + list);
		System.out.println("Nth end element: (N = " + n + "): " + result);
	}
}
