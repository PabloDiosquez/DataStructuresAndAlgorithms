package com.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) throws Exception {
        // Initialize an array of integers
        int[] numbers = new int[] {12, -11, 56, 75, 81, 101};

        // Call the searchInRange method and print the result to the console
        System.out.println(searchInRange(numbers, 12, 1, 4));
    }

    // Method to search for a target integer in a specified range of an array
    static boolean searchInRange(int[] numbers, int target, int start, int end) throws Exception {
        // Check if the input array is null, and throw an exception if true
        if (numbers == null) throw new Exception("The array is null");

        // Loop through the specified range of the array
        for (int i = start; i <= end; i++) {
            // Check if the current element is equal to the target integer
            if (target == numbers[i])
                // Return true if a match is found
                return true;
        }

        // Return false if no match is found within the specified range
        return false;
    }
}
