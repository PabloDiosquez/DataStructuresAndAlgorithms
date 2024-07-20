package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(21);
        list.insert(133);
        list.show();
        System.out.println();
        //list.deleteAt(2);
        //list.deleteAtEnd();
        list.show(1);
    }
}