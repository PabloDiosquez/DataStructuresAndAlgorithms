package org.example;

/**
 * The LinkedList class represents a singly linked list.
 * It contains a reference to the head node and tracks the size of the list.
 */

public class LinkedList {
    /** The head node of the linked list */
    private Node head;

    /** The size of the linked list */
    private int size;

    /**
     * Default constructor. Initializes an empty linked list.
     */
    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Inserts a new node with the specified data at the end of the linked list.
     *
     * @param data The data to be inserted into the new node.
     */
    public void insert(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size++;
    }


    /**
     * Inserts a new node with the specified data at the specified index in the linked list.
     *
     * @param data  The data to be inserted into the new node.
     * @param index The position at which the new node should be inserted.
     * @throws IndexOutOfBoundsException if the index is out of the bounds of the list.
     */
    public void insertAt(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            insertAtStart(data);
            return;
        } else {
            Node newNode = new Node(data, null);
            int count = 0;
            Node currentNode = head;
            while (count < index - 1) {
                currentNode = currentNode.getNext();
                count++;
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
        size++;
    }


    /**
     * Inserts a new node with the specified data at the start of the linked list.
     *
     * @param data The data to be inserted into the new node.
     */
    public void insertAtStart(int data) {
        head = new Node(data, head);
        size++;
    }


    /**
     * Deletes the node at the start of the linked list and returns its data.
     *
     * @return The data from the deleted node.
     * @throws Exception if the list is empty.
     */
    public int deleteAtStart() throws Exception {
        if (head == null) {
            throw new Exception("The list cannot be empty.");
        }
        int data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    /**
     * Deletes the node at the end of the linked list and returns its data.
     *
     * @return The data from the deleted node.
     * @throws Exception if the list is empty.
     */
    public int deleteAtEnd() throws Exception {
        if (head == null) {
            throw new Exception("The list cannot be empty.");
        }
        return deleteAt(size - 1);
    }


    /**
     * Deletes the node at the specified index in the linked list and returns its data.
     *
     * @param index The position of the node to be deleted.
     * @return The data from the deleted node.
     * @throws Exception if the list is empty.
     * @throws IndexOutOfBoundsException if the index is out of the bounds of the list.
     */
    public int deleteAt(int index) throws Exception {
        if (head == null) {
            throw new Exception("The list cannot be empty.");
        }

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            return deleteAtStart();
        }

        int count = 0;
        Node currentNode = head;
        while (count < index - 1) {
            currentNode = currentNode.getNext();
            count++;
        }
        Node nodeToDelete = currentNode.getNext();
        currentNode.setNext(nodeToDelete.getNext());
        size--;
        return nodeToDelete.getData();
    }

    /**
     * Prints the data of the node at the specified index in the linked list.
     *
     * @param index The position of the node whose data is to be printed.
     * @throws Exception if the list is empty.
     * @throws IndexOutOfBoundsException if the index is out of the bounds of the list.
     */
    public void show(int index) throws Exception {
        if (head == null) {
            throw new Exception("The list cannot be empty.");
        }

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        int count = 0;
        Node currentNode = head;
        while (count < index) {
            currentNode = currentNode.getNext();
            count++;
        }
        System.out.println(currentNode);
    }


    /**
     * Prints all the nodes in the linked list from the head to the end.
     * The nodes are printed in the format "data -> data -> ... -> data".
     * If the list is empty, prints a message indicating that the list is empty.
     */
    public void show() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                System.out.print(currentNode + " -> ");
                currentNode = currentNode.getNext();
            }
            System.out.print(currentNode); // Print the last node without the arrow
        }
    }

}
