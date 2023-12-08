package com.Queue;

/**
 * Implementation of a circular queue in Java.
 */
public class Queue {

    // Set the maximum capacity for the queue
    final static int CAPACITY = 5;

    // Array to store elements in the queue
    private int[] queue = new int[CAPACITY];

    // Pointers to keep track of the front, rear, and size of the queue
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    /**
     * Adds an element to the end of the queue.
     *
     * @param element The element to be added to the queue.
     * @throws Exception if the queue is full.
     */
    public void enQueue(int element) throws Exception {
        // Check if the queue is not full before adding an element
        if(this.isNotFull()){
            // Add the element to the rear of the queue
            this.queue[rear] = element;
            // Update the rear pointer, considering circular nature
            this.rear = (this.rear + 1) % CAPACITY;
            // Increase the size of the queue
            this.size++;
        } else {
            // Throw an exception if the queue is full
            throw new Exception("The queue is full!");
        }
    }

    /**
     * Removes and returns the front element from the queue.
     *
     * @return The front element of the queue.
     * @throws Exception if the queue is empty.
     */
    public int deQueue() throws Exception {
        // Check if the queue is not empty before dequeuing
        if(this.isNotEmpty()){
            // Retrieve the front element
            int element = this.queue[this.front];
            // Update the front pointer, considering circular nature
            this.front = (this.front + 1) % CAPACITY;
            // Decrease the size of the queue
            this.size--;
            // Return the dequeued element
            return element;
        } else {
            // Throw an exception if the queue is empty
            throw new Exception("The queue is empty!");
        }
    }

    /**
     * Peeks at the front element of the queue without removing it.
     *
     * @return The front element of the queue.
     */
    public int peek() {
        // Return the element at the position of the front pointer
        return this.queue[front];
    }

    /**
     * Checks if the queue is not empty.
     *
     * @return true if the queue is not empty, false otherwise.
     */
    public boolean isNotEmpty(){
        return this.size != 0;
    }

    /**
     * Checks if the queue is not full.
     *
     * @return true if the queue is not full, false otherwise.
     */
    public boolean isNotFull(){
        return this.size != CAPACITY;
    }
}

