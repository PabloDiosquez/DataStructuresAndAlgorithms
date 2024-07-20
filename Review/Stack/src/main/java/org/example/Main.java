package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(12);
        s.push(2);
        s.push(100);
        s.push(90);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.peek());
        s.pop();
    }
}