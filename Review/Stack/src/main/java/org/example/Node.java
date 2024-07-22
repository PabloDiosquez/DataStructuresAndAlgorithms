package org.example;
/*
    Represents a node in a linked list with an integer data and a reference
    to the next node.
* */
public class Node {
    private int data;
    private Node next;

    /**
     * Constructor to initialize the Node with given data and next node reference.
     * @param data the data to be stored in the node.
     * @param next the reference to the next node in the list.
     */
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Copy constructor to create a new Node from an existing Node.
     * @param old the existing node to copy from.
     */
    public Node(Node old) {
        this(old.data, old.next);
    }

    /**
     * Getter for the data field.
     * @return the data stored in the node.
     */
    public int getData() {
        return data;
    }

    /**
     * Setter for the data field.
     * @param data the new data to be stored in the node.
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Getter for the next field.
     * @return the reference to the next node in the list.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Setter for the next field.
     * @param next the new reference to the next node in the list.
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Overrides the toString method to provide a string representation of the node.
     * @return a string representation of the node in the format "[data]".
     */
    @Override
    public String toString() {
        return String.format("[%s]", this.data);
    }
}

