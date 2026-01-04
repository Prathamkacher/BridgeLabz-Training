package com.stackandqueues.sortstackrecursive;

import java.util.Stack;

public class SortStack {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    // Helper function to insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int element) {

        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, element);
        stack.push(temp);
    }
}
