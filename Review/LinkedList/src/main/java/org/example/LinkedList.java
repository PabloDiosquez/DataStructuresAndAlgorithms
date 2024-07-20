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

    public void insertAt(int data, int index){
        if(index == 0){
            insertAtStart(data);
        } else {
            Node node = new Node(data, null);
            int count = 0;
            Node current = head;
            while(count < index-1){
                current = current.getNext();
                count++;
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
    }

    public void insertAtStart(int data){
        head = new Node(data, head);
    }

    public void show(){
        if(head == null){
            System.out.println("The list is empty :(");
        } else {
            Node current = this.head;
            while(current.getNext() != null){
                System.out.print(current + " -> ");
                current = current.getNext();
            }
            System.out.print(current);
        }
    }

}
