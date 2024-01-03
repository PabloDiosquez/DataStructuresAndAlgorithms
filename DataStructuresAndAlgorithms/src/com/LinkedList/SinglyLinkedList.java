package com.LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) throws Exception{
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(3);
        list.insertFirst(25);
        list.insertFirst(11);
        list.insertFirst(-12);

        list.display();
        list.insertLast(45);
        list.insert(-1, 3);
        int item = list.deleteFirst();
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

    public void insert(int value, int index){
        if(index == 0){
            this.insertFirst(value);
            return;
        }

        if(index == this.size){
            this.insertLast(value);
            return;
        }

        Node temp = head;
        int j = 1;
        while(j < index){
            temp = temp.next;
            j++;
        }
        temp.next = new Node(value, temp.next);
        this.size++;
    }

    public int deleteFirst() throws Exception {
        if(this.size == 0){
            throw new Exception("Empty list...");
        }

        int value = this.head.value;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        this.size--;
        return value;
    }

    public int deleteLast() throws Exception {
        int value = this.tail.value;
        if(this.size <= 1){
            return this.deleteFirst();
        }

        Node temp = this.head;
        while(temp.next.next == null){
            temp = temp.next;
        }
        this.tail = temp;
        this.tail.next = null;
        this.size--;
        return value;
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
