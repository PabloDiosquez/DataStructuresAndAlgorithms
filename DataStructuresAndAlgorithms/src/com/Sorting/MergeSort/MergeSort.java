package com.Sorting.MergeSort;

import java.util.Arrays;

import java.util.Arrays;

/**
 * The MergeSort class implements the merge sort algorithm to sort an array of integers.
 */
public class MergeSort {

    /**
     * The main method demonstrates the usage of the mergeSort function.
     * It initializes an array, performs the merge sort, and prints the sorted array.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Input array to be sorted
        int[] arr = {8, 1, 4, 10, 2, -1};

        // Perform merge sort and print the result
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] sortedArr = mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }

    /**
     * Recursively applies the merge sort algorithm to sort the given array.
     *
     * @param arr The array to be sorted.
     * @return The sorted array.
     */
    static int[] mergeSort(int[] arr) {
        // Base case: if the array has only one element, it is already sorted
        if (arr.length == 1) return arr;

        // Split the array into two halves and recursively merge sort each half
        int middle = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        // Merge the sorted halves
        return merge(left, right);
    }

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param sortedArr1 The first sorted array.
     * @param sortedArr2 The second sorted array.
     * @return The merged and sorted array.
     */
    static int[] merge(int[] sortedArr1, int[] sortedArr2) {
        int[] sorted = new int[sortedArr1.length + sortedArr2.length];

        int i = 0, j = 0, k = 0;
        while (i < sortedArr1.length && j < sortedArr2.length) {
            if (sortedArr1[i] < sortedArr2[j]) {
                sorted[k] = sortedArr1[i];
                i++;
            } else {
                sorted[k] = sortedArr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from both arrays, if any
        while (i < sortedArr1.length) {
            sorted[k] = sortedArr1[i];
            i++;
            k++;
        }

        while (j < sortedArr2.length) {
            sorted[k] = sortedArr2[j];
            j++;
            k++;
        }

        return sorted;
    }
}
