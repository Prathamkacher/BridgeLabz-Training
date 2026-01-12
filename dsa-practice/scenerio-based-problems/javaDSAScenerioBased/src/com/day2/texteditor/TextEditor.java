package com.day2.texteditor;

import java.util.Stack;

public class TextEditor {
	private Stack<Action> undoStack = new Stack<>();
	private Stack<Action> redoStack = new Stack<>();
	
	//Insert operation
	public void insert(String text) {
		Action action = new Action("Insert", text);
		undoStack.push(action);
		redoStack.clear();
		System.out.println("Inserted: " + text);
	}
	
	//Delete operation
	public void delete(String text) {
		Action action = new Action("Delete", text);
		undoStack.push(action);
		redoStack.clear();
		System.out.println("Deleted: " + text);
	}
	
	//Undo
	public void undo() {
		if (!undoStack.isEmpty()) {
			Action action = undoStack.pop();
			redoStack.push(action);
			System.out.println("Undo: " + action);
		}
		else {
			System.out.println("Nothing to Undo");
		}
	}
	
	//Redo
	public void redo() {
		if (!redoStack.isEmpty()) {
			Action action = redoStack.pop();
			undoStack.push(action);
			System.out.println("Redo: " + action);
		}
		else {
			System.out.println("Nothing to Redo");
		}
	}
}
