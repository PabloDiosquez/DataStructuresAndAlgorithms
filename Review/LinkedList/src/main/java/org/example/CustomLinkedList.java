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

    // O(1)
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    // O(1)
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

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

    public int deleteFirst() throws Exception{
        if(head == null){
            throw new Exception("Cannot delete from an empty list");
        }
        int deleted = head.value;
        head = head.next;
        size--;
        if(head == null) tail = null;
        return deleted;
    }

    public int deleteLast() throws Exception{
        if(head == null){
            throw new Exception("Cannot delete from an empty list");
        }

        int deleted = tail.value;
        if(size == 1){
            head = null; tail = null;
        } else {
            Node temp = head;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
        return deleted;
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
