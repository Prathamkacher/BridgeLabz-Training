package com.day2.texteditor;

public class Action {
	String type;
	String text;
	
	Action(String type, String text){
		this.type = type;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return type + ": " + text;
	}
}
