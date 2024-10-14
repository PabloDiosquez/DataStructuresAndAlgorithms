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
        //printTriangle(4);
        fun(4);
    }

    /**
     * Prints a pattern of asterisks based on the given number of lines.
     * The pattern starts with 'n' asterisks in the first line, 'n-1' in the second line,
     * and continues decreasing by one asterisk per line until there is one asterisk in the last line.
     *
     * @param n The number of lines and the maximum number of asterisks in the first line.
     */
    public static void fun(int n) {
        _fun(n, 0);
    }

    /**
     * Recursively prints the pattern of asterisks.
     * This private helper method controls the number of rows and columns
     * while printing the pattern.
     *
     * @param r The current row number (number of asterisks to print in the current line).
     * @param c The current column number (tracks the number of asterisks printed so far on the current line).
     */
    private static void _fun(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            _fun(r, c + 1);
        } else {

            System.out.println();
            _fun(r - 1, 0); // Reset column counter to 0 for the new row
        }
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