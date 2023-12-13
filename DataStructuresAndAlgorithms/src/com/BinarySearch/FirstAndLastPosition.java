package com.BinarySearch;

import java.security.spec.ECField;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        // Example usage of the searchRange method

        // Sample sorted array
        int[] sortedArray = {1, 2, 2, 4, 4, 4, 5, 6};

        // Target element to search for
        int targetElement = 4;

        try {
            // Call the searchRange method to find the first and last occurrence indices of the target element
            int[] result = searchRange(sortedArray, targetElement);

            // Display the result
            System.out.println("Target Element: " + targetElement);
            System.out.println("First Occurrence Index: " + result[0]);
            System.out.println("Last Occurrence Index: " + result[1]);

        } catch (Exception e) {
            // Handle the exception if the array is empty
            System.err.println("Exception: " + e.getMessage());
        }
    }

    /**
     * Searches for the first and last occurrence of a target in a sorted array.
     *
     * @param nums   The sorted array of integers.
     * @param target The target integer to search for.
     * @return An array containing the first and last occurrence indices of the target.
     * @throws Exception If the input array is empty.
     * * Complexity: O(log(n))
     */
    static int[] searchRange(int[] nums, int target) throws Exception {
        int[] answer = new int[2];
        // Utilizes the 'index' method to find the first and last occurrence indices.
        answer[0] = index(nums, target, true);
        if(answer[0] != -1){
            answer[1] = index(nums, target, false);
        }
        return answer;
    }

    /**
     * Finds the index of the target in the sorted array using binary search.
     *
     * @param nums            The sorted array of integers.
     * @param target          The target integer to search for.
     * @param findStartIndex  If true, finds the starting index of the target; otherwise, finds the ending index.
     * @return The index of the target in the array, or -1 if not found.
     * @throws Exception If the input array is empty.
     * Complexity: O(log(n))
     */
    static int index(int[] nums, int target, boolean findStartIndex) throws Exception {
        // If the array is empty, throw an exception.
        if (nums.length == 0) throw new Exception("Empty array.");

        int index = -1;  // Initialize the index to -1

        int start = 0;   // Initialize the start index
        int end = nums.length - 1;  // Initialize the end index
        int mid;

        // Binary search loop
        while (start <= end) {
            mid = start + (end - start) / 2;  // Calculate the middle index

            // If the middle element is equal to the target
            if (nums[mid] == target) {
                // Update the index based on whether the starting or ending index is being sought
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                index = mid;  // Update the index to the current middle index
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;  // Return the final index
    }
}
