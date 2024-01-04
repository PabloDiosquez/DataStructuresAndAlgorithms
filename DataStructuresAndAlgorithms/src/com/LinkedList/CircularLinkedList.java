package com.LinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(4);
        list.insert(11);
        list.insert(23);
        list.insert(-8);
        list.insert(10);

        list.display();
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList(){
        this.size = 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        this.size++;
        if(this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }

        this.tail.next = node;
        node.next = this.head;
        this.tail = node;
    }

    public void display(){
        Node temp = this.head;

        if(this.head == null){
            System.out.println("Empty list");
            return;
        }

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while(temp != this.head);
        System.out.print("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this(value);
            this.next = next;
        }
        public Node(Node node){
            this(node.value, node.next);
        }

        @Override
        public String toString() {
            return "Node value: %s".formatted(this.value);
        }
    }
}
