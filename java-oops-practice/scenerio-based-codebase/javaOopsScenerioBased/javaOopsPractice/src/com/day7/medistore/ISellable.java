package com.day7.medistore;

public interface ISellable {
	void sell(int quantity);
	boolean checkExpiry();
}
