package com.Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
        this.end = 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        this.data[end++] = item;
        return true;
    }

    // Complexity: O(N)
    public int remove() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = this.data[0];
        // shift the elements to left.
        for (int i = 1; i < end; i++) {
            this.data[i-1] = this.data[i];
        }
        this.end--;
        return removed;
    }

    public int front() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return this.data[0];
    }

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

    public boolean isFull(){
        return this.end == this.data.length;
    }

    public boolean isEmpty(){
        return this.end == 0;
    }
}
