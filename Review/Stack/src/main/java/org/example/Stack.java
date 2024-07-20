package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stack;
    private int size;

    public Stack(){
        stack = new ArrayList<>();
        size = 0;
    }

    public void enqueue(int data){
        stack.add(data);
        size++;
    }

    public int dequeue() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The stack is empty");
        }
        int data = stack.getLast();
        stack.remove(size-1);
        size--;
        return data;
    }

    public int peek() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The stack is empty");
        }
        return stack.get(size-1);
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
