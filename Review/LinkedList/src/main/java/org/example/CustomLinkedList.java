package org.example;

/**
 * A custom implementation of a singly linked list.
 */
public class CustomLinkedList {

    /**
     * Represents a node in the linked list.
     */
    public class Node {
        private int value;
        private Node next;

        /**
         * Constructs a new node with the given value.
         *
         * @param value the value of the node
         */
        public Node(int value) {
            this(value, null);
        }

        /**
         * Constructs a new node with the given value and next node reference.
         *
         * @param value the value of the node
         * @param next the next node in the list
         */
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.format("%s", value);
        }
    }

    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructs an empty linked list.
     */
    public CustomLinkedList() {
        size = 0;
    }

    /**
     * Inserts a value at the beginning of the list.
     *
     * @param value the value to be inserted
     */
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    /**
     * Inserts a value at the end of the list.
     *
     * @param value the value to be inserted
     */
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    /**
     * Inserts a value at a specified index in the list.
     *
     * @param value the value to be inserted
     * @param index the index where the value should be inserted
     * @throws Exception if the index is out of bounds
     */
    public void insert(int value, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    /**
     * Deletes the first node in the list.
     *
     * @return the value of the deleted node
     * @throws Exception if the list is empty
     */
    public int deleteFirst() throws Exception {
        if (head == null) {
            throw new Exception("Cannot delete from an empty list");
        }
        int deleted = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return deleted;
    }

    /**
     * Deletes the last node in the list.
     *
     * @return the value of the deleted node
     * @throws Exception if the list is empty
     */
    public int deleteLast() throws Exception {
        if (head == null) {
            throw new Exception("Cannot delete from an empty list");
        }
        if (size == 1) {
            return deleteFirst();
        }
        int deleted = tail.value;
        Node node = getNode(size - 2);
        tail = node;
        tail.next = null;
        size--;
        return deleted;
    }

    /**
     * Deletes a node at a specified index in the list.
     *
     * @param index the index of the node to be deleted
     * @return the value of the deleted node
     * @throws Exception if the list is empty or the index is out of bounds
     */
    public int delete(int index) throws Exception {
        if (head == null) {
            throw new Exception("Cannot delete from an empty list");
        }

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node temp = getNode(index - 1);
        int deleted = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return deleted;
    }

    /**
     * Gets the node at a specified index.
     *
     * @param index the index of the node
     * @return the node at the specified index
     */
    private Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Finds the first node with the specified value.
     *
     * @param value the value to search for
     * @return the first node with the specified value, or null if not found
     */
    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * Displays the contents of the list.
     */
    public void display() {
        Node temp = head;
        System.out.println((temp == null) ? "The list is empty" : getDisplayString(temp));
    }

    /**
     * Constructs a display string for the list.
     *
     * @param node the starting node
     * @return the display string
     */
    private String getDisplayString(Node node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.value).append(" -> ");
            node = node.next;
        }
        sb.append("END");
        return sb.toString();
    }
}
