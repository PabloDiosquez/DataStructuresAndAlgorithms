package org.example;

public class DoubleLinkedList {

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
}
