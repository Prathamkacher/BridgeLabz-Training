package com.collections.queueinterface.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int n) {
		q2.add(n);
		
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public int pop() {
		if(q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return q1.poll();
	}
	
	public int top() {
		if(q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return q1.peek();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}
