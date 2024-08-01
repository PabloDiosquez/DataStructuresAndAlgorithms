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
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        System.out.println((temp == null) ? "The list is empty" : getDisplayString(temp));
    }

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
