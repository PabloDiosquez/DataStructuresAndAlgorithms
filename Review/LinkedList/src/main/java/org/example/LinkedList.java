package org.example;

public class LinkedList {
    private Node head;

    public void insert(int data){
        Node node = new Node(data, null);

        if(head == null){
            head = node;
        } else {
            Node current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public void show(){
        if(head != null){
            Node current = this.head;
            while(current.getNext() != null){
                System.out.print(current + " -> ");
                current = current.getNext();
            }
            System.out.print(current);
        } else {
            System.out.println("The list is empty :(");
        }
    }

}
