package org.example;

/**
 * A class representing a doubly linked list.
 */
public class DoublyLinkedList {

    /**
     * A class representing a node in the doubly linked list.
     */
    public class Node {
        private int value;
        private Node next;
        private Node prev;

        /**
         * Constructs a new node with the specified value.
         *
         * @param value the value of the node
         */
        public Node(int value) {
            this(value, null, null);
        }

        /**
         * Constructs a new node with the specified value, next node, and previous node.
         *
         * @param value the value of the node
         * @param next the next node in the list
         * @param prev the previous node in the list
         */
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return String.format("%s", value);
        }
    }

    private Node head;
    private int size;

    /**
     * Constructs an empty doubly linked list.
     */
    public DoublyLinkedList() {
        size = 0;
    }

    /**
     * Returns the size of the list.
     *
     * @return the number of elements in the list
     */
    public int getSize() {
        return size;
    }

    /**
     * Inserts a new node with the specified value at the beginning of the list.
     *
     * @param value the value to be inserted
     */
    public void insertFirst(int value) {
        Node node = new Node(value, head, null);
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    /**
     * Inserts a new node with the specified value at the end of the list.
     *
     * @param value the value to be inserted
     */
    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new Node(value, null, last);
        size++;
    }

    /**
     * Inserts a new node with the specified value at the specified index in the list.
     *
     * @param index the index at which the value should be inserted
     * @param value the value to be inserted
     */
    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = find(index);
        if (temp == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(value, temp, temp.prev);
        if (temp.prev != null) {
            temp.prev.next = node;
        }
        temp.prev = node;

        size++;
    }

    /**
     * Finds the node at the specified index.
     *
     * @param index the index of the node to be found
     * @return the node at the specified index, or null if the index is out of bounds
     */
    private Node find(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Displays the elements of the list from head to tail.
     */
    public void display() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value);
            if (temp.next != null) {
                sb.append(" <-> ");
            }
            temp = temp.next;
        }
        sb.append(" END");
        System.out.println(sb.toString());
    }

    /**
     * Displays the elements of the list from tail to head.
     */
    public void displayBackwards() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        StringBuilder sb = new StringBuilder();
        while (last != null) {
            sb.append(last.value);
            if (last.prev != null) {
                sb.append(" <-> ");
            }
            last = last.prev;
        }
        sb.append(" END");
        System.out.println(sb.toString());
    }
}
