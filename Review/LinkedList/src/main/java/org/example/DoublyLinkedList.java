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
    private int size;
    public DoublyLinkedList() {
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value, head, null);
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void display(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void displayRev(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.print(temp + " <-> ");
            temp = temp.prev;
        }
        System.out.print("END");
    }
}
