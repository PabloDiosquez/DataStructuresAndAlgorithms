package com.Sorting.CyclicSort;

import java.util.Arrays;

/**
 * The CyclicSort class demonstrates the Cyclic Sort algorithm on an array of integers.
 */
public class CyclicSort {

    /**
     * The main method serves as the entry point of the program.
     * It initializes an array of integers, applies the Cyclic Sort algorithm, and prints the sorted array.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] nums = {3, 1, 5, 2, 4, 6, 8, 10, 9, 7};

        // Apply Cyclic Sort to the array
        cyclic(nums);

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Applies the Cyclic Sort algorithm to sort an array of integers in place.
     * The algorithm iterates through the array, placing each element in its correct position.
     * Time Complexity: O(N), where N is the length of the array.
     *
     * @param arr The array of integers to be sorted.
     */
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            // If the current element is not in its correct position, swap it
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                // Move to the next element
                i++;
            }
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr    The array in which the elements will be swapped.
     * @param first  The index of the first element to be swapped.
     * @param second The index of the second element to be swapped.
     */
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
