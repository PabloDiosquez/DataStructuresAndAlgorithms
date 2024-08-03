package org.example;

/**
 * A class representing a circular linked list.
 */
public class CLL {

    /**
     * A class representing a node in the circular linked list.
     */
    public class Node {
        private int value;
        private Node next;

        /**
         * Constructs a new node with the specified value.
         *
         * @param value the value of the node
         */
        public Node(int value) {
            this(value, null);
        }

        /**
         * Constructs a new node with the specified value and next node.
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
     * Constructs an empty circular linked list.
     */
    public CLL() {
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
     * Inserts a new node with the specified value into the list.
     *
     * @param value the value to be inserted
     */
    public void insert(int value) {
        Node node = new Node(value, head);
        size++;
        if (isEmpty()) {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
    }

    /**
     * Deletes the first occurrence of the specified value from the list.
     *
     * @param value the value to be deleted
     * @throws Exception if the list is empty
     */
    public void delete(int value) throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot delete from an empty list");
        }
        Node node = head;
        size--;
        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
                if (n == tail) {
                    tail = node;
                }
                break;
            }
            node = node.next;
        } while (node != head);
    }

    /**
     * Displays the elements of the list.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.print("HEAD");
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    private boolean isEmpty() {
        return head == null;
    }
}
