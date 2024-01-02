package com.Recursion;

import java.util.Arrays;
import java.util.Random;

/**
 * This class implements the merge sort algorithm to sort an array of integers.
 */
public class MergeSort {

    /**
     * The main method initializes an array with random integers, prints the unsorted array,
     * performs merge sort, and prints the sorted array.
     *
     * @param args Command-line arguments (unused).
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[20];

        // Fill the array with random integers.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Unsorted:");
        System.out.println(Arrays.toString(numbers));

        // Perform merge sort.
        mergeSort(numbers);

        System.out.println("\nSorted:");
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * Sorts an array using the merge sort algorithm.
     *
     * @param inputArr The array to be sorted.
     */
    static void mergeSort(int[] inputArr) {
        int inputLength = inputArr.length;

        // Base case: If the array has 1 or fewer elements, it is already sorted.
        if (inputLength <= 1) {
            return;
        }

        // Divide the array into two halves.
        int half = inputLength / 2;
        int[] left = new int[half];
        int[] right = new int[inputLength - half];

        // Populate the left and right arrays.
        for (int i = 0; i < half; i++) {
            left[i] = inputArr[i];
        }

        for (int i = half; i < inputLength; i++) {
            right[i - half] = inputArr[i];
        }

        // Recursively sort the left and right halves.
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves.
        merge(inputArr, left, right);
    }

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param inputArr The array to store the merged result.
     * @param left     The left sorted array.
     * @param right    The right sorted array.
     */
    private static void merge(int[] inputArr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right arrays into the inputArr.
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                inputArr[k] = left[i];
                i++;
            } else {
                inputArr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array.
        while (i < left.length) {
            inputArr[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array.
        while (j < right.length) {
            inputArr[k] = right[j];
            j++;
            k++;
        }
    }

    /**
     * Sorts an array using an alternative version of the merge sort algorithm.
     *
     * @param arr The array to be sorted.
     * @return The sorted array.
     */
    static int[] mergeSortV1(int[] arr) {
        return _mergeSortV1(arr, 0, arr.length - 1);
    }

    /**
     * Recursive helper method for the alternative version of the merge sort algorithm.
     *
     * @param arr   The array to be sorted.
     * @param start The starting index of the range to be sorted.
     * @param end   The ending index of the range to be sorted.
     * @return The sorted array within the specified range.
     */
    private static int[] _mergeSortV1(int[] arr, int start, int end) {
        // Base case: If the range has 1 or fewer elements, it is already sorted.
        if (start >= end) {
            return new int[]{arr[start]};
        }

        // Divide the range into two halves.
        int middle = start + (end - start) / 2;
        int[] left = _mergeSortV1(arr, start, middle);
        int[] right = _mergeSortV1(arr, middle + 1, end);

        // Merge the sorted halves.
        return mergeV1(left, right);
    }

    /**
     * Merges two sorted arrays into a single sorted array for the alternative version.
     *
     * @param left  The left sorted array.
     * @param right The right sorted array.
     * @return The merged and sorted array.
     */
    private static int[] mergeV1(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right arrays into the merge array.
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merge[k] = left[i];
                i++;
            } else {
                merge[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array.
        while (i < left.length) {
            merge[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array.
        while (j < right.length) {
            merge[k] = right[j];
            j++;
            k++;
        }

        return merge;
    }
}
