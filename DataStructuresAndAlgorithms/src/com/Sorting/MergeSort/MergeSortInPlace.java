package com.Sorting.MergeSort;

import java.util.Arrays;

/**
 * This class implements the in-place merge sort algorithm.
 */
public class MergeSortInPlace {

    /**
     * The entry point of the program. It initializes an array, sorts it using
     * in-place merge sort, and prints the sorted array.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 6, 0, 2};
        mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    /**
     * Initiates the in-place merge sort by calling the helper method.
     *
     * @param arr The array to be sorted.
     */
    static void mergeSort(int[] arr) {
        _mergeSort(arr, 0, arr.length);
    }

    /**
     * Recursively performs in-place merge sort on a segment of the array.
     *
     * @param arr   The array to be sorted.
     * @param start The starting index of the segment.
     * @param end   The ending index (exclusive) of the segment.
     */
    static void _mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) return;

        int middle = (start + end) / 2;
        _mergeSort(arr, start, middle);
        _mergeSort(arr, middle, end);
        merge(arr, start, middle, end);
    }

    /**
     * Merges two sorted segments of the array in-place.
     *
     * @param arr    The array containing the segments to be merged.
     * @param start  The starting index of the first segment.
     * @param middle The ending index (exclusive) of the first segment and
     *               the starting index of the second segment.
     * @param end    The ending index (exclusive) of the second segment.
     */
    static void merge(int[] arr, int start, int middle, int end) {
        int[] mix = new int[end - start];
        int i = start, j = middle, k = 0;
        while (i < middle && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < middle) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
