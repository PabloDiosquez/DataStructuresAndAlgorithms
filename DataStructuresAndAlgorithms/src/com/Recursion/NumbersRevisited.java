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
        print(5);
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
}


