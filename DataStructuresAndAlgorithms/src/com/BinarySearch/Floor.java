package com.BinarySearch;

public class Floor {
    public static void main(String[] args) {

    }

    // Floor algorithm implementation for a sorted array
    static int floorV2(int[] sortedArr, int target) throws Exception {
        // Check if the array is empty
        if (sortedArr.length == 0) throw new Exception("The array is empty.");

        // Initialize pointers for binary search
        int start = 0;
        int end = sortedArr.length - 1;
        int middle = 0;

        // Binary search loop
        while (start <= end) {
            // Calculate the middle index using integer division
            middle = start + (end - start) / 2;

            // Binary Search Logic:
            if (sortedArr[middle] > target)
                end = middle - 1;  // Move to the left half
            else
                start = middle + 1;  // Move to the right half
        }
        // If the loop ends, middle points to the largest element less than or equal to target
        return sortedArr[middle];
    }
}
