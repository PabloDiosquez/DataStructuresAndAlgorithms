package org.example;

import java.util.Arrays;

/**
 * Implementation of the Merge Sort algorithm.
 */
public class MergeSort {

    /**
     * Sorts the input array using merge sort and returns a sorted array.
     *
     * @param arr the array to be sorted
     * @return a sorted array
     */
    public static int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = sort(Arrays.copyOfRange(arr, middle, arr.length));
        return merge(left, right);
    }

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param first the first sorted array
     * @param second the second sorted array
     * @return a merged sorted array
     */
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        copy(first, mix, i, k);
        copy(second, mix, j, k);
        return mix;
    }

    /**
     * Sorts the array in place using merge sort.
     *
     * @param arr the array to be sorted
     */
    public static void sorted(int[] arr) {
        if (arr.length > 1) {
            sorted(arr, 0, arr.length);
        }
    }

    /**
     * Recursively sorts the array in place using merge sort.
     *
     * @param arr the array to be sorted
     * @param start the starting index of the array segment to be sorted
     * @param end the ending index of the array segment to be sorted
     */
    private static void sorted(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        int middle = start + (end - start) / 2;
        sorted(arr, start, middle);
        sorted(arr, middle, end);
        merge(arr, start, middle, end);
    }

    /**
     * Merges two sorted subarrays within the original array.
     *
     * @param arr the original array containing the subarrays
     * @param start the starting index of the first subarray
     * @param middle the ending index of the first subarray and starting index of the second subarray
     * @param end the ending index of the second subarray
     */
    private static void merge(int[] arr, int start, int middle, int end) {
        int[] mix = new int[end - start];
        int i = start, j = middle, k = 0;

        while (i < middle && j < end) {
            if (arr[i] <= arr[j]) {
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

    /**
     * Copies the remaining elements from the old array to the new array.
     *
     * @param old the source array
     * @param arr the destination array
     * @param startOld the starting index in the source array
     * @param startNew the starting index in the destination array
     */
    private static void copy(int[] old, int[] arr, int startOld, int startNew) {
        while (startOld < old.length) {
            arr[startNew] = old[startOld];
            startOld++;
            startNew++;
        }
    }
}
