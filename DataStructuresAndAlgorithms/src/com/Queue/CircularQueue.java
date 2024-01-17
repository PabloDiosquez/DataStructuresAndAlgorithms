package com.Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front;
    private int end;

    private int size;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data  = new int[size];
        this.front = 0;
        this.end   = 0;
        this.size  = 0;
    }

    // Complexity: O(1)
    public boolean insert(int item){
        if(this.isFull()){
            return false;
        }
        this.data[end++] = item;
        end = end % this.data.length;
        this.size++;
        return true;
    }

    public int remove() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = this.data[front++];
        front = front % this.data.length;
        this.size--;
        return removed;
    }

    public int front() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return this.data[front];
    }

    public void display(){
        if(this.isEmpty()){
            System.out.print("Queue is empty!");
            return;
        }
        for (int i = this.front; i < this.end; i++) {
            System.out.print(this.data[i] + " <- ");
        }
        System.out.print("END");
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return this.data.length == size;
    }
}
