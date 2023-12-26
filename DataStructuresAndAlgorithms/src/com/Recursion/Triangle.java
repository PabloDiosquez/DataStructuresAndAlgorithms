package com.Recursion;

public class Triangle {
    public static void main(String[] args) {
        // Calling the 'fun' method to print a pattern
        fun(4, 0);

        // Uncomment the following lines to print a triangle and its reverse
        // triangle(4);
        // System.out.println();
        // triangleRev(4);
    }

    /**
     * Prints a pattern using recursion.
     *
     * @param row    The number of rows in the pattern.
     * @param column The current column while printing the pattern.
     */
    static void fun(int row, int column) {
        if (row == 0) {
            return;
        }

        if (column < row) {
            System.out.print('*');
            fun(row, column + 1);
        } else {
            System.out.println();
            fun(row - 1, 0);
        }
    }

    /**
     * Prints a triangle pattern using recursion.
     *
     * @param n The number of rows in the triangle.
     */
    static void triangle(int n) {
        if (n == 0) {
            return;
        }

        triangle(n - 1);
        paint('*', n);
        System.out.println();
    }

    /**
     * Prints the reverse of a triangle pattern using recursion.
     *
     * @param n The number of rows in the triangle.
     */
    static void triangleRev(int n) {
        if (n == 0) {
            return;
        }

        paint('*', n);
        System.out.println();
        triangleRev(n - 1);
    }

    /**
     * Paints a character 'n' times.
     *
     * @param c The character to be printed.
     * @param n The number of times the character should be printed.
     */
    static void paint(char c, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(c);
        paint(c, n - 1);
    }
}
