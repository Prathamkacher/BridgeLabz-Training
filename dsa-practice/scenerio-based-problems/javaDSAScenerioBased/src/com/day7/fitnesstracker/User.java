package com.day7.fitnesstracker;

public class User {
	String name;
	int steps;
	
	public User(String name, int steps) {
		this.name = name;
		this.steps = steps;
	}
	
	public String toString() {
		return name + " - "+ steps + " steps";
	}
}
