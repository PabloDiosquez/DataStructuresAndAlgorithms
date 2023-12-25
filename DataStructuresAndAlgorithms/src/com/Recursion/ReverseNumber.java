package com.Recursion;

/**
 * The ReverseNumber class provides a method to reverse the digits of an integer.
 */
public class ReverseNumber {

    /**
     * The main method demonstrates the usage of the reverse method.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example: Reversing the digits of the number 2300
        System.out.println(reverseV1(2371));
    }

    /**
     * Reverses the digits of the given integer.
     *
     * @param number The integer to be reversed.
     * @return The integer with its digits reversed.
     */
    static int reverseV1(int number) {
        // Base case: If the number is 0, return 0 (no change).
        if (number == 0) {
            return 0;
        }

        // Extract the last digit of the number.
        int lastDigit = number % 10;
        // Count the number of digits of the number.
        int digits = (int) Math.log10(number);
        // Reverse the remaining digits using recursion and concatenate with the last digit.
        return (int) (lastDigit * Math.pow(10, digits) + reverseV1(number / 10));
    }
}
