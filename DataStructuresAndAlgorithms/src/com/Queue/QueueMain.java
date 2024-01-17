package com.Queue;

/**
 * A simple demonstration of the CustomQueue class.
 */
public class QueueMain {

    public static void main(String[] args) {
        // Create a CustomQueue with a specified size.
        CustomQueue queue = new CustomQueue(5);

        // Insert elements into the queue.
        System.out.println("Inserting elements into the queue:");
        for (int i = 1; i <= 5; i++) {
            queue.insert(i * 10);
        }
        queue.display();
        System.out.println();

        // Remove and display the front element from the queue.
        try {
            int removedElement = queue.remove();
            System.out.println("Removed element: " + removedElement);
            System.out.println("Queue after removal:");
            queue.display();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Display the front element without removal.
        try {
            int frontElement = queue.front();
            System.out.println("Front element without removal: " + frontElement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Check if the queue is empty.
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Check if the queue is full.
        System.out.println("Is the queue full? " + queue.isFull());
    }
}
