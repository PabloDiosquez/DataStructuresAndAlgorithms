package org.example;

public class DoublyLinkedList {

    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this(value, null, null);
        }

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
    private Node tail;

    private int size;
    public DoublyLinkedList() {
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value, head, null);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        head.prev = node;
        head = node;
        size++;
    }
}
