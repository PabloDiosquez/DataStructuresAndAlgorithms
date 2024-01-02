package com.LinkedList;

public class SinglyLinkedList {

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
