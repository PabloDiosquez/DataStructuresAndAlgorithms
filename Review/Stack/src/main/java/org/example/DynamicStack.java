package org.example;

/**
 * The DynamicStack class represents a stack data structure that can dynamically resize when it becomes full.
 * It extends the CustomStack class and overrides the push method to allow dynamic resizing.
 */
public class DynamicStack extends CustomStack {

    /**
     * Constructs a DynamicStack with the default size.
     */
    public DynamicStack() {
        super();
    }

    /**
     * Pushes an item onto the top of this stack.
     * If the stack is full, it doubles the size of the stack before pushing the item.
     *
     * @param item the item to be pushed onto this stack
     * @return {@code true} if the item was successfully pushed onto the stack
     */
    @Override
    public boolean push(int item) {
        if (isFull()) {
            int[] temp = new int[2 * data.length];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        return super.push(item);
    }
}
