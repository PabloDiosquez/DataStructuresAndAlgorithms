package com.Stack;

public class Stack {
    // Constant for the maximum capacity of the stack
    final static int CAPACITY = 5;

    // Variable to track the top of the stack
    private int top = 0;

    // Array to store elements in the stack
    private final int[] stack = new int[CAPACITY];

    // Method to push an element onto the stack
    public void push(int element) throws Exception {
        // Check if the stack is not full
        if (top != CAPACITY) {
            // Add the element to the stack and increment the top
            this.stack[top] = element;
            top++;
        } else {
            // Throw an exception if the stack is full
            throw new Exception("The stack is full! Maximum capacity.");
        }
    }

    // Method to pop an element from the stack
    public int pop() throws Exception {
        // Check if the stack is not empty
        if (this.isNotEmpty()) {
            // Decrement the top, retrieve the element, and clear the position
            top--;
            int element = this.stack[top];
            this.stack[top] = 0;
            return element;
        } else {
            // Throw an exception if the stack is empty
            throw new Exception("The stack is empty");
        }
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() throws Exception {
        // Check if the stack is not empty
        if (this.isNotEmpty()) {
            // Return the top element
            return stack[top - 1];
        } else {
            // Throw an exception if the stack is empty
            throw new Exception("The stack is empty!");
        }
    }

    // Method to check if the stack is not empty
    public boolean isNotEmpty() {
        return this.top != 0;
    }
}