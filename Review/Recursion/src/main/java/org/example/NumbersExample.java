package org.example;

/**
 * A class to demonstrate printing numbers from 1 to a specified number.
 */
public class NumbersExample {

    /**
     * Prints numbers from 1 up to the specified number.
     *
     * @param number The number up to which to print. Must be greater than or equal to 1.
     */
    public static void printNumbers(int number) {
        printNumbersFrom(number, 1);
    }

    /**
     * Recursively prints numbers from the start value up to the specified number.
     *
     * @param number The number up to which to print.
     * @param start  The starting number from which to begin printing.
     */
    private static void printNumbersFrom(int number, int start) {
        if (start == number) {
            System.out.print(start);
            return;
        }
        System.out.print(start + " ");
        printNumbersFrom(number, start + 1);
    }
}
