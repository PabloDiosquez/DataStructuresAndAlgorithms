package org.example;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue(int size) {
        data = new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    // O(1)
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }

    //O(N)
    public int remove() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws  QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        return data[0];
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull(){
        return end == data.length;
    }
}
