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

    public void display(){
        if(head == null){
            System.out.println("The list is empty");
        } else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + " - ");
                temp = temp.next;
            }
            System.out.print("END");
        }
    }
}
