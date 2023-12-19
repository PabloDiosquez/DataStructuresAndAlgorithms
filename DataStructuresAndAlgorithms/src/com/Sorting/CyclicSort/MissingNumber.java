package com.Sorting.CyclicSort;

// Given an array 'numbers' containing n distinct numbers in the range [0, n], return
// the only number in the range that is missing from the array.
// Could you implement a solution using only O(1) extra space in memory
// and O(n) runtime complexity?

/**
 * The MissingNumber class finds the missing number in a given range using the Cyclic Sort algorithm.
 */
public class MissingNumber {

    /**
     * The main method serves as the entry point of the program.
     * It initializes an array representing a range of numbers, applies the Cyclic Sort algorithm,
     * and prints the missing number in the range.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize an array representing a range of numbers
        int[] range = {0, 2, 3, 4};

        // Print the missing number in the range
        System.out.println("Missing Number: " + missingNumber(range));
    }

    /**
     * Finds the missing number in a range using the Cyclic Sort algorithm.
     * It first applies the Cyclic Sort to the array and then checks for the first element
     * that does not match its index, returning the missing number.
     *
     * @param numbers The array representing a range of numbers.
     * @return The missing number in the range.
     */
    static int missingNumber(int[] numbers) {
        cyclicSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i) return i;
        }
        return numbers.length;
    }

    /**
     * Applies the Cyclic Sort algorithm to sort an array of numbers in place.
     * The algorithm iterates through the array, placing each element in its correct position.
     *
     * @param numbers The array of numbers to be sorted.
     */
    static void cyclicSort(int[] numbers) {
        int i = 0;
        while (i < numbers.length) {
            int correct = numbers[i];

            // If the current element is not in its correct position, swap it
            if (numbers[i] < numbers.length && numbers[i] != numbers[correct]) {
                swap(numbers, i, correct);
            } else {
                // Move to the next element
                i++;
            }
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr    The array in which the elements will be swapped.
     * @param first  The index of the first element to be swapped.
     * @param second The index of the second element to be swapped.
     */
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
