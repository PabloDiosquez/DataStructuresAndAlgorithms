package com.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * The main method initializes an array, sorts it using the bubble sort algorithm,
     * and then prints the sorted array.
     */
    public static void main(String[] args) {
        // Initialize an array with integer values
        int[] arr = {4, 12, -12, 4, 7};

        // Sort the array using the bubble sort algorithm
        bubble(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * The bubble method performs the bubble sort algorithm on an array of integers.
     *
     * @param arr The array to be sorted.
     */
    static void bubble(int[] arr) {
        boolean swapped; // Flag to track whether any elements were swapped in a pass

        // Iterate through the array using two nested loops for bubble sort
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (arr[j] < arr[j - 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

            // If no elements were swapped in a pass, the array is already sorted, and the algorithm can exit
            if (!swapped) {
                break;
            }
        }
    }
}
