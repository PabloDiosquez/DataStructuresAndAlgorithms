package org.example;

/**
 * The {@code CountZeros} class provides methods to count the number of zeros
 * in the decimal representation of an integer.
 */
public class CountZeros {
    /**
     * The main method serves as the entry point of the program.
     * It tests the {@code countZeros_v} method with a sample input.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(countZeros_v(30204));
    }

    /**
     * Counts the number of zeros in the decimal representation of a number
     * using a helper function to accumulate the count.
     *
     * @param n the integer to count zeros in
     * @return the number of zeros in the decimal representation of {@code n}
     */
    static int countZeros_v(int n) {
        return countZerosHelper(n, 0);
    }

    /**
     * A helper method that recursively counts the number of zeros in the
     * decimal representation of a number.
     *
     * @param n the integer to count zeros in
     * @param c the current count of zeros
     * @return the final count of zeros
     */
    private static int countZerosHelper(int n, int c) {
        if (n == 0) {
            return c + 1;
        }
        if (n <= 9) {
            return c;
        }
        int remainder = n % 10;
        if (remainder == 0) {
            return countZerosHelper(n / 10, c + 1);
        }
        return countZerosHelper(n / 10, c);
    }

    /**
     * Counts the number of zeros in the decimal representation of a number.
     *
     * @param n the integer to count zeros in
     * @return the number of zeros in the decimal representation of {@code n}
     */
    static int countZeros(int n) {
        // Handle the special case where the number itself is 0
        if (n == 0) {
            return 1;
        }
        return countZerosHelper(n);
    }

    /**
     * A helper method that recursively counts the number of zeros in the
     * decimal representation of a number.
     *
     * @param n the integer to count zeros in
     * @return the number of zeros in the decimal representation of {@code n}
     */
    private static int countZerosHelper(int n) {
        // Base case: when the number has been fully processed
        if (n == 0) {
            return 0;
        }
        // Check if the last digit is 0 and add 1 if true
        int isZero = (n % 10 == 0) ? 1 : 0;
        // Recursively process the next digit
        return isZero + countZerosHelper(n / 10);
    }
}
