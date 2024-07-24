package org.example;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    private int end = 0; private int front = 0; private int size = 0;

    public CircularQueue(int size){
        data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }
}