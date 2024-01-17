package com.Queue;

/**
 * CircularQueue is a class that implements a circular queue using an array.
 * It supports basic operations such as insertion, removal, front retrieval,
 * display of elements, and checks for empty or full states in a circular manner.
 */
public class CircularQueue {

    // The array to store queue elements.
    private int[] data;

    // The default size of the queue when no size is specified.
    private static final int DEFAULT_SIZE = 10;

    // Pointers to the front and end of the queue.
    private int front;
    private int end;

    // The current size of the queue.
    private int size;

    /**
     * Constructs a new CircularQueue with the default size.
     */
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    /**
     * Constructs a new CircularQueue with the specified size.
     *
     * @param size The size of the queue.
     */
    public CircularQueue(int size){
        this.data  = new int[size];
        this.front = 0;
        this.end   = 0;
        this.size  = 0;
    }

    /**
     * Inserts an element into the circular queue.
     *
     * @param item The element to be inserted.
     * @return True if the insertion is successful, false if the queue is full.
     */
    // Complexity: O(1)
    public boolean insert(int item){
        if(this.isFull()){
            return false;
        }
        this.data[end++] = item;
        end = end % this.data.length; // Wrap around if the end reaches the array length.
        this.size++;
        return true;
    }

    /**
     * Removes and returns the front element from the circular queue.
     *
     * @return The removed element.
     * @throws Exception if the queue is empty.
     */
    // Complexity: O(1)
    public int remove() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = this.data[front++];
        front = front % this.data.length; // Wrap around if the front reaches the array length.
        this.size--;
        return removed;
    }

    /**
     * Retrieves the front element of the circular queue without removing it.
     *
     * @return The front element.
     * @throws Exception if the queue is empty.
     */
    public int front() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return this.data[front];
    }

    /**
     * Displays the elements of the circular queue.
     * If the queue is empty, it prints "Queue is empty!".
     */
    public void display(){
        if(this.isEmpty()){
            System.out.print("Queue is empty!");
            return;
        }
        int i = this.front;
        do {
            System.out.print(this.data[i] + " -> ");
            i++;
            i %= this.data.length; // Wrap around if 'i' reaches the array length.
        } while(i != this.end);
        System.out.print("END");
    }

    /**
     * Checks if the circular queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Checks if the circular queue is full.
     *
     * @return True if the queue is full, false otherwise.
     */
    public boolean isFull(){
        return this.data.length == size;
    }
}
