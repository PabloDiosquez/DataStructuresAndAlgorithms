package com.Recursion;

/**
 * This class demonstrates recursion by printing numbers up to a specified limit.
 */
public class NumbersRecursion {

    /**
     * The main method initializes the recursion by calling the printNumber method with the starting value.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        printNumber(1);
    }

    /**
     * Recursively prints numbers starting from the given value up to a specified limit (5 in this example).
     *
     * @param n The current number to be printed.
     */
    static void printNumber(int n) {
        System.out.println(n);

        // Base case: If the current number reaches the limit (5), stop recursion.
        if (n == 5) {
            return;
        }

        // Recursive call to print the next number.
        printNumber(n + 1);
    }
}
