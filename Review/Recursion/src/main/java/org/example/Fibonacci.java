package org.example;

/**
 * The Fibonacci class provides a method to calculate the nth Fibonacci number.
 */
public class Fibonacci {
    /**
     * Computes the nth Fibonacci number using recursion.
     *
     * @param n The position of the Fibonacci number to compute. Must be a non-negative integer.
     * @return The nth Fibonacci number.
     */
    public static int nthFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);
    }
}
