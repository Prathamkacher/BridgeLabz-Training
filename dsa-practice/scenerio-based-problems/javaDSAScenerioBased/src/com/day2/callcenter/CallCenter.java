package com.day2.callcenter;

import java.util.*;

public class CallCenter {
	private Queue<Customer> normalQueue = new LinkedList<>();
	private PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> a.name.compareTo(b.name));
	private HashMap<String, Integer> callCount = new HashMap<>();
	
	//add incoming call
	public void addCall(Customer c) {
		
		//update call count
		callCount.put(c.name, callCount.getOrDefault(c.name, 0) + 1);
		
		//add to correct queue
		if(c.isVIP) {
			vipQueue.add(c);
			System.out.println("VIP customer added: " + c.name);
		}
		else {
			normalQueue.add(c);
			System.out.println("Normal customer added: " + c.name);
		}
	}
	
	//handle next call
	public void handleCall() {
		Customer next; 
		
		if (!vipQueue.isEmpty()) {
			next = vipQueue.poll();
			System.out.println("Handling VIP customer: " + next.name);
		}
		else if (!normalQueue.isEmpty()) {
			next = normalQueue.poll();
			System.out.println("Handling Normal customer: " + next.name);
		}
		else {
            System.out.println("No calls in queue.");
        }
	}
	
	//display call stats.
	public void showStats() {
		System.out.println("\nCall count per customer:");
        for (String name : callCount.keySet()) {
            System.out.println(name + " → " + callCount.get(name) + " calls");
        }
	}
}
