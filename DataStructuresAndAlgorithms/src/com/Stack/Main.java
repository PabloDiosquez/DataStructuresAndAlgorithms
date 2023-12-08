package com.Stack;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        // Create a new stack
        Stack myStack = new Stack();

        try {
            // Push elements onto the stack
            myStack.push(10);
            myStack.push(20);
            myStack.push(30);

            // Peek at the top element
            System.out.println("Peek: " + myStack.peek());

            // Pop elements from the stack
            System.out.println("Pop: " + myStack.pop());
            System.out.println("Pop: " + myStack.pop());

            // Check if the stack is not empty
            if (myStack.isNotEmpty()) {
                System.out.println("Stack is not empty.");
            } else {
                System.out.println("Stack is empty.");
            }

            // Try to pop from an empty stack (will throw an exception)
            // System.out.println("Pop: " + myStack.pop());
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Exception: " + e.getMessage());
        }*/

        // Create a new dynamic stack
        DynamicStack myStack = new DynamicStack();

        try {
            // Push elements onto the stack
            myStack.push(10);
            myStack.push(20);
            myStack.push(30);

            // Peek at the top element without removing it
            System.out.println("Peek: " + myStack.peek());

            // Pop elements from the stack
            System.out.println("Pop: " + myStack.pop());
            System.out.println("Pop: " + myStack.pop());

            // Check if the stack is not empty
            if (myStack.isNotEmpty()) {
                System.out.println("Stack is not empty.");
            } else {
                System.out.println("Stack is empty.");
            }

            // Push more elements to demonstrate resizing
            myStack.push(40);
            myStack.push(50);
            myStack.push(60);

            // Peek and pop elements from the resized stack
            System.out.println("Peek: " + myStack.peek());
            System.out.println("Pop: " + myStack.pop());
            System.out.println("Pop: " + myStack.pop());
            System.out.println("Pop: " + myStack.pop());

            // Check if the stack is not empty after all operations
            if (myStack.isNotEmpty()) {
                System.out.println("Stack is not empty.");
            } else {
                System.out.println("Stack is empty.");
            }

            // Try to pop from an empty stack (will throw an exception)
            // System.out.println("Pop: " + myStack.pop());
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Exception: " + e.getMessage());
        }
    }
}