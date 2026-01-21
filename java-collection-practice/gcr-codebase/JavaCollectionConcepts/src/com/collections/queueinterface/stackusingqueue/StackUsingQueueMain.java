package com.collections.queueinterface.stackusingqueue;

public class StackUsingQueueMain {

	public static void main(String[] args) {
		
		StackUsingQueues stack = new StackUsingQueues();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop());
	}
}
