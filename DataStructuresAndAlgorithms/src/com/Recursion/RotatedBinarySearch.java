package com.Recursion;

/**
 * RotatedBinarySearch is a class that provides methods for searching for a target element
 * in a rotated sorted array using a modified binary search algorithm.
 */
public class RotatedBinarySearch {

    /**
     * The main method demonstrates the usage of the search method by searching for
     * the target element in a rotated sorted array and printing the result.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 6));
    }

    /**
     * Searches for the target element in a rotated sorted array using a modified binary search algorithm.
     *
     * @param arr    The rotated sorted array to search.
     * @param target The target element to find in the array.
     * @return The index of the target element if found, or -1 if the element is not present.
     */
    static int search(int[] arr, int target) {
        return _search(arr, target, 0, arr.length - 1);
    }

    /**
     * Helper method that performs the actual binary search in the rotated sorted array.
     *
     * @param arr    The rotated sorted array to search.
     * @param target The target element to find in the array.
     * @param start  The starting index of the current search range.
     * @param end    The ending index of the current search range.
     * @return The index of the target element if found, or -1 if the element is not present.
     */
    private static int _search(int[] arr, int target, int start, int end) {
        // Base case: the search range is empty
        if (start > end) {
            return -1;
        }

        // Calculate the middle index of the current search range
        int middle = start + (end - start) / 2;

        // Check if the middle element is the target
        if (arr[middle] == target) {
            return middle;
        }

        // Determine which half of the array is sorted and continue the search accordingly
        if (arr[start] <= arr[middle]) {
            if (arr[start] <= target && target <= arr[middle]) {
                return _search(arr, target, start, middle - 1);
            }
            return _search(arr, target, middle + 1, end);
        }

        if (arr[middle] <= target && target <= arr[end]) {
            return _search(arr, target, middle + 1, end);
        }

        return _search(arr, target, start, middle - 1);
    }
}