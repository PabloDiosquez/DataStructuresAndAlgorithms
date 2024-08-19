package org.example;

/**
 * The {@code BinSearch} class provides a method to perform a binary search
 * on a sorted array of integers. The class includes both a public method
 * for searching, and a private helper method that performs the recursive search.
 */
public class BinSearch {

    /**
     * Searches for a specified item in a sorted array using binary search.
     *
     * @param arr  The sorted array of integers in which to search.
     * @param item The item to search for in the array.
     * @return The index of the item if found; otherwise, -1.
     * @throws IllegalArgumentException if the input array is null.
     *
     * This method is the entry point for the binary search. It initializes the
     * search boundaries and calls the private recursive method to perform the search.
     */
    public static int search(int[] arr, int item) {
        if (arr == null) {
            throw new IllegalArgumentException("The input array must not be null");
        }
        return search(arr, item, 0, arr.length - 1);
    }

    /**
     * A private helper method that performs the recursive binary search.
     *
     * @param arr   The sorted array of integers in which to search.
     * @param item  The item to search for in the array.
     * @param start The starting index of the subarray to search.
     * @param end   The ending index of the subarray to search.
     * @return The index of the item if found; otherwise, -1.
     *
     * This method is called recursively, adjusting the search boundaries
     * based on the comparison between the middle element of the current subarray
     * and the target item.
     */
    private static int search(int[] arr, int item, int start, int end) {
        // Base case: item not found
        if (start > end) {
            return -1;
        }

        // Calculate the midpoint to avoid overflow
        int mid = start + (end - start) / 2;

        // Check if the middle element is the item
        if (arr[mid] == item) {
            return mid;
        }

        // If the item is greater, search the right half
        else if (arr[mid] < item) {
            return search(arr, item, mid + 1, end);
        }

        // Otherwise, search the left half
        return search(arr, item, start, mid - 1);
    }

}
