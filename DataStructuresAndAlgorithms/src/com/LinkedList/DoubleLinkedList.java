package com.LinkedList;

/**
 * Represents a doubly linked list with basic operations such as insertion and display.
 */
public class DoubleLinkedList {

    /**
     * The head of the linked list.
     */
    private Node head;

    /**
     * The tail of the linked list.
     */
    private Node tail;

    /**
     * The size of the linked list.
     */
    private int size;

    /**
     * Initializes an empty doubly linked list.
     */
    public DoubleLinkedList() {
        this.size = 0;
    }

    /**
     * Inserts a new node with the specified value at the beginning of the list.
     *
     * @param value The value to be inserted.
     */
    public void insertFirst(int value) {
        Node node = new Node(value, this.head, null);

        if (this.head != null) {
            this.head.prev = node;
        }
        this.head = node;

        if (this.tail == null) {
            this.tail = node;
        }

        this.size++;
    }

    /**
     * Inserts a new node with the specified value at the end of the list.
     *
     * @param value The value to be inserted.
     */
    public void insertLast(int value) {
        Node node = new Node(value, null, this.tail);

        if (this.tail != null) {
            this.tail.next = node;
        }
        this.tail = node;

        if (this.head == null) {
            this.head = node;
        }
        this.size++;
    }

    /**
     * Inserts a new node with the specified value at the given index in the list.
     *
     * @param value The value to be inserted.
     * @param index The index at which the value is to be inserted.
     */
    public void insert(int value, int index) {
        if (index == 0) {
            this.insertFirst(value);
            return;
        }

        if (index == this.size - 1) {
            this.insertLast(value);
            return;
        }

        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;

        this.size++;
    }

    /**
     * Inserts a new node with the specified value after the node with the given value.
     *
     * @param afterValue The value after which the new value is to be inserted.
     * @param value      The value to be inserted.
     */
    public void insertAfter(int afterValue, int value) {
        Node afterNode = this.find(afterValue);

        if (afterNode == null) {
            System.out.println("Node with value " + afterValue + " does not exist.");
            return;
        }

        Node node = new Node(value, afterNode.next, afterNode);
        afterNode.next = node;

        if (node.next != null) {
            node.next.prev = node;
        }

        this.size++;
    }

    /**
     * Finds the first node with the specified value in the list.
     *
     * @param value The value to search for.
     * @return The first node with the specified value, or null if not found.
     */
    public Node find(int value) {
        Node temp = this.head;

        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * Displays the elements of the linked list in forward order.
     */
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    /**
     * Displays the elements of the linked list in reverse order.
     */
    public void displayRev() {
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }

        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("END");
    }

    /**
     * Represents a node in the doubly linked list.
     */
    private class Node {
        /**
         * The value of the node.
         */
        private int value;

        /**
         * The next node in the list.
         */
        private Node next;

        /**
         * The previous node in the list.
         */
        private Node prev;

        /**
         * Initializes a new node with the given value.
         *
         * @param value The value of the node.
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * Initializes a new node with the given value, next node, and previous node.
         *
         * @param value The value of the node.
         * @param next  The next node in the list.
         * @param prev  The previous node in the list.
         */
        public Node(int value, Node next, Node prev) {
            this(value);
            this.next = next;
            this.prev = prev;
        }

        /**
         * Initializes a new node as a copy of the given node.
         *
         * @param node The node to copy.
         */
        public Node(Node node) {
            this(node.value, node.next, node.prev);
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
     * The main method to test the functionality of the doubly linked list.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Test Case 1: Inserting elements at the beginning of the list
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        System.out.println("Doubly Linked List after inserting at the beginning:");
        list.display();  // Output: 30 -> 20 -> 10 -> END
        System.out.println("\n");

        // Test Case 2: Inserting elements at the end of the list
        list.insertLast(40);
        list.insertLast(50);

        System.out.println("Doubly Linked List after inserting at the end:");
        list.display();  // Output: 30 -> 20 -> 10 -> 40 -> 50 -> END
        System.out.println("\n");

        // Test Case 3: Inserting an element at a specific index
        list.insert(25, 2);

        System.out.println("Doubly Linked List after inserting at index 2:");
        list.display();  // Output: 30 -> 20 -> 25 -> 10 -> 40 -> 50 -> END
        System.out.println("\n");

        // Test Case 4: Inserting an element after a specific value
        list.insertAfter(20, 35);

        System.out.println("Doubly Linked List after inserting after value 20:");
        list.display();  // Output: 30 -> 20 -> 35 -> 25 -> 10 -> 40 -> 50 -> END
        System.out.println("\n");

        // Test Case 5: Displaying the list in reverse order
        System.out.println("Doubly Linked List in reverse order:");
        list.displayRev();  // Output: 50 -> 40 -> 10 -> 25 -> 35 -> 20 -> 30 -> END
    }
}
