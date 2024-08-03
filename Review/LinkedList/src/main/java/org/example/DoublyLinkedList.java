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

    public int getSize() {
        return size;
    }

    public void insertFirst(int value){
        Node node = new Node(value, head, null);
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new Node(value, null, last);
        size++;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = find(index);
        if (temp == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(value, temp, temp.prev);
        if (temp.prev != null) {
            temp.prev.next = node;
        }
        temp.prev = node;

        size++;
    }

    private Node find(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void display(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while(temp != null){
            sb.append(temp.value);
            if(temp.next != null){
                sb.append(" <-> ");
            }
            temp = temp.next;
        }
        sb.append(" END");
        System.out.println(sb.toString());
    }

    public void displayBackwards(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        StringBuilder sb = new StringBuilder();
        while (last != null){
            sb.append(last.value);
            if(last.prev != null){
                sb.append(" <-> ");
            }
            last = last.prev;
        }
        sb.append(" END");
        System.out.println(sb.toString());
    }
}
