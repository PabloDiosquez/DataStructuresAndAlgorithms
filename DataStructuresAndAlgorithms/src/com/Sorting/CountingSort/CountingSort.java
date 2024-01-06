package com.Sorting.CountingSort;

import java.util.Arrays;

/**
 * This class implements the Counting Sort algorithm for integer arrays.
 */
public class CountingSort {

    /**
     * The main method demonstrates the usage of the Counting Sort algorithm.
     * It initializes an array, sorts it using the countSort method, and prints the result.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 1, 3, 2, 5, 2, 3};

        // Using the countSort method to sort the array
        countSort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    /**
     * Sorts an integer array using the Counting Sort algorithm.
     * Modifies the input array in-place.
     *
     * @param arr The integer array to be sorted.
     */
    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int[] countArr = new int[max + 1];

        // Frequency array
        for (int num : arr) {
            countArr[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArr[i] > 0) {
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }

    /**
     * Sorts an integer array using the Counting Sort algorithm.
     * Returns a new sorted array without modifying the input array.
     *
     * @param arr The integer array to be sorted.
     * @return A new array containing the sorted elements.
     */
    public static int[] countingSort(int[] arr) {
        int max_value = findMax(arr);
        int[] count = new int[max_value + 1];
        int[] sums = new int[max_value + 1];
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max_value; i++) {
            sums[i] = sums[i - 1] + count[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            ans[sums[arr[i]]] = arr[i];
            sums[arr[i]]++;
        }
        return ans;
    }

    /**
     * Finds the maximum value in an integer array.
     *
     * @param arr The integer array.
     * @return The maximum value in the array.
     */
    private static int findMax(int[] arr) {
        int max_value = arr[0];
        for (int num : arr) {
            if (num > max_value) {
                max_value = num;
            }
        }
        return max_value;
    }
}
