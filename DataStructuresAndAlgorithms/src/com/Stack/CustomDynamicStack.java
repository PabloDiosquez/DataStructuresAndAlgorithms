package com.Stack;

/**
 * CustomDynamicStack is a subclass of CustomStack that allows dynamic resizing of the underlying array
 * when the stack is full and a new element needs to be pushed onto it.
 */
public class CustomDynamicStack extends CustomStack {

    /**
     * Constructs a dynamic stack with the default size.
     * Calls the default constructor of the superclass CustomStack.
     */
    public CustomDynamicStack() {
        super();
    }

    /**
     * Constructs a dynamic stack with the specified size.
     * Calls the parameterized constructor of the superclass CustomStack.
     *
     * @param size The initial size of the dynamic stack.
     */
    public CustomDynamicStack(int size) {
        super(size);
    }

    /**
     * Overrides the push method of CustomStack to provide dynamic resizing functionality.
     * If the stack is full, it doubles the size of the underlying array and then pushes the item onto the stack.
     *
     * @param item The item to be pushed onto the stack.
     * @return True if the push operation is successful, false if the stack is full and resizing fails.
     */
    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // Create a new array with double the size of the current array
            int[] temp = new int[this.data.length * 2];

            // Copy existing elements from the old array to the new array
            System.arraycopy(data, 0, temp, 0, this.data.length);

            // Update the reference to the underlying array
            this.data = temp;
        }
        // Delegate the push operation to the superclass CustomStack
        return super.push(item);
    }
}
