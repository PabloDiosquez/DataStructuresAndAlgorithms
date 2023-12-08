package com.Queue;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an instance of the Queue
        Queue myQueue = new Queue();

        // Step 2: Enqueue Elements
        try {
            myQueue.enQueue(10);
            myQueue.enQueue(20);
            myQueue.enQueue(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Step 3: Dequeue Elements
        try {
            int removedElement = myQueue.deQueue();
            System.out.println("Dequeued Element: " + removedElement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Step 4: Peek at the Front Element
        int frontElement = myQueue.peek();
        System.out.println("Front Element: " + frontElement);

        // Step 5: Check if the Queue is Not Empty or Not Full
        if (myQueue.isNotEmpty()) {
            System.out.println("The queue is not empty.");
        }

        if (myQueue.isNotFull()) {
            System.out.println("The queue is not full.");
        }


    }
}
