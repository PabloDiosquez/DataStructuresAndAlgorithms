package org.example;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int end = 0; protected int front = 0; protected int size = 0;

    public CircularQueue(int size){
        data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public void insert(int item){
        if(isFull()){
            return;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
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

    public int front() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        int i = front;
        do {
            System.out.print(data[i++] + " - ");
            i %= data.length;
        } while (i != end);
        System.out.print("END");
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }
}