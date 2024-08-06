package org.example;

/**
 * QuickSort is an implementation of the quicksort algorithm.
 * This implementation is not stable and works in-place.
 */
public class QuickSort {

    /**
     * Sorts the given array using the quicksort algorithm.
     *
     * @param arr  the array to be sorted
     * @param low  the starting index of the portion of the array to be sorted
     * @param high the ending index of the portion of the array to be sorted
     *
     * The time complexity of quicksort is:
     * - Best case: O(n log n)
     * - Average case: O(n log n)
     * - Worst case: O(n^2)
     *
     * where n is the number of elements in the array.
     *
     * The space complexity of this in-place implementation is O(log n) due to the recursive call stack.
     */
    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = arr[middle];

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

        // Recursively sort the two halves
        sort(arr, low, end);
        sort(arr, start, high);
    }

    /**
     * Swaps the elements at the specified positions in the specified array.
     *
     * @param arr   the array in which to swap elements
     * @param first the index of one element to be swapped
     * @param second the index of the other element to be swapped
     */
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
