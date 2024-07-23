package org.example;

/**
 * The Stack class represents a simple stack data structure implemented using an ArrayList.
 * It provides methods to push, pop, peek, and check if the stack is empty.
 */
public class CustomStack {
    protected int[] data;
    private int pointer;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(int size){
        this.data = new int[size];
        this.pointer = -1;
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int item) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    private boolean isFull() {
        return pointer == data.length;
    }

}

