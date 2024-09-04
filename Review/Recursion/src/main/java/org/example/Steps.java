package org.example;

/**
 * The {@code Steps} class provides a method to calculate the number of steps
 * required to reduce an integer to zero.
 * In each step, if the number is even, it is divided by 2;
 * if it is odd, 1 is subtracted from it.
 * The method uses recursion to determine the number of steps needed.
 * Time complexity: O(log n), as each division by 2 reduces the size of the number exponentially.
 */
public class Steps {

    /**
     * The main method serves as the entry point of the program.
     * It tests the {@code numberOfSteps} method with a sample input.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));  // Output: 6
    }

    /**
     * Returns the number of steps required to reduce the given number to zero.
     * In each step:
     * If the number is even, it is divided by 2.
     * If the number is odd, 1 is subtracted from it.
     * This method is recursive and efficiently calculates the result.
     *
     * @param n the integer to reduce to zero
     * @return the number of steps to reduce {@code n} to zero
     * @throws IllegalArgumentException if {@code n} is negative
     */
    static int numberOfSteps(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0) {
            return 0;
        }
        return 1 + (n % 2 == 0 ? numberOfSteps(n / 2) : numberOfSteps(n - 1));
    }
}
