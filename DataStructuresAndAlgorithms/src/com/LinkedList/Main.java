package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList linkedList = new LinkedList();

        try {
            // Insert elements into the linked list
            linkedList.insert(10);
            linkedList.insert(20);
            linkedList.insert(30);

            // Display the initial linked list
            System.out.println("Initial Linked List:");
            linkedList.show();

            // Insert a new element at index 1
            linkedList.insertAt(1, 15);

            // Display the linked list after insertion
            System.out.println("\nLinked List after Insertion at Index 1:");
            linkedList.show();

            // Insert a new element at the beginning
            linkedList.insertAtStart(5);

            // Display the linked list after insertion at the beginning
            System.out.println("\nLinked List after Insertion at the Beginning:");
            linkedList.show();

            // Delete the element at index 2
            int deletedData = linkedList.delete(2);
            System.out.println("\nDeleted Element: " + deletedData);

            // Display the linked list after deletion
            System.out.println("\nLinked List after Deletion at Index 2:");
            linkedList.show();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
