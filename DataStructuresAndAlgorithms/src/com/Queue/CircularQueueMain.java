package com.Queue;

/**
 * A simple demonstration of the CircularQueue class.
 */
public class CircularQueueMain {

    public static void main(String[] args) {
        // Create a CircularQueue with a specified size.
        CircularQueue circularQueue = new CircularQueue(5);

        // Insert elements into the circular queue.
        System.out.println("Inserting elements into the circular queue:");
        for (int i = 1; i <= 7; i++) {
            boolean inserted = circularQueue.insert(i * 5);
            if (inserted) {
                System.out.println("Inserted: " + (i * 5));
            } else {
                System.out.println("Queue is full. Unable to insert: " + (i * 5));
            }
        }
        System.out.println("Queue after insertion:");
        circularQueue.display();
        System.out.println();

        // Remove and display elements from the circular queue.
        try {
            System.out.println("Removing elements from the circular queue:");
            for (int i = 1; i <= 3; i++) {
                int removedElement = circularQueue.remove();
                System.out.println("Removed element: " + removedElement);
            }
            System.out.println("Queue after removal:");
            circularQueue.display();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Display the front element without removal.
        try {
            int frontElement = circularQueue.front();
            System.out.println("Front element without removal: " + frontElement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Check if the circular queue is empty.
        System.out.println("Is the circular queue empty? " + circularQueue.isEmpty());

        // Check if the circular queue is full.
        System.out.println("Is the circular queue full? " + circularQueue.isFull());
    }
}
