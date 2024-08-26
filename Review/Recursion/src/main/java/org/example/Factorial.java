package org.example;

/**
 * A utility class for calculating the factorial of a number using recursion.
 */
public class Factorial {

    /**
     * Calculates the factorial of a given non-negative integer.
     *
     * @param n the non-negative integer to calculate the factorial of
     * @return the factorial of the given integer
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}

