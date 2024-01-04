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
        // list.displayRev();

        list.insertLast(-1);
        list.insert(23, 3);
        list.insertAfter(2, 111);
        list.insertAfter(-1, 123);
        list.display();
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

        if(this.tail == null){
            this.tail = node;
        }

        this.size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value, null, this.tail);

        if (this.tail != null) {
            this.tail.next = node;
        }
        this.tail = node;

        if(this.head == null){
            this.head = node;
        }
        this.size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            this.insertFirst(value);
            return;
        }

        if(index == this.size - 1){
            this.insertLast(value);
            return;
        }

        Node temp = this.head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;

        this.size++;
    }

    public void insertAfter(int afterValue, int value){
        Node afterNode = this.find(afterValue);

        if(afterNode == null){
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(value, afterNode.next, afterNode);
        afterNode.next = node;

        if(node.next != null){
            node.next.prev = node;
        }

        this.size++;
    }

    public Node find(int value){
        Node temp = this.head;

        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
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
