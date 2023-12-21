package com.Sorting.QuickSort;

import java.util.Arrays;

/**
 * This class implements the QuickSort algorithm to sort an array of integers.
 */
public class QuickSort {

    /**
     * The main method demonstrates the usage of the QuickSort algorithm on an array.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts the given array using the QuickSort algorithm.
     *
     * @param arr  The array to be sorted.
     * @param low  The starting index of the array or subarray.
     * @param high The ending index of the array or subarray.
     */
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    /**
     * Partitions the array and returns the index of the pivot element.
     *
     * @param arr  The array to be partitioned.
     * @param low  The starting index of the array or subarray.
     * @param high The ending index of the array or subarray.
     * @return The index of the pivot element after partitioning.
     */
    static int partition(int[] arr, int low, int high) {
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int start = low;
        int end = high;

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param arr The array containing the elements to be swapped.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
