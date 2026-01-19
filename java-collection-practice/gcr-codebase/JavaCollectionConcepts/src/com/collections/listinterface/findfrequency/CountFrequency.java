package com.collections.listinterface.findfrequency;

import java.util.*;

public class CountFrequency {
	
	public static Map<String, Integer> countFrequency(List<String> list) {
		
		Map<String, Integer> mapFrequency = new HashMap<>();
		
		for(String item : list) {
			if(mapFrequency.containsKey(item)) {
				mapFrequency.put(item, mapFrequency.get(item) + 1);
			} else {
				mapFrequency.put(item, 1);
			}
			
		}
		return mapFrequency;
	}
}
