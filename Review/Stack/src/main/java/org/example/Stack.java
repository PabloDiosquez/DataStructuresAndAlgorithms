package org.example;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * The Stack class represents a simple stack data structure implemented using an ArrayList.
 * It provides methods to push, pop, peek, and check if the stack is empty.
 */
public class Stack {
    /** The list that stores the stack elements */
    private List<Integer> stackList;

    /**
     * Default constructor. Initializes an empty stack.
     */
    public Stack() {
        stackList = new ArrayList<>();
    }

    /**
     * Pushes a new element onto the top of the stack.
     *
     * @param data The data to be pushed onto the stack.
     */
    public void push(int data) {
        stackList.add(data);
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return The data from the element at the top of the stack.
     * @throws Exception if the stack is empty.
     */
    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("The stack is empty.");
        }
        int topIndex = stackList.size() - 1;
        int data = stackList.get(topIndex);
        stackList.remove(topIndex);
        return data;
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The data from the element at the top of the stack.
     * @throws Exception if the stack is empty.
     */
    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("The stack is empty.");
        }
        return stackList.get(stackList.size() - 1);
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
}

