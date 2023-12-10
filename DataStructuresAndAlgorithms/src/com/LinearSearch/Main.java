package com.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {23, 12, 56, 75, 11, 14};
        int targetValue = 101;

        try {
            // Perform linear search and print the result
            int resultIndex = performLinearSearch(numbers, targetValue);
            System.out.printf("Index of %d: %d%n", targetValue, resultIndex);
        } catch (Exception e) {
            // Handle any exceptions that might occur during the search
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method for checking if the array contains the target value
    static boolean containsTarget(int[] array, int target) throws Exception {
        // Check if the array is null, and throw an exception if it is
        if (array == null) {
            throw new Exception("The array is null.");
        }

        // Iterate through the array elements
        for (int number : array) {
            // If the target is found, return true
            if (number == target) {
                return true;
            }
        }

        // If the target is not found, return false
        return false;
    }

    // Method for finding the target value in the array
    static int findTarget(int[] array, int target) throws Exception {
        // Check if the array is null, and throw an exception if it is
        if (array == null) {
            throw new Exception("The array is null.");
        }

        // Iterate through the array elements
        for (int index = 0; index < array.length; index++) {
            // If the target is found, return the index
            if (array[index] == target) {
                return index;
            }
        }

        // If the target is not found, throw an exception
        throw new Exception("The target is not in the array of numbers.");
    }

    // Method for linear search
    static int performLinearSearch(int[] array, int target) throws Exception {
        // Check if the array is null, and throw an exception if it is
        if (array == null) {
            throw new Exception("The array is null.");
        }

        // Iterate through the array elements
        for (int index = 0; index < array.length; index++) {
            // If the target is found, return the index
            if (array[index] == target) {
                return index;
            }
        }

        // If the target is not found, throw an exception
        throw new Exception("The target is not in the array of numbers.");
    }
}
