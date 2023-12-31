package com.LinkedList;

public class Node {
    private int data;
    private Node next;

    // Constructor
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [%s:]".formatted(this.getData());
    }
}
