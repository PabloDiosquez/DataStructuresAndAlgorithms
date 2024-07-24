package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws QueueException {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(12);
        queue.insert(100);
        queue.insert(32);
        queue.insert(76);
        queue.insert(19);

        queue.display();

        queue.remove();
        queue.remove();
        queue.display();
    }
}