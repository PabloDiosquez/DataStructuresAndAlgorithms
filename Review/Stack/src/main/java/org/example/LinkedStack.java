package org.example;

public class LinkedStack {
    private Node top;
    private int size;

    /**
     * Constructor for LinkedStack.
     * Initializes the stack with a size of 0 and the top as null.
     */
    public LinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * Pushes an element onto the stack.
     * @param data the data to be pushed onto the stack.
     */
    public void push(int data) {
        top = new Node(data, top);
        size++;
    }

    /**
     * Pops an element from the stack.
     * @return the data from the top element of the stack.
     * @throws Exception if the stack is empty.
     */
    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("The stack is empty.");
        }
        int data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    /**
     * Peeks at the top element of the stack without removing it.
     * @return the data from the top element of the stack.
     * @throws Exception if the stack is empty.
     */
    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("The stack is empty.");
        }
        return top.getData();
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Gets the current size of the stack.
     * @return the number of elements in the stack.
     */
    public int getSize() {
        return size;
    }
}

