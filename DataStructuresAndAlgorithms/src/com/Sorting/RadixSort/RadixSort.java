package com.Sorting.RadixSort;

import java.util.Arrays;

/**
 * The RadixSort class provides a static method for performing radix sort on an array of integers.
 */
public class RadixSort {

    /**
     * Sorts the given array using the Radix Sort algorithm.
     *
     * @param arr The array of integers to be sorted.
     */
    public static void radixSort(int[] arr) {
        // Find the maximum number to determine the number of digits
        int max = Arrays.stream(arr).max().orElse(0);

        // Perform counting sort for each digit place
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    /**
     * Performs counting sort on the given array based on the specified digit place.
     *
     * @param arr The array of integers to be sorted.
     * @param exp The digit place (1, 10, 100, ...) to consider during counting sort.
     */
    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // 10 digits: 0 -- 9
        int[] sums = new int[10];

        // Count the occurrences of each digit at the specified place
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        // Calculate cumulative sums to determine the positions in the output array
        for (int i = 1; i <= 9; i++) {
            sums[i] = sums[i - 1] + count[i - 1];
        }

        // Build the output array using the calculated positions
        for (int num : arr) {
            output[sums[(num / exp) % 10]] = num;
            sums[(num / exp) % 10]++;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    /**
     * The main method demonstrating the usage of RadixSort.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Example usage
        int[] arr = new int[]{291, 832, 47, 16, 11, 84};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array using Radix Sort
        radixSort(arr);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
