package com.collections.listinterface.reverselist;

import java.util.*;

public class ReverseListMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println("ArrayList Before reversing: " + arrayList);
		ReverseList.reverseArrayList(arrayList);
		System.out.println("ArrayList After reversing: " + arrayList);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.add(9);
		linkedList.add(10);
		
		System.out.println("LinkedList Before reversing: " + linkedList);
		LinkedList<Integer> reversedLinkedList = ReverseList.reverseLinkedList(linkedList);
		System.out.println("LinkedList After reversing: " + reversedLinkedList);
	}
}
