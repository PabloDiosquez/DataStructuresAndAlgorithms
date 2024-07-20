package org.example;

public class Node {
    private int data;
    private Node next;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Node old){
        this(old.data, old.next);
    }
    @Override
    public String toString() {
        return String.format("[%s]", this.data);
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
