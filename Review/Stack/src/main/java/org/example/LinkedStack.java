package org.example;

public class LinkedStack {
    private Node top;
    private int size;

    public LinkedStack() {
        size = 0;
    }

    public void push(int data){
        top = new Node(data, top);
        size++;
    }
    public int pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The stack is empty.");
        }
        int data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public int peek() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The stack is empty.");
        }
        return top.getData();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
