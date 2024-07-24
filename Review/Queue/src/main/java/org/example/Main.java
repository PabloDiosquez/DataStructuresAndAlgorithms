package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws QueueException {
        //CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);

        queue.insert(12);
        queue.insert(100);
        queue.insert(32);
        queue.insert(76);
        queue.insert(19);
        queue.insert(19);
        queue.insert(19);
        queue.insert(19);
        queue.insert(19);

        queue.display();

        System.out.println("\n" + queue.remove());
        queue.remove();
        queue.remove();
        queue.insert(99);
        System.out.println();
        queue.display();

    }
}