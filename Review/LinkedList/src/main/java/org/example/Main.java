package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(1);
        list.insert(21);
        //list.insertAtStart(14);
        list.show();
        list.insertAt(100, 3);
        System.out.println();
        list.show();
    }
}