package com.Recursion;

// Given an integer num, return the number of steps to reduce it to zero.
// In one step, if the current number is even, you have to divide it by 2,
// otherwise, you have to subtract 1 from it.


/**
 * The NumberOfSteps class provides a method to calculate the number of steps required
 * to reduce a given integer to zero using a set of rules.
 */
public class NumberOfSteps {

    /**
     * The main method demonstrates the usage of the numberOfSteps method.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example: Calculating the number of steps for the number 123
        System.out.println(numberOfSteps(123));
    }

    /**
     * Calculates the number of steps required to reduce a given integer to zero.
     * @param number The integer to be reduced.
     * @return The number of steps required to reduce the integer to zero.
     */
    static int numberOfSteps(int number) {
        return _numberOfSteps(number, 0);
    }

    /**
     * Helper method for numberOfSteps that performs the actual calculation using recursion.
     *
     * @param number The integer to be reduced.
     * @param steps  The current number of steps.
     * @return The number of steps required to reduce the integer to zero.
     */
    private static int _numberOfSteps(int number, int steps) {
        // Base case: If the number is already zero, return the current number of steps.
        if (number == 0) {
            return steps;
        }

        // If the number is even, divide it by 2 and continue with the reduced number.
        if (number % 2 == 0) {
            return _numberOfSteps(number / 2, steps + 1);
        }

        // If the number is odd, subtract 1 and continue with the reduced number.
        return _numberOfSteps(number - 1, steps + 1);
    }
}
