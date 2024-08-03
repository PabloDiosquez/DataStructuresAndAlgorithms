package org.example;

public class CircularLinkedList {

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this(value, null);
        }

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

    public CircularLinkedList() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertLast(int value){
        Node node = new Node(value, head);
        if(head == null){
            head = node; tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

}
