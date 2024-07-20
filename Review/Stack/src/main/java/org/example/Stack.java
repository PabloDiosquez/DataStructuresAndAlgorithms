package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public void push(int data){
        stack.add(data);
    }

    public int pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The stack is empty");
        }
        int data = stack.getLast();
        stack.remove(stack.size()-1);
        return data;
    }

    public int peek() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The stack is empty");
        }
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
