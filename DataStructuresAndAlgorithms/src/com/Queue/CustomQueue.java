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
        this.end = -1;
    }

    public boolean isFull(){
        return this.end == this.data.length - 1;
    }

    public boolean isEmpty(){
        return this.end == -1;
    }
}
