package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.enqueue(12);
        s.enqueue(2);
        s.enqueue(100);
        s.enqueue(90);
        System.out.println(s.peek());
        s.dequeue();
        s.dequeue();
        System.out.println(s.peek());
        s.dequeue();
    }
}