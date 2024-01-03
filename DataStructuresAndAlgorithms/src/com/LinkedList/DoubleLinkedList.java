package com.LinkedList;

public class DoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(10);

        list.display();
        System.out.println();
        list.displayRev();
    }

    private Node head;

    private Node tail;

    private int size;

    public DoubleLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value, this.head, null);

        if(this.head != null){
            this.head.prev = node;
        }
        this.head = node;
        this.size++;
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void displayRev(){
        Node last = this.head;
        while(last.next != null){
            last = last.next;
        }

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("END");
    }
    
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this(value);
            this.next = next;
            this.prev = prev;
        }

        public Node(Node node){
            this(node.value, node.next, node.prev);
        }

        @Override
        public String toString() {
            return "Node value: %s".formatted(this.value);
        }
    }
}
