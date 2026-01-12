package com.day2.callcenter;

public class CallCenterMain {
	public static void main(String[] args) {
		CallCenter center = new CallCenter();
		
		center.addCall(new Customer("Krishna", true));
        center.addCall(new Customer("Aryaman", true));
        center.addCall(new Customer("Gautam", false));
        center.addCall(new Customer("Prashant", false));
        center.addCall(new Customer("Aryaman", true)); // repeat call

        center.handleCall(); // VIP first
        center.handleCall();
        center.handleCall();

        center.showStats();
	}
}
