package com.Sorting.SelectionSort;

import java.util.Arrays;

import java.util.Arrays;

/**
 * The SelectionSort class provides a simple implementation of the selection sort algorithm.
 */
public class SelectionSort {

    /**
     * The main method demonstrates the usage of the selection sort algorithm on an array.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Example array to be sorted
        int[] nums = {12, 4, -21, 0, 7, 8, 91};
        try {
            // Sort the array using selection sort
            selection(nums);
            // Display the sorted array
            System.out.println("Sorted Array: " + Arrays.toString(nums));
        } catch (Exception e) {
            // Handle and display any exceptions that might occur during sorting
            System.out.println(e.getMessage());
        }
    }

    /**
     * Sorts an array using the selection sort algorithm.
     *
     * @param arr The array to be sorted.
     * @throws Exception If the array is empty.
     */
    static void selection(int[] arr) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            // Swap the last element with the maximum element in the unsorted part of the array
            swap(arr, last, getMaxIndex(arr, 0, arr.length - i));
        }
    }

    /**
     * Finds the index of the maximum element in a specified range of the array.
     *
     * @param arr   The array to be searched.
     * @param start The starting index of the range.
     * @param end   The ending index of the range.
     * @return The index of the maximum element in the specified range.
     * @throws Exception If the array is empty.
     */
    private static int getMaxIndex(int[] arr, int start, int end) throws Exception {
        if (arr.length == 0) throw new Exception("The array is empty.");
        int maxIndex = start;
        // Iterate through the specified range to find the maximum element
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr    The array in which elements are to be swapped.
     * @param first  The index of the first element to be swapped.
     * @param second The index of the second element to be swapped.
     */
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
