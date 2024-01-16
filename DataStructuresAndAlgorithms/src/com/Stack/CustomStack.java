package com.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int pointer;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
        this.pointer = -1;
    }

    public boolean push(int item){
        if(this.IsNotFull()){
            this.pointer++;
            this.data[pointer] = item;
            return true;
        }
        System.out.println("Stack is full");
        return false;
    }

    public int pop() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Cannot pop from an empty stack!");
        }
        //int removed = this.data[pointer];
        //pointer--;
        //return removed;
        return data[pointer--];
    }

    public int peek() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Cannot peek from an empty stack!");
        }
        return this.data[pointer];
    }

    private boolean IsNotFull() {
        return this.pointer < this.data.length-1;
    }

    private boolean isEmpty(){
        return this.pointer == -1;
    }
}
