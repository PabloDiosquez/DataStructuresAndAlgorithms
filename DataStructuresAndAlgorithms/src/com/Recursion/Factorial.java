package com.Recursion;

/**
 * The Factorial class provides a simple example of recursive
 * calculation of factorial using a factorial method.
 */
public class Factorial {

    /**
     * The main method is the entry point of the program.
     *
     * @param args The command-line arguments provided to the program.
     */
    public static void main(String[] args) {
        // Example usage of the fact method to calculate and print the factorial of 5
        System.out.println(fact(5));
    }

    /**
     * Recursively calculates the factorial of the given integer.
     *
     * @param n The integer for which to calculate the factorial.
     * @return The factorial of the given integer.
     */
    static int fact(int n) {
        // Base case: if n is 0, the factorial is 1
        if (n == 0) {
            return 1;
        }

        // Recursive call to calculate the factorial of n-1, multiplied by n
        return fact(n - 1) * n;
    }
}
