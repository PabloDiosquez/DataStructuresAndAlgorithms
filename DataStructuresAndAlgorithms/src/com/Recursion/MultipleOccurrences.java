package com.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates finding all occurrences of a target value in an array and
 * returning a list of indices where the target value is found.
 */
public class MultipleOccurrences {

    /**
     * The main method to demonstrate finding multiple occurrences of a target value
     * in an array and printing the indices.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 5, 3, 3, 7};
        List<Integer> indices = findAllIndices(arr, 3);

        System.out.println(indices);
    }

    /**
     * Finds all occurrences of the target value in the given array.
     *
     * @param arr    The array to search for occurrences.
     * @param target The target value to find in the array.
     * @return A list of indices where the target value is found in the array.
     */
    static List<Integer> findAllIndices(int[] arr, int target) {
        return _findAllIndices(arr, target, new ArrayList<>(), 0);
    }

    /**
     * Helper method that recursively finds all occurrences of the target value in the array.
     *
     * @param arr     The array to search for occurrences.
     * @param target  The target value to find in the array.
     * @param indices The list of indices where the target value is found.
     * @param index   The current index being checked in the array.
     * @return A list of indices where the target value is found in the array.
     */
    static List<Integer> _findAllIndices(int[] arr, int target, ArrayList<Integer> indices, int index) {
        // Base case: end of the array is reached
        if (index == arr.length) {
            return indices;
        }

        // Check if the current element is equal to the target value
        if (arr[index] == target) {
            indices.add(index);
        }

        // Recursive call to check the rest of the array
        return _findAllIndices(arr, target, indices, index + 1);
    }
}
