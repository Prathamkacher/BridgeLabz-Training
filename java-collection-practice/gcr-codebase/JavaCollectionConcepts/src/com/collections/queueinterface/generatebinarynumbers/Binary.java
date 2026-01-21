package com.collections.queueinterface.generatebinarynumbers;

public class Binary {

	private ToBinary binary;
	
	public Binary() {
		binary = new ToBinary();
	}
	
	public void generateNBinaries(int n) {
		for(int i = 1; i < n; i++) {
			System.out.println(binary.toBinary(i) + " ");
		}
	}
}
