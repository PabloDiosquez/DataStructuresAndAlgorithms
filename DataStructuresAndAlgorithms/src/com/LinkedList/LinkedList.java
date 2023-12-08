package com.LinkedList;

public class LinkedList {
    private Node head;

    // Methods
    public void insert(int data){
        Node node = new Node(data, null);

        if(this.head == null){
            this.head = node;
        }
        else {
            Node temp = this.head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void insertAt(int index, int data) throws Exception {
        if (index < 0) {
            throw new Exception("Index cannot be negative.");
        }

        int currentIndex = 0;
        Node prev = null;
        Node current = this.head;

        while(current != null && currentIndex < index){
            prev = current;
            current = current.getNext();
            currentIndex++;
        }

        if (currentIndex < index) {
            throw new Exception("Index out of bounds.");
        }

        if (prev == null) {
            // Insert at the beginning of the list
            this.head = new Node(data, this.head);
        } else {
            prev.setNext(new Node(data, current));
        }
    }

    public void insertAtStart(int data) throws Exception {
        this.insertAt(0, data);
    }

    public int delete(int index) throws Exception {
        if(index < 0) throw new Exception("Index cannot be negative");

        int currentIndex = 0;
        Node prev = null;
        Node current = this.head;

        while(current != null && currentIndex < index){
            prev = current;
            current = current.getNext();
            currentIndex++;
        }

        if(currentIndex < index) throw new Exception("Index out of bounds");
        else {
            if (prev != null) {
                prev.setNext(current.getNext());
                return current.getData();
            } else {
                this.head = current.getNext();
                return this.head.getData();
            }
        }
    }
    public void show(){
        Node node = this.head;
        while(node != null){
            System.out.println(node);
            node = node.getNext();
        }
    }
}
