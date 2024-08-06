package org.example;

/**
 * This class provides a static method to perform Selection Sort on an array of integers.
 * Selection Sort is an in-place comparison sorting algorithm with O(n^2) time complexity.
 */
public class SelectionSort {

    /**
     * Sorts the given array using the Selection Sort algorithm.
     * This method sorts the array in ascending order.
     *
     * @param arr the array of integers to be sorted
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    /**
     * Finds the index of the maximum element in the specified range of the array.
     *
     * @param arr the array to search for the maximum element
     * @param start the starting index of the range (inclusive)
     * @param end the ending index of the range (inclusive)
     * @return the index of the maximum element in the specified range
     */
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Swaps the elements at the specified positions in the array.
     *
     * @param arr the array in which the elements will be swapped
     * @param first the index of the first element to be swapped
     * @param second the index of the second element to be swapped
     */
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
