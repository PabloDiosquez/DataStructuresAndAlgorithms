package org.example;

/**
 * A utility class that provides methods to compute the sum and product of the digits of an integer.
 */
public class Digits {

    /**
     * The main method to demonstrate the usage of sumOfDigits and prodOfDigits methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342)); // Output: 10
        System.out.println(prodOfDigits(1342)); // Output: 24
    }

    /**
     * Recursively calculates the sum of the digits of a given non-negative integer.
     *
     * @param n the non-negative integer whose digits' sum is to be calculated
     * @return the sum of the digits of the given integer
     */
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        return sumOfDigits(n / 10) + lastDigit;
    }

    /**
     * Recursively calculates the product of the digits of a given non-negative integer.
     *
     * @param n the non-negative integer whose digits' product is to be calculated
     * @return the product of the digits of the given integer
     */
    public static int prodOfDigits(int n) {
        if (n <= 9) {
            return n;
        }
        int lastDigit = n % 10;
        return prodOfDigits(n / 10) * lastDigit;
    }
}
