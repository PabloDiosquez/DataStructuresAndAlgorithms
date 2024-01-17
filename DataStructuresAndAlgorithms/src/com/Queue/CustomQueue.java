package com.Queue;

/**
 * CustomQueue is a simple implementation of a queue using an array.
 * It supports basic operations such as insertion, removal, front retrieval,
 * and display of the elements in the queue.
 */
public class CustomQueue {

    /**
     * The array to store queue elements.
     */
    private int[] data;

    /**
     * The default size of the queue when no size is specified.
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * The index pointing to the end of the queue.
     */
    private int end;

    /**
     * Constructs a new CustomQueue with the default size.
     */
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    /**
     * Constructs a new CustomQueue with the specified size.
     *
     * @param size The size of the queue.
     */
    public CustomQueue(int size){
        this.data = new int[size];
        this.end = 0;
    }

    /**
     * Inserts an element into the queue.
     *
     * @param item The element to be inserted.
     * @return True if the insertion is successful, false if the queue is full.
     */
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        this.data[end++] = item;
        return true;
    }

    /**
     * Removes and returns the front element from the queue.
     *
     * @return The removed element.
     * @throws Exception if the queue is empty.
     */
    // Complexity: O(N)
    public int remove() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = this.data[0];
        // shift the elements to the left.
        for (int i = 1; i < end; i++) {
            this.data[i-1] = this.data[i];
        }
        this.end--;
        return removed;
    }

    /**
     * Retrieves the front element of the queue without removing it.
     *
     * @return The front element.
     * @throws Exception if the queue is empty.
     */
    public int front() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return this.data[0];
    }

    /**
     * Displays the elements of the queue.
     * If the queue is empty, it prints "Queue is empty!".
     */
    public void display(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        for (int i = 0; i < end; i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.print("END");
    }

    /**
     * Checks if the queue is full.
     *
     * @return True if the queue is full, false otherwise.
     */
    public boolean isFull(){
        return this.end == this.data.length;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    public boolean isEmpty(){
        return this.end == 0;
    }
}