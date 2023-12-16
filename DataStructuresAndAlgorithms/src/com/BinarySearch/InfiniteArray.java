package com.BinarySearch;

/**
 * The InfiniteArray class contains a program to find the index of a target element
 * in an array that simulates an infinite sorted array with a specific pattern.
 */
public class InfiniteArray {
    /**
     * The main method initializes an array and a target value, then prints the index
     * of the target element found using the findIndex method.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize the array representing an infinite sorted array
        int[] arr = {1, 2, 3, 4, 6, 8, 12, 14, 15, 16, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58};
        // Define the target element to search for
        int target = 16;

        // Print the index of the target element
        System.out.println(findIndex(arr, target));
    }

    /**
     * The findIndex method searches for the index of the target element in an infinite
     * sorted array with a specific pattern.
     *
     * @param sortedArray The infinite sorted array.
     * @param target      The element to search for in the array.
     * @return The index of the target element, or -1 if not found.
     */
    static int findIndex(int[] sortedArray, int target) {
        // Initialize the start and end indices for the search
        int start = 0;
        int end = 1;

        // Expand the search range exponentially until the target is greater than the value at the end index
        while (target > sortedArray[end]) {
            // Update the new start index and expand the search range
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Use binary search within the identified range
        return binarySearch(sortedArray, target, start, end);
    }

    /**
     * The binarySearch method performs a binary search for the target element
     * within a specified range of the array.
     *
     * @param sortedArray The sorted array to search.
     * @param target      The element to search for in the array.
     * @param start       The starting index of the search range.
     * @param end         The ending index of the search range.
     * @return The index of the target element, or -1 if not found.
     */
    static int binarySearch(int[] sortedArray, int target, int start, int end) {
        // Perform binary search until the start index is less than or equal to the end index
        while (start <= end) {
            // Calculate the middle index
            int middle = start + (end - start) / 2;

            // Check if the middle element is the target
            if (sortedArray[middle] == target) {
                return middle; // Target found, return the index
            } else if (sortedArray[middle] < target) {
                start = middle + 1; // Adjust the search range to the right
            } else {
                end = middle - 1; // Adjust the search range to the left
            }
        }
        return -1; // Target not found
    }
}
