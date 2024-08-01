package org.example;

public class SingleLinkedList {

    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return String.format("%s", value);
        }
    }
}
