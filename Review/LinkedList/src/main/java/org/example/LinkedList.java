package org.example;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        size = 0;
    }

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
        size++;
    }

    public void insertAt(int data, int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of the bounds");
        }
        
        if(index == 0){
            insertAtStart(data);
            return;
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
        size++;
    }

    public void insertAtStart(int data){
        head = new Node(data, head);
        size++;
    }

    public int deleteAtStart() throws Exception{
        if(head == null){
            throw new Exception("The list cannot be empty.");
        }
        int data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    public int deleteAtEnd() throws Exception {
        if(head == null){
            throw new Exception("The list cannot be empty.");
        }
        return deleteAt(size-1);
    }

    public int deleteAt(int index) throws Exception {
        if(head == null){
            throw new Exception("The list cannot be empty.");
        }

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of the bounds");
        }

        if(index == 0){
            return deleteAtStart();
        }

        int count = 0;
        Node current = head;
        while(count < index-1){
            current = current.getNext();
            count++;
        }
        Node deleted = current.getNext();
        current.setNext(deleted.getNext());
        size--;
        return deleted.getData();
    }

    public void show(int index) throws Exception{
        if(head == null){
            throw new Exception("The list cannot be empty");
        }

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of the bounds");
        }

        int count = 0;
        Node current = head;
        while(count < index){
            current = current.getNext();
            count++;
        }
        System.out.println(current);
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
