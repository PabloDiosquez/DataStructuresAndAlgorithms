package com.Recursion;

/**
 * The Palindrome class provides a method to check if a given number is a palindrome.
 * A palindrome is a number that remains the same when its digits are reversed.
 */
public class Palindrome {

    /**
     * The main method demonstrates the usage of the palindrome method.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example: Checking if the number 4324 is a palindrome
        System.out.println(palindrome(4324));
    }

    /**
     * Checks if a given number is a palindrome.
     *
     * @param number The integer to be checked for palindrome.
     * @return True if the number is a palindrome, false otherwise.
     */
    static boolean palindrome(int number) {
        // A number is a palindrome if it is equal to its reverse.
        return number == reverse(number);
    }

    /**
     * Reverses the digits of the given integer.
     *
     * @param number The integer to be reversed.
     * @return The integer with its digits reversed.
     */
    private static int reverse(int number) {
        // Base case: If the number is 0, return 0 (no change).
        if (number == 0) {
            return 0;
        }

        // Calculate the number of digits in the given number.
        int numberOfDigits = (int) Math.log10(number);

        // Extract the last digit of the number.
        int lastDigit = number % 10;

        // Reverse the remaining digits using recursion and concatenate with the last digit.
        return (int) (lastDigit * Math.pow(10, numberOfDigits) + reverse(number / 10));
    }
}
