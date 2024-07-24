package org.example;

/**
 * The Node class represents a node in a linked list.
 * Each node contains an integer data and a reference to the next node in the list.
 */
public class Node {
    private int data;
    private Node next;

    /**
     * Constructs a Node with the specified data.
     *
     * @param data the data to be stored in the node
     */
    public Node(int data) {
        this.data = data;
    }

    /**
     * Constructs a Node by copying data from another Node.
     *
     * @param old the Node to be copied
     */
    public Node(Node old) {
        this(old.data);
    }

    /**
     * Returns the data stored in this node.
     *
     * @return the data stored in this node
     */
    public int getData() {
        return data;
    }

    /**
     * Sets the data stored in this node.
     *
     * @param data the data to be stored in this node
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Returns the next node in the list.
     *
     * @return the next node in the list
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node in the list.
     *
     * @param next the node to be set as the next node in the list
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Returns a string representation of the node.
     *
     * @return a string representation of the node in the format [data]
     */
    @Override
    public String toString() {
        return String.format("[%s]", data);
    }
}
