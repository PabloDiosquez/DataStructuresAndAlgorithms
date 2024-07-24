package org.example;

/**
 * The CircularQueue class represents a circular queue data structure implemented using an array.
 * It provides methods to insert, remove, get the front element, check if the queue is empty or full,
 * and display the contents of the queue.
 */
public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    /**
     * Constructs a CircularQueue with the specified size.
     *
     * @param size the size of the queue
     */
    public CircularQueue(int size) {
        data = new int[size];
    }

    /**
     * Constructs a CircularQueue with the default size.
     */
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    /**
     * Inserts an item at the end of the queue.
     *
     * @param item the item to be inserted
     */
    public void insert(int item) {
        if (isFull()) {
            return;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
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
        int removed = data[front++];
        front = front % data.length;
        size--;
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
        return data[front];
    }

    /**
     * Displays the contents of the queue.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " - ");
            i = (i + 1) % data.length;
        } while (i != end);
        System.out.println("END");
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks if the queue is full.
     *
     * @return {@code true} if the queue is full, {@code false} otherwise
     */
    public boolean isFull() {
        return size == data.length;
    }
}
