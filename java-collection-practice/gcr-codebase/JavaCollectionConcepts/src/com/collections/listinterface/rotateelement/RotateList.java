package com.collections.listinterface.rotateelement;

import java.util.*;

public class RotateList {

	public static List<Integer> rotateList(List<Integer> list, int k) {
		
		int n = list.size();
		List<Integer> rotated = new ArrayList<>();
		
		k = k % n;
		
		for(int i = k; i < n; i++) {
			rotated.add(list.get(i));
		}
		
		for(int i = 0; i < k; i++) {
			rotated.add(list.get(i));
		}
		
		return rotated;
	}
}
