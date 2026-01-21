package com.collections.queueinterface.hospitalsystem;

import java.util.PriorityQueue;

public class HospitalMain {

	public static void main(String[] args) {
		
		PriorityQueue<Patient> pq = new PriorityQueue<Patient>((p1, p2) -> p2.severity - p1.severity);
		
		pq.add(new Patient("Aryaman", 3));
		pq.add(new Patient("Gaurav", 4));
		pq.add(new Patient("Aryan", 6));
		
		System.out.println("Treatement:");
		while(!pq.isEmpty()) {
			Patient p = pq.poll();
			System.out.println(p.name + "(Severity: " + p.severity + ")");
		}
		
	}
}
