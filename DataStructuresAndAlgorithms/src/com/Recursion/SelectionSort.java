package com.Recursion;

import java.util.Arrays;

/**
 * This class implements the Selection Sort algorithm for an integer array.
 */
public class SelectionSort {
    /**
     * Main method to demonstrate the usage of the SelectionSort class.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 8, 0};
        selection(arr);
        // selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    /**
     * Sorts an array using the Selection Sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void selection(int[] array) {
        _selection(array, array.length, 0, 0);
    }

    /**
     * Recursively performs the selection sort algorithm.
     *
     * @param arr The array to be sorted.
     * @param r   The remaining number of elements to be sorted.
     * @param c   The current index in the array.
     * @param max The index of the maximum element found so far in the current iteration.
     */
    private static void _selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[max]) {
                _selection(arr, r, c + 1, c);
            } else {
                _selection(arr, r, c + 1, max);
            }
        } else {
            swap(arr, r - 1, max);
            _selection(arr, r - 1, 0, 0);
        }
    }

    /**
     * Sorts an array using the Selection Sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void selectionSort(int[] array) {
        _selection(array, 0);
    }

    /**
     * Recursively performs the selection sort algorithm.
     *
     * @param array The array to be sorted.
     * @param index The current index in the array.
     */
    private static void _selection(int[] array, int index) {
        if (index == array.length - 1) {
            return;
        }

        int minIndex = findMinIndex(array, index);
        swap(array, index, minIndex);
        _selection(array, index + 1);
    }

    /**
     * Finds the index of the minimum element in the array starting from a given index.
     *
     * @param array The array to search for the minimum element.
     * @param index The starting index for the search.
     * @return The index of the minimum element.
     */
    private static int findMinIndex(int[] array, int index) {
        if (index == array.length - 1) {
            return index;
        }

        int minIndex = findMinIndex(array, index + 1);
        if (array[index] < array[minIndex]) {
            return index;
        }
        return minIndex;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param array  The array in which elements are swapped.
     * @param first  The index of the first element to be swapped.
     * @param second The index of the second element to be swapped.
     */
    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
