package com.Recursion;

/**
 * This class calculates Fibonacci numbers using recursion.
 */
public class Fibonacci {

    /**
     * The main method demonstrates the calculation of a Fibonacci number and prints the result.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param n The position of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    static int fibo(int n) {
        // Base cases: 0 and 1 are the first two Fibonacci numbers.
        if (n <= 1) {
            return n;
        }

        // Recursive call to calculate the nth Fibonacci number.
        return fibo(n - 1) + fibo(n - 2);
    }
}
