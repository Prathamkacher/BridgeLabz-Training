/*
 * 6. TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.
 */

package com.day2.texteditor;

import java.util.Scanner;

public class TextEditorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\n--- Text Editor Menu ---");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // newline

            switch (choice) {
            case 1 -> {
                System.out.print("Enter text to insert: ");
                String text = sc.nextLine();
                editor.insert(text);
            }

            case 2 -> {
                System.out.print("Enter text to delete: ");
                String text = sc.nextLine();
                editor.delete(text);
            }

            case 3 -> editor.undo();

            case 4 -> editor.redo();

            case 5 -> {
                System.out.println("Exiting editor...");
                return;
            }

            default -> System.out.println("Invalid choice!");
            }
        }
    }
}
