package com.LinkedList;

public class LinkedList {
    private Node head;

    // Constructor
    public LinkedList() {
        // Initialize an empty linked list with a null head
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node node = new Node(data, null);

        if (this.head == null) {
            // If the list is empty, set the new node as the head
            this.head = node;
        } else {
            // Traverse to the end and add the new node
            Node temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    // Method to insert a new node at a specific index in the linked list
    public void insertAt(int index, int data) throws Exception {
        if (index < 0) {
            // Throw an exception if the index is negative
            throw new Exception("Index cannot be negative.");
        }

        int currentIndex = 0;
        Node prev = null;
        Node current = this.head;

        // Traverse to the specified index or the end of the list
        while (current != null && currentIndex < index) {
            prev = current;
            current = current.getNext();
            currentIndex++;
        }

        if (currentIndex < index) {
            // Throw an exception if the index is out of bounds
            throw new Exception("Index out of bounds.");
        }

        if (prev == null) {
            // Insert at the beginning of the list
            this.head = new Node(data, this.head);
        } else {
            // Insert at the specified index
            prev.setNext(new Node(data, current));
        }
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtStart(int data) throws Exception {
        // Wrapper method to insert at index 0
        this.insertAt(0, data);
    }

    // Method to delete a node at a specific index in the linked list
    public int delete(int index) throws Exception {
        if (index < 0) {
            // Throw an exception if the index is negative
            throw new Exception("Index cannot be negative");
        }

        int currentIndex = 0;
        Node prev = null;
        Node current = this.head;

        // Traverse to the specified index or the end of the list
        while (current != null && currentIndex < index) {
            prev = current;
            current = current.getNext();
            currentIndex++;
        }

        if (currentIndex < index) {
            // Throw an exception if the index is out of bounds
            throw new Exception("Index out of bounds");
        } else {
            if (prev != null) {
                // Delete the node at the specified index
                prev.setNext(current.getNext());
                return current.getData();
            } else {
                // Delete the first node when the list is not empty
                this.head = current.getNext();
                return this.head.getData();
            }
        }
    }

    // Method to display the elements of the linked list
    public void show() {
        Node node = this.head;
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }
}
