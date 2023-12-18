package com.Sorting.InsertionSort;

import java.util.Arrays;

/**
 * The InsertionSort class provides a simple implementation of the insertion sort algorithm.
 */
public class InsertionSort {

    /**
     * The main method demonstrates the usage of the insertion sort algorithm on an array.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Example array to be sorted
        int[] nums = {0, -12, 3, 1, -18, 23};

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(nums));

        // Perform insertion sort on the array
        insertion(nums);

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }

    /**
     * Sorts an array using the insertion sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Iterate through the array from the beginning
            // Compare and swap elements to place them in the correct order
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1); // Swap if the current element is smaller than the previous one
                else
                    break; // Break the loop if the elements are in the correct order
            }
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr    The array in which elements are to be swapped.
     * @param first  The index of the first element to be swapped.
     * @param second The index of the second element to be swapped.
     */
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
