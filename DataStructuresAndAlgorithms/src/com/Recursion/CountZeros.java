package com.Recursion;

/**
 * The CountZeros class provides two methods to count the number of zeros in a given integer.
 */
public class CountZeros {

    /**
     * The main method demonstrates the usage of the countZerosV1 and countZerosV2 methods.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example: Counting zeros in the number 30204 using both methods
        System.out.println(countZerosV1(30204));
        System.out.println(countZerosV2(30204));
    }

    // V1

    /**
     * Counts the number of zeros in a given integer using recursion.
     *
     * @param number The integer to be checked for zeros.
     * @return The count of zeros in the number.
     */
    static int countZerosV1(int number) {
        return _countZerosV1(number, 0);
    }

    /**
     * Helper method for countZerosV1 that performs the actual counting using recursion.
     *
     * @param number The integer to be checked for zeros.
     * @param count  The current count of zeros.
     * @return The count of zeros in the number.
     */
    private static int _countZerosV1(int number, int count) {
        // Base case: If the number is 0, return the count.
        if (number == 0) {
            return count;
        }

        // If the last digit is zero, increment the count and continue with the rest of the number.
        if (number % 10 == 0) {
            return _countZerosV1(number / 10, count + 1);
        }

        // If the last digit is not zero, continue with the rest of the number without incrementing the count.
        return _countZerosV1(number / 10, count);
    }

    // V2

    /**
     * Counts the number of zeros in a given integer using recursion.
     *
     * @param number The integer to be checked for zeros.
     * @return The count of zeros in the number.
     */
    static int countZerosV2(int number) {
        // Base case: If the number is 0, return 0 (no zeros).
        if (number == 0) {
            return 0;
        }

        // Count zeros in the last digit and continue with the rest of the number.
        return countZerosV2(number / 10) + zero(number % 10);
    }

    /**
     * Helper method for countZerosV2 that returns 1 if the digit is zero, and 0 otherwise.
     *
     * @param digit The digit to be checked.
     * @return 1 if the digit is zero, 0 otherwise.
     */
    private static int zero(int digit) {
        return (digit == 0) ? 1 : 0;
    }
}
