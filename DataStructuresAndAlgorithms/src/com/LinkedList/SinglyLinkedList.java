package com.LinkedList;

/**
 * Represents a singly linked list data structure.
 */
public class SinglyLinkedList {

    /**
     * The main method demonstrating the usage of the SinglyLinkedList class.
     *
     * @param args Command line arguments (not used in this example).
     * @throws Exception If an error occurs during list operations.
     */
    public static void main(String[] args) throws Exception {
        // Create a new instance of the SinglyLinkedList
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert some elements at the beginning of the list
        list.insertFirst(3);
        list.insertFirst(25);
        list.insertFirst(11);
        list.insertFirst(-12);

        // Display the initial state of the list
        list.display();

        // Uncomment and test additional methods
        // list.insertLast(45);
        // list.insert(-1, 3);
        // int item = list.deleteFirst();
        // list.display();
        // System.out.println(list.get(2));
        // list.deleteLast();

        // Delete the element at index 2 and display the updated list
        list.delete(2);
        list.display();
    }

    // Node class represents a node in the linked list
    private class Node {
        private int value;
        private Node next;

        /**
         * Constructs a node with a given value.
         *
         * @param value The value of the node.
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * Constructs a node with a given value and next node reference.
         *
         * @param value The value of the node.
         * @param next  The reference to the next node.
         */
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        /**
         * Copy constructor for Node.
         *
         * @param node The node to be copied.
         */
        public Node(Node node) {
            this(node.value, node.next);
        }

        /**
         * Provides a string representation of the node.
         *
         * @return A string representing the node's value.
         */
        @Override
        public String toString() {
            return "Node value: %s".formatted(this.value);
        }
    }

    // Linked list attributes
    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructs an empty SinglyLinkedList.
     */
    public SinglyLinkedList() {
        this.size = 0;
    }

    /**
     * Inserts a new node with the given value at the beginning of the list.
     *
     * @param value The value to be inserted.
     */
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
        if (this.tail == null) {
            this.tail = this.head;
        }
        this.size++;
    }

    /**
     * Inserts a new node with the given value at the end of the list.
     *
     * @param value The value to be inserted.
     */
    public void insertLast(int value) {
        if (this.tail == null) {
            this.insertFirst(value);
            return;
        }
        Node node = new Node(value);
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    /**
     * Inserts a new node with the given value at the specified index in the list.
     *
     * @param value The value to be inserted.
     * @param index The index at which the value should be inserted.
     */
    public void insert(int value, int index) {
        // Handling special cases for inserting at the beginning or end
        if (index == 0) {
            this.insertFirst(value);
            return;
        }

        if (index == this.size) {
            this.insertLast(value);
            return;
        }

        // Inserting at a specific index
        Node temp = head;
        int j = 1;
        while (j < index) {
            temp = temp.next;
            j++;
        }
        temp.next = new Node(value, temp.next);
        this.size++;
    }

    /**
     * Deletes the first node in the list.
     *
     * @return The value of the deleted node.
     * @throws Exception If the list is empty.
     */
    public int deleteFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty list...");
        }

        int value = this.head.value;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        this.size--;
        return value;
    }

    /**
     * Deletes the last node in the list.
     *
     * @return The value of the deleted node.
     * @throws Exception If an error occurs during the deletion process.
     */
    public int deleteLast() throws Exception {
        if (this.size <= 1) {
            return this.deleteFirst();
        }

        int value = this.tail.value;
        Node temp = this.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        this.tail = temp;
        this.tail.next = null;
        this.size--;
        return value;
    }

    /**
     * Deletes the node at the specified index in the list.
     *
     * @param index The index of the node to be deleted.
     * @return The value of the deleted node.
     * @throws Exception If an error occurs during the deletion process.
     */
    public int delete(int index) throws Exception {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == this.size - 1) {
            return deleteLast();
        }

        Node prev = this.get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        this.size--;
        return value;
    }

    /**
     * Retrieves the node at the specified index in the list.
     *
     * @param index The index of the node to be retrieved.
     * @return The node at the specified index.
     */
    public Node get(int index) {
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Finds the node with the specified value in the list.
     *
     * @param value The value to be searched in the list.
     * @return The node with the specified value, or null if not found.
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
     * Displays the elements of the list.
     */
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
