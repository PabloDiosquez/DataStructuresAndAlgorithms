package com.Stack;

import com.Stack.StackException;

/**
 * CustomStack is a simple implementation of a stack using an array.
 * It provides basic stack operations such as push, pop, and peek.
 */
public class CustomStack {

    /**
     * The underlying array to store stack elements.
     */
    protected int[] data;

    /**
     * The default size of the stack if no size is specified during instantiation.
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * The index indicating the top of the stack.
     */
    private int pointer;

    /**
     * Constructs a stack with the default size.
     */
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    /**
     * Constructs a stack with the specified size.
     *
     * @param size The size of the stack.
     */
    public CustomStack(int size) {
        this.data = new int[size];
        this.pointer = -1;
    }

    /**
     * Pushes an item onto the top of the stack.
     *
     * @param item The item to be pushed onto the stack.
     * @return True if the push operation is successful, false if the stack is full.
     */
    public boolean push(int item) {
        if (this.isNotFull()) {
            this.pointer++;
            this.data[pointer] = item;
            return true;
        }
        System.out.println("Stack is full");
        return false;
    }

    /**
     * Pops the top element from the stack.
     *
     * @return The popped element.
     * @throws StackException If the stack is empty.
     */
    public int pop() throws StackException {
        if (this.isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!");
        }
        return data[pointer--];
    }

    /**
     * Peeks at the top element of the stack without removing it.
     *
     * @return The element at the top of the stack.
     * @throws StackException If the stack is empty.
     */
    public int peek() throws StackException {
        if (this.isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!");
        }
        return this.data[pointer];
    }

    /**
     * Checks if the stack is not full.
     *
     * @return True if the stack is not full, false otherwise.
     */
    private boolean isNotFull() {
        return this.pointer < this.data.length - 1;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return True if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return this.pointer == -1;
    }
}