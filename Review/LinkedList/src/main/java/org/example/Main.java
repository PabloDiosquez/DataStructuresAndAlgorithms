package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            /*
            // Create a new linked list
            LinkedList list = new LinkedList();

            // Insert nodes into the linked list
            list.insert(12);
            list.insert(21);
            list.insert(133);

            // Display the linked list
            System.out.println("Current List:");
            list.show();
            System.out.println();

            // Optionally delete nodes and display the list again
            // Uncomment the following lines to test the delete operations

            // list.deleteAt(2); // Deletes the node at index 2
            // list.deleteAtEnd(); // Deletes the last node in the list

            // Display the linked list after deletions
            System.out.println("List after deletions:");
            list.show();

            // Display the node at index 1
            System.out.println();
            System.out.println("Node at index 1:");
            list.show(1);
            */

            CustomLinkedList list = new CustomLinkedList();

            list.insertFirst(12);
            list.insertFirst(3);
            list.insertFirst(54);
            list.insertFirst(67);
            list.insertFirst(9);
            list.insertFirst(2);
            list.insertLast(1900);
            list.insert(101, 5);

            list.display();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
