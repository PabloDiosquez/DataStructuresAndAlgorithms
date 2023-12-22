package com.Recursion;

/**
 * The BinarySearch class provides methods for performing binary search on a sorted array.
 */
public class BinarySearch {

    /**
     * The main method demonstrates the usage of the binarySearch method.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] sortedArr = {3, 5, 7, 11, 14, 20};
        System.out.println(binarySearch(sortedArr, 2));
    }

    /**
     * Performs binary search on a sorted array to find the target element.
     * @param sortedArr The sorted array in which to perform the search.
     * @param target The element to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    static int binarySearch(int[] sortedArr, int target) {
        return _binarySearch(sortedArr, target, 0, sortedArr.length - 1);
    }

    /**
     * Recursive helper method for binary search.
     * @param sortedArr The sorted array in which to perform the search.
     * @param target The element to search for.
     * @param start The starting index of the search range.
     * @param end The ending index of the search range.
     * @return The index of the target element if found, otherwise -1.
     */
    static int _binarySearch(int[] sortedArr, int target, int start, int end) {
        if (end < start) {
            // Base case: target not found in the current range
            return -1;
        }

        int middle = start + (end - start) / 2;

        if (sortedArr[middle] == target) {
            // Base case: target found at the middle index
            return middle;
        } else if (sortedArr[middle] < target) {
            // Recursive case: search the right half of the array
            return _binarySearch(sortedArr, target, middle + 1, end);
        } else {
            // Recursive case: search the left half of the array
            return _binarySearch(sortedArr, target, start, middle - 1);
        }
    }
}
