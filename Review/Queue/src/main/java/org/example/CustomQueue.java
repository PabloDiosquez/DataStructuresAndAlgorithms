package org.example;

/**
 * The CustomQueue class represents a simple queue data structure implemented using an array.
 * It provides methods to insert, remove, get the front element, and check if the queue is empty or full.
 */
public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    /**
     * Constructs a CustomQueue with the specified size.
     *
     * @param size the size of the queue
     */
    public CustomQueue(int size) {
        data = new int[size];
    }

    /**
     * Constructs a CustomQueue with the default size.
     */
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    /**
     * Inserts an item at the end of the queue.
     *
     * @param item the item to be inserted
     * @return {@code true} if the item was successfully inserted, {@code false} if the queue is full
     */
    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }

    /**
     * Removes an item from the front of the queue.
     *
     * @return the item removed from the front of the queue
     * @throws QueueException if the queue is empty
     */
    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    /**
     * Returns the item at the front of the queue without removing it.
     *
     * @return the item at the front of the queue
     * @throws QueueException if the queue is empty
     */
    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }
        return data[0];
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        return end == 0;
    }

    /**
     * Checks if the queue is full.
     *
     * @return {@code true} if the queue is full, {@code false} otherwise
     */
    public boolean isFull() {
        return end == data.length;
    }

    /**
     * Displays the contents of the queue.
     */
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " - ");
        }
        System.out.println("END");
    }
}
