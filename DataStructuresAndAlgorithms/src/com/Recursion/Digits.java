package com.Recursion;

/**
 * The Digits class provides examples of recursive methods to calculate
 * the sum and product of the digits of an integer.
 */
public class Digits {

    /**
     * The main method is the entry point of the program.
     *
     * @param args The command-line arguments provided to the program.
     */
    public static void main(String[] args) {
        // Example usage of the sumOfDigits and productOfDigits methods
        System.out.println(sumOfDigits(1234));
        System.out.println(productOfDigits(1234));
    }

    /**
     * Recursively calculates the sum of the digits of the given integer.
     *
     * @param n The integer for which to calculate the sum of digits.
     * @return The sum of the digits of the given integer.
     */
    static int sumOfDigits(int n) {
        // Base case: if n is 0, the sum is 0
        if (n == 0) {
            return n;
        }

        // Extract the last digit of n
        int lastDigit = n % 10;

        // Recursive call to calculate the sum of digits for the remaining part of n
        return lastDigit + sumOfDigits(n / 10);
    }

    /**
     * Recursively calculates the product of the digits of the given integer.
     *
     * @param n The integer for which to calculate the product of digits.
     * @return The product of the digits of the given integer.
     */
    static int productOfDigits(int n) {
        // Base case: if n is 0, the product is 1
        if (n == 0) {
            return 1;
        }

        // Extract the last digit of n
        int lastDigit = n % 10;

        // Recursive call to calculate the product of digits for the remaining part of n
        return productOfDigits(n / 10) * lastDigit;
    }
}
