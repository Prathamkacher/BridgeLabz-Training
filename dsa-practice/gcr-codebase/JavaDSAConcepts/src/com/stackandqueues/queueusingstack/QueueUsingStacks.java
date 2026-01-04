package com.stackandqueues.queueusingstack;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        inStack.push(x);
        System.out.println(x + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {

        // Transfer elements if needed
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        if (outStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return outStack.pop();
    }

    // Display queue elements
    public void display() {
        if (inStack.isEmpty() && outStack.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");

        // outStack (top to bottom)
        for (int i = outStack.size() - 1; i >= 0; i--) {
            System.out.print(outStack.get(i) + " ");
        }

        // inStack (bottom to top)
        for (int i = 0; i < inStack.size(); i++) {
            System.out.print(inStack.get(i) + " ");
        }

        System.out.println();
    }
}
