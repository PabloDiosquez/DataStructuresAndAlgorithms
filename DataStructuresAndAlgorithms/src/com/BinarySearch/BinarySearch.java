package com.BinarySearch;

public class BinarySearch {
    /**
     * Main method to demonstrate the binary search algorithm.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        try {
            // Sorted array for binary search
            int[] numbers = new int[]{2, 5, 10, 15, 23, 34, 65, 78};

            // Target value to search for
            int target = 5;

            // Perform binary search and print the result
            int result = binSearch(numbers, target);

            if (result != -1) {
                System.out.println("Element " + target + " found at index: " + result);
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        } catch (Exception e) {
            // Handle any exceptions thrown during binary search
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Perform binary search on a sorted array.
     *
     * @param sortedArr The sorted array to search.
     * @param target    The value to search for.
     * @return The index of the target value if found; otherwise, -1.
     * @throws Exception If the array is empty.
     */
    static int binSearch(int[] sortedArr, int target) throws Exception {
        // Check if the array is empty
        if (sortedArr.length == 0) {
            throw new Exception("The array is empty.");
        }

        // Initialize start and end indices for binary search
        int start = 0;
        int end = sortedArr.length - 1;

        // Perform binary search
        while (start <= end) {
            int middle = start + (end - start) / 2;

            // Check if the middle element is the target
            if (sortedArr[middle] == target) {
                return middle; // Target found
            } else if (sortedArr[middle] < target) {
                start = middle + 1; // Adjust the search range to the right half
            } else {
                end = middle - 1; // Adjust the search range to the left half
            }
        }
        // Target not found in the array
        return -1;
    }
}
