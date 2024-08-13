package org.example;

/**
 * Main class to demonstrate printing a message multiple times.
 */
public class Main {

    /**
     * Entry point of the program. Calls the method to print a message a specified number of times.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        printMessage(5);
    }

    /**
     * Prints "Hello World!" once.
     */
    static void printMessage() {
        System.out.println("Hello World!");
    }

    /**
     * Prints "Hello World!" a specified number of times.
     *
     * @param times The number of times to print the message. If 0, no message is printed.
     */
    static void printMessage(int times) {
        if (times == 0) {
            return;
        }
        System.out.println("Hello World!");
        printMessage(times - 1);
    }
}
