package org.example;

public class CustomLinkedList {

    private class Node{
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

    public CustomLinkedList() {
    }
}
