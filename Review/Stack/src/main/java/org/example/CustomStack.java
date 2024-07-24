package org.example;

/**
 * The CustomStack class represents a simple stack data structure implemented using an array.
 * It provides methods to push, pop, peek, and check if the stack is empty or full.
 */
public class CustomStack {
    protected int[] data;
    protected int pointer;
    private static final int DEFAULT_SIZE = 10;

    /**
     * Constructs a CustomStack with the specified size.
     *
     * @param size the size of the stack
     */
    public CustomStack(int size){
        this.data = new int[size];
        this.pointer = -1;
    }

    /**
     * Constructs a CustomStack with the default size.
     */
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack
     * @return {@code true} if the item was successfully pushed onto the stack,
     *         {@code false} if the stack is full
     */
    public boolean push(int item) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[++pointer] = item;
        return true;
    }

    /**
     * Removes the item at the top of this stack and returns that object as the value of this function.
     *
     * @return the item at the top of this stack
     * @throws StackException if this stack is empty
     */
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[pointer--];
    }

    /**
     * Looks at the item at the top of this stack without removing it from the stack.
     *
     * @return the item at the top of this stack
     * @throws StackException if this stack is empty
     */
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[pointer];
    }

    /**
     * Tests if this stack is full.
     *
     * @return {@code true} if this stack is full, {@code false} otherwise
     */
    public boolean isFull() {
        return pointer == data.length - 1;
    }

    /**
     * Tests if this stack is empty.
     *
     * @return {@code true} if this stack is empty, {@code false} otherwise
     */
    public boolean isEmpty(){
        return pointer == -1;
    }
}