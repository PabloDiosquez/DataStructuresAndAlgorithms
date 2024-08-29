package org.example;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseNumber(14566)); // Expected output: 66541
    }

    /**
     * Reverses the digits of the given integer.
     *
     * @param n the integer to reverse
     * @return the integer with digits reversed
     */
    static int reverseNumber(int n) {
        return reverseNumberHelper(n, countDigits(n));
    }

    /**
     * Helper method to reverse digits recursively.
     *
     * @param n the integer to reverse
     * @param digits the number of digits in the integer
     * @return the reversed integer
     */
    private static int reverseNumberHelper(int n, int digits) {
        if (n <= 9) {
            return n;
        }
        int remainder = n % 10;
        return (int) (remainder * Math.pow(10, digits - 1) + reverseNumberHelper(n / 10, digits - 1));
    }

    /**
     * Counts the number of digits in the given integer.
     *
     * @param n the integer whose digits are to be counted
     * @return the number of digits in the integer
     */
    private static int countDigits(int n) {
        if (n <= 9) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }
}
