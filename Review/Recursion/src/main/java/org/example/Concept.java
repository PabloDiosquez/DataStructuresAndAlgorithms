package org.example;

/**
 * The {@code Concept} class demonstrates a simple recursive function.
 * It prints numbers in descending order starting from the given number
 * down to 1 using pre-decrement.
 */
public class Concept {

    /**
     * The entry point of the application.
     *
     * @param args the input arguments (not used in this program)
     */
    public static void main(String[] args) {
        fun(10);
    }

    /**
     * A recursive function that prints numbers in descending order.
     *
     * <p>This method uses pre-decrement to decrease the value of {@code n} before
     * passing it to the next recursive call. If {@code n == 0}, the recursion ends.</p>
     *
     * @param n the starting integer to print and decrement
     */
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // fun(n--)
        // Pre-decrement: decreases n before the next recursive call
        fun(--n);
    }
}
