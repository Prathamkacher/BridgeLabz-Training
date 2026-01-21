package com.collections.queueinterface.circularbuffer;

public class Buffer {

	private int[] buffer;
	private int size;
	private int front;
	private int rear;
	private int count;
	
	public Buffer(int size) {
		this.size = size;
		buffer = new int[size];
		front = 0;
		rear = 0;
		count = 0;
	}
	
	public void insert(int value) {
		
		if(count == size) {
			front = (front + 1) % size;
			count--;
		}
		
		buffer[rear] = value;
		rear = (rear + 1) % size;
		count++;
	}
	
	public void display() {
		System.out.print("Buffer: [");
		for(int i = 0; i < count; i++) {
			System.out.print(buffer[(front + i) % size] + " ");
		}
		System.out.println("]");
	}
}
