package com.Recursion;

/**
 * The NumbersRevisited class provides a simple example of recursive
 * printing of numbers using a print method.
 */
public class NumbersRevisited {

    /**
     * The main method is the entry point of the program.
     *
     * @param args The command-line arguments provided to the program.
     */
    public static void main(String[] args) {
        printBoth(5);
    }

    /**
     * Recursively prints the numbers from the given integer down to 1.
     *
     * @param n The integer from which to start printing.
     */
    static void print(int n) {
        // Base case: if n is 0, terminate the recursion
        if (n == 0) {
            return;
        }

        // Print the current value of n
        System.out.println(n);

        // Recursive call to print the next number (n-1)
        print(n - 1);
    }

    /**
     * Recursively prints the numbers from 1 to the given integer.
     * This version of the method prints the numbers before making the recursive call.
     *
     * @param n The integer up to which numbers should be printed.
     */
    static void printRev(int n) {
        // Base case: if n is 0, terminate the recursion
        if (n == 0) {
            return;
        }

        // Recursive call to print the numbers from 1 to n-1
        printRev(n - 1);

        // Print the current value of n
        System.out.println(n);
    }

    /**
     * Recursively prints the numbers from the given integer down to 1
     * and then back up to the original integer.
     *
     * @param n The integer from which to start and end printing.
     */
    static void printBoth(int n) {
        // Base case: if n is 0, terminate the recursion
        if (n == 0) {
            return;
        }

        // Print the current value of n before making the recursive call
        System.out.println(n);

        // Recursive call to print the numbers from 1 to n-1
        printBoth(n - 1);

        // Print the current value of n after the recursive call
        System.out.println(n);
    }
}


