package com.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        // Example usage of the min method
        int[] array = {5, 3, 8, 2, 7};
        try {
            int minimumValue = min(array);
            System.out.println("The minimum value in the array is: " + minimumValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to find the minimum value in an array of integers
    public static int min(int[] numbers) throws Exception {
        // Check if the input array is empty, and throw an exception if true
        if (numbers.length == 0) throw new Exception("The array is empty.");

        // Initialize the minimum value with the first element of the array
        int min = numbers[0];

        // Iterate through the array to find the minimum value
        for (int number : numbers) {
            // If the current number is smaller than the current minimum, update the minimum
            if (number < min) {
                min = number;
            }
        }

        // Return the minimum value found in the array
        return min;
    }
}
