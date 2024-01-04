package com.LinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {

    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList(){
        this.size = 0;
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
    }
}
