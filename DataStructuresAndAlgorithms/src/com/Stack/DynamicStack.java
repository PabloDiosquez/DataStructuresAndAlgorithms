package com.Stack;

public class DynamicStack {
    // Initial capacity of the stack
    private int capacity = 2;

    // Array to store elements in the stack
    private int[] stack = new int[capacity];

    // Variable to track the top of the stack
    private int top = 0;

    /**
     * Pushes an element onto the stack. If the stack is full, it is resized.
     *
     * @param element The element to be pushed onto the stack.
     */
    public void push(int element) {
        // Check if the stack is full and resize if necessary
        if (this.top == this.capacity) {
            this.resize();
        }

        // Add the element to the stack and increment the top
        this.stack[top] = element;
        top++;
    }

    /**
     * Pops an element from the stack. If the stack becomes less than half full, it is shrunk.
     *
     * @return The popped element.
     * @throws Exception If the stack is empty.
     */
    public int pop() throws Exception {
        // Check if the stack is not empty
        if (this.isNotEmpty()) {
            top--;

            // Check if the stack is less than half full and shrink if necessary
            if (this.top < this.capacity / 2) {
                shrink();
            }

            // Retrieve the element, clear the position, and return the element
            int element = this.stack[top];
            this.stack[top] = 0;
            return element;
        } else {
            // Throw an exception if the stack is empty
            throw new Exception("The stack is empty!");
        }
    }

    /**
     * Peeks at the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     * @throws Exception If the stack is empty.
     */
    public int peek() throws Exception {
        // Check if the stack is not empty
        if (this.isNotEmpty()) {
            return this.stack[top - 1];
        } else {
            // Throw an exception if the stack is empty
            throw new Exception("The stack is empty!");
        }
    }

    /**
     * Checks if the stack is not empty.
     *
     * @return true if the stack is not empty, false otherwise.
     */
    public boolean isNotEmpty() {
        return this.top != 0;
    }

    /**
     * Shrinks the stack by reducing its capacity to half.
     */
    private void shrink() {
        int length = this.top;
        this.capacity = this.capacity / 2;
        int[] newStack = new int[this.capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        this.stack = newStack;
    }

    /**
     * Resizes the stack by doubling its capacity.
     */
    private void resize() {
        int length = this.top;
        this.capacity = this.capacity * 2;
        int[] newStack = new int[this.capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        this.stack = newStack;
    }
}
