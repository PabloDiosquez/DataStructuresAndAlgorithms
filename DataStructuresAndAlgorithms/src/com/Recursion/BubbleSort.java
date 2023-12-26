package com.Recursion;

import java.util.Arrays;

/**
 * The BubbleSort class provides methods for sorting an array using the Bubble Sort algorithm.
 */
public class BubbleSort {

    /**
     * The main method demonstrates the usage of the bubbleSort method to sort an array
     * and prints the sorted array.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts an array in ascending order using the Bubble Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    static void bubbleSort(int[] arr) {
        _bubbleSort(arr, arr.length - 1, 0);
    }

    /**
     * Helper method that performs the Bubble Sort algorithm recursively.
     *
     * @param arr The array to be sorted.
     * @param r   The index representing the last unsorted element in the array.
     * @param c   The current index being compared during the sorting process.
     */
    private static void _bubbleSort(int[] arr, int r, int c) {
        // Base case: the entire array is sorted
        if (r == 0) {
            return;
        }

        // Check if the current element is greater than the next element
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // Swap the elements
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            // Recursive call to compare the next pair of elements
            _bubbleSort(arr, r, c + 1);
        }

        // Recursive call to move to the next unsorted element
        _bubbleSort(arr, r - 1, c);
    }
}
