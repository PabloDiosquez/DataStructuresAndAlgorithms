package org.example;

/**
 * A class that provides methods to print a triangle pattern using recursion.
 */
public class Triangle {

    /**
     * Main method to test the triangle pattern printing.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        printTriangle(4);
    }

    /**
     * Recursively prints a triangle pattern of asterisks.
     * For a given integer n, it prints n lines, where the first line
     * has n asterisks, the second line has n-1 asterisks, and so on,
     * until the last line has 1 asterisk.
     *
     * @param n The number of lines and the maximum number of asterisks in the first line.
     */
    public static void printTriangle(int n) {
        if (n == 0) {
            return;
        }

        printChar('*', n);
        System.out.println();

        printTriangle(n - 1);
    }

    /**
     * Recursively prints a given character a specified number of times on the same line.
     *
     * @param c The character to print.
     * @param n The number of times to print the character.
     */
    private static void printChar(char c, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(c);
        printChar(c, n - 1);
    }
}