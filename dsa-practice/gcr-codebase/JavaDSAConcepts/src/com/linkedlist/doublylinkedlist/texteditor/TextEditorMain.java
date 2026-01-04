package com.linkedlist.doublylinkedlist.texteditor;

public class TextEditorMain {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.redo();
        editor.displayCurrent();

        editor.addState("Hello Java");
        editor.displayCurrent();
    }
}
