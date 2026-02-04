package com.multithreading.restrauntorder;

public class Chef extends Thread{
	
	private String dish;
	private int totalTime;
	
	public Chef(String name, String dish, int totalTime) {
		super(name);
		this.dish = dish;
		this.totalTime = totalTime;
	}
	
	@Override
	public void run() {
		int stepTime = totalTime / 4;
		int[] progress = {25, 50, 75, 100};
		
		for(int p : progress) {
			try {
				Thread.sleep(stepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
		}
		
		System.out.println(getName() + " completed " + dish);
	}
}
