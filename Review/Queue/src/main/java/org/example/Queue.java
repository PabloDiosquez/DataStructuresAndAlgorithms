package org.example;
/**
 * The Queue class represents a simple queue data structure implemented using linked nodes.
 * It provides methods to enqueue, dequeue, peek, and check if the queue is empty.
 */
public class Queue {
    private Node front;
    private Node rear;

    /**
     * Enqueues an item to the rear of the queue.
     *
     * @param data the data to be enqueued
     */
    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = node;
        } else {
            rear.setNext(node);
        }
        rear = node;
    }

    /**
     * Dequeues an item from the front of the queue.
     *
     * @return the data dequeued from the front of the queue
     * @throws QueueException if the queue is empty
     */
    public int dequeue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Cannot dequeue from an empty queue");
        }
        int data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return data;
    }

    /**
     * Returns the item at the front of the queue without removing it.
     *
     * @return the data at the front of the queue
     * @throws QueueException if the queue is empty
     */
    public int peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Cannot peek from an empty queue");
        }
        return front.getData();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        return front == null;
    }
}
