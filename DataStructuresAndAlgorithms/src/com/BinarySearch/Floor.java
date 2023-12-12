package com.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        try {
            // Example 1:
            int[] arr1 = {1, 4, 6, 8, 12, 15};
            int target1 = -12;

            int result1 = floor(arr1, target1);
            System.out.println("Index value for target1: " + result1);

            // Example 2:
            int[] arr2 = {2, 4, 7, 10, 14, 18};
            int target2 = 4;

            int result2 = floorV2(arr2, target2);
            System.out.println("Index value (V2) for target2: " + result2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Floor algorithm implementation for a sorted array
    static int floor(int[] sortedArr, int target) throws Exception {
        // Check if the array is empty
        if (sortedArr.length == 0) throw new Exception("The array is empty.");

        if(target < sortedArr[0]) return -1;

        // Initialize pointers for binary search
        int start = 0;
        int end = sortedArr.length - 1;
        int middle = 0;

        // Binary search loop
        while (start <= end) {
            // Calculate the middle index using integer division
            middle = start + (end - start) / 2;

            // Binary Search Logic:
            if (sortedArr[middle] == target)
                return middle;  // Found an exact match, return the target

            else if (sortedArr[middle] > target)
                end = middle - 1;  // Move to the left half

            else
                start = middle + 1;  // Move to the right half
        }

        // If the loop ends, middle points to the largest element less than the target
        // The value at start represents the floor value
        return end;
    }

    // Floor algorithm implementation for a sorted array
    static int floorV2(int[] sortedArr, int target) throws Exception {
        // Check if the array is empty
        if (sortedArr.length == 0) throw new Exception("The array is empty.");

        if(target < sortedArr[0]) return -1;

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
        return middle;
    }
}
