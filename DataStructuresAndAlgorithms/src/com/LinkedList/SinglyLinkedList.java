package com.LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(3);
        list.insertFirst(25);
        list.insertFirst(11);
        list.insertFirst(-12);

        list.display();
    }
    private Node head;

    private Node tail;

    private int size;

    public SinglyLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
        if(this.tail == null){
            this.tail = this.head;
        }
        this.size++;
    }
    public void insertLast(int value){
        if(this.tail == null){
            this.insertFirst(value);
            return;
        }
        Node node = new Node(value);
        this.tail.next = node;
        this.tail      = node;
        this.size++;
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(Node node){
            this(node.value, node.next);
        }
    }

}
