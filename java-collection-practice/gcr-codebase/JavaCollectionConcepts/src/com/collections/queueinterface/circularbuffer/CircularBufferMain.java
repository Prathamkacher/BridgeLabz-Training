package com.collections.queueinterface.circularbuffer;

public class CircularBufferMain {

	public static void main(String[] args) {
		
		Buffer b = new Buffer(4);
		
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.display();
		
		b.insert(50);
		b.display();
		
		b.insert(60);
		b.display();
	}
}
