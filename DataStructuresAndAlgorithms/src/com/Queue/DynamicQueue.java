package com.Queue;

/**
 * DynamicQueue is a class that extends CircularQueue and implements a dynamically resizing circular queue.
 */
public class DynamicQueue extends CircularQueue {

    /**
     * Constructs a new DynamicQueue with the default size.
     */
    public DynamicQueue(){
        super();
    }

    /**
     * Constructs a new DynamicQueue with the specified size.
     *
     * @param size The size of the queue.
     */
    public DynamicQueue(int size){
        super(size);
    }

    /**
     * Inserts an element into the dynamically resizing circular queue.
     * If the queue is full, it doubles the size of the underlying array and then performs the insertion.
     *
     * @param item The element to be inserted.
     * @return True if the insertion is successful, false if the queue is full.
     */
    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            // Create a new array with double the size.
            int[] temp = new int[this.data.length * 2];

            // Copy elements from the old array to the new array.
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[(this.front + i) % this.data.length];
            }

            // Reset front and end pointers and update the data array.
            this.front = 0;
            this.end   = this.data.length;
            this.data  = temp;
        }
        return super.insert(item);
    }
}
