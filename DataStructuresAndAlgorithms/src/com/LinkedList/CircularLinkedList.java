package com.LinkedList;

/**
 * Represents a circular linked list with basic operations such as insertion and deletion.
 */
public class CircularLinkedList {

    /**
     * The main method to test the functionality of the circular linked list.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(4);
        list.insert(11);
        list.insert(23);
        list.insert(-8);
        list.insert(10);

        list.display();

        System.out.println();
        list.delete(4);
        list.display();
    }

    /**
     * Represents a node in the circular linked list.
     */
    private class Node {
        /**
         * The value of the node.
         */
        private int value;

        /**
         * The reference to the next node in the list.
         */
        private Node next;

        /**
         * Initializes a new node with the given value.
         *
         * @param value The value of the node.
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * Initializes a new node with the given value and reference to the next node.
         *
         * @param value The value of the node.
         * @param next  The next node in the list.
         */
        public Node(int value, Node next) {
            this(value);
            this.next = next;
        }

        /**
         * Initializes a new node as a copy of the given node.
         *
         * @param node The node to copy.
         */
        public Node(Node node) {
            this(node.value, node.next);
        }

        /**
         * Returns a string representation of the node.
         *
         * @return A string representation of the node.
         */
        @Override
        public String toString() {
            return "Node value: " + this.value;
        }
    }

    /**
     * The head of the circular linked list.
     */
    private Node head;

    /**
     * The tail of the circular linked list.
     */
    private Node tail;

    /**
     * The size of the circular linked list.
     */
    private int size;

    /**
     * Initializes an empty circular linked list.
     */
    public CircularLinkedList() {
        this.size = 0;
    }

    /**
     * Inserts a new node with the specified value at the end of the circular linked list.
     *
     * @param value The value to be inserted.
     */
    public void insert(int value) {
        Node node = new Node(value);
        this.size++;

        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }

        this.tail.next = node;
        node.next = this.head;
        this.tail = node;
    }

    /**
     * Deletes the first occurrence of a node with the specified value from the circular linked list.
     *
     * @param value The value to be deleted.
     */
    public void delete(int value) {
        Node temp = this.head;

        if (temp == null) {
            return;
        }

        this.size--;

        if (temp.value == value) {
            this.head = this.head.next;
            this.tail.next = this.head;
            return;
        }

        do {
            Node n = temp.next;
            if (n.value == value) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != this.head);
    }

    /**
     * Displays the elements of the circular linked list.
     */
    public void display() {
        Node temp = this.head;

        if (this.head == null) {
            System.out.println("Empty list");
            return;
        }

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != this.head);
        System.out.print("HEAD");
    }
}
