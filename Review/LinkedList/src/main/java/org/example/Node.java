package org.example;

/**
 * The Node class represents a node in a linked list.
 * Each node contains data and a reference to the next node in the list.
 */
public class Node {
    /** The data stored in the node */
    private int data;

    /** The reference to the next node in the list */
    private Node next;

    /**
     * Default constructor. Creates a node with data set to 0 and no next node.
     */
    public Node() {
    }

    /**
     * Constructor that initializes the node with data and the next node reference.
     *
     * @param data The data to be stored in the node.
     * @param next The reference to the next node.
     */
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Copy constructor that creates a node by copying data and the next reference from another node.
     *
     * @param old The node from which to copy the data and next reference.
     */
    public Node(Node old) {
        this(old.data, old.next);
    }

    /**
     * Returns a string representation of the node.
     *
     * @return A string representation of the node in the format "[data]".
     */
    @Override
    public String toString() {
        return String.format("[%s]", this.data);
    }

    /**
     * Gets the data stored in the node.
     *
     * @return The data stored in the node.
     */
    public int getData() {
        return data;
    }

    /**
     * Gets the reference to the next node in the list.
     *
     * @return The reference to the next node.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the data stored in the node.
     *
     * @param data The data to be stored in the node.
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Sets the reference to the next node in the list.
     *
     * @param next The reference to the next node.
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

