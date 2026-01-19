package com.collections.listinterface.rotateelement;

import java.util.*;


public class RotateListMain {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30);
		
		int rotateBy = 2;
		
		List<Integer> result = RotateList.rotateList(list, rotateBy);
		
		System.out.println("Before rotating: " + list);
		System.out.println("After rotating by " + rotateBy + ": " + result);
	}
}
