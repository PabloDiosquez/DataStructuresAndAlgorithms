package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Palindrome} class provides methods to determine if a given integer is a palindrome.
 * A palindrome is a number that reads the same backward as forward.
 */
public class Palindrome {

    /**
     * The main method serves as the entry point for the program.
     * It tests the palindrome method with different integers.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(palindrome(121));  // should return true
        System.out.println(palindrome(124));  // should return false
    }

    /**
     * Determines if the given integer is a palindrome.
     *
     * @param n The integer to be checked.
     * @return {@code true} if the integer is a palindrome; {@code false} otherwise.
     */
    static boolean palindrome(int n) {
        return n == reverse(n);
    }

    /**
     * Reverses the digits of the given integer.
     *
     * @param n The integer whose digits are to be reversed.
     * @return The integer formed by reversing the digits of the given integer.
     */
    private static int reverse(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helperRev(n, digits);
    }

    /**
     * Recursively constructs the reverse of the given integer.
     *
     * @param n The integer to be reversed.
     * @param digits The number of digits in the integer.
     * @return The reverse of the given integer.
     */
    private static int helperRev(int n, int digits) {
        int remainder = n % 10;
        if (n == remainder) {
            return n;
        }
        return remainder * (int) (Math.pow(10, digits - 1)) + helperRev(n / 10, digits - 1);
    }
}
