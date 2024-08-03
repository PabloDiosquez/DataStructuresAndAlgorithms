package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Test singly linked list
            testLinkedList();

            // Test custom linked list
            testCustomLinkedList();

            // Test doubly linked list
            testDoublyLinkedList();

            // Test circular linked list
            testCircularLinkedList();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void testLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(21);
        list.insert(133);
        System.out.println("Current LinkedList:");
        list.show();
        System.out.println();
    }

    private static void testCustomLinkedList() throws Exception {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(12);
        list.insertFirst(3);
        list.insertFirst(54);
        list.insertFirst(67);
        list.insertFirst(9);
        list.insertFirst(2);
        list.insertLast(1900);
        list.insert(101, 5);
        System.out.println("CustomLinkedList after insertions:");
        list.display();
        list.deleteLast();
        System.out.println("CustomLinkedList after deleting last element:");
        list.display();
        list.deleteLast();
        System.out.println("CustomLinkedList after another deletion:");
        list.display();
    }

    private static void testDoublyLinkedList() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(12);
        list.insertLast(21);
        list.insertLast(33);
        list.insertLast(45);
        list.insertLast(89);
        System.out.println("DoublyLinkedList after insertions:");
        list.display();
        System.out.println();
        list.insert(2, 100);
        System.out.println("DoublyLinkedList after insertion at index 2:");
        list.display();
    }

    private static void testCircularLinkedList() throws Exception {
        CLL list = new CLL();
        list.insert(32);
        list.insert(12);
        list.insert(65);
        list.insert(23);
        list.insert(3);
        System.out.println("CircularLinkedList after insertions:");
        list.display();
        System.out.println();
        list.delete(65);
        System.out.println("CircularLinkedList after deleting 65:");
        list.display();
    }
}

