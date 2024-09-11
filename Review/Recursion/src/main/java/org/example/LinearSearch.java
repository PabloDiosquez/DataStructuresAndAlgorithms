package org.example;

import java.util.ArrayList;

/**
 * This class provides methods to perform linear search on an array and return
 * the positions of a specified element.
 */
public class LinearSearch {

    /**
     * The main method to demonstrate the usage of search and getElementPositions methods.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 12, 4, 7, 0, 4};
        // System.out.println(search(arr, 4));
        System.out.println(getElementPositions(arr, 4));
    }

    /**
     * Checks if a given key is present in the array.
     *
     * @param arr the array of integers to search in
     * @param key the integer to find in the array
     * @return true if the key is found in the array, false otherwise
     */
    static boolean elementInArr(int[] arr, int key) {
        return elementInArrSince(arr, key, 0);
    }

    /**
     * Recursively checks if a given key is present in the array starting from a specific index.
     *
     * @param arr the array of integers to search in
     * @param key the integer to find in the array
     * @param s the starting index from which to search the array
     * @return true if the key is found from the start index onward, false otherwise
     */
    private static boolean elementInArrSince(int[] arr, int key, int s) {
        if(s == arr.length) {
            return false;
        }
        return arr[s] == key || elementInArrSince(arr, key, s+1);
    }


    /**
     * Returns the positions of all occurrences of a specified element in the array.
     *
     * @param arr the array to search in.
     * @param key the element to find the positions of.
     * @return an {@code ArrayList} containing the positions of the element in the array.
     */
    static ArrayList<Integer> getElementPositions(int[] arr, int key) {
        ArrayList<Integer> positions = new ArrayList<>();
        return helperGetElementPositions(arr, key, positions, 0);
    }

    /**
     * Helper method that recursively searches the array for the key and adds its positions to the list.
     *
     * @param arr the array to search in.
     * @param key the element to find the positions of.
     * @param positions the list to store positions where the element is found.
     * @param s the starting index for the search.
     * @return an {@code ArrayList} containing the positions of the element in the array.
     */
    private static ArrayList<Integer> helperGetElementPositions(int[] arr, int key, ArrayList<Integer> positions, int s) {
        if (s == arr.length) {
            return positions;
        }
        if (arr[s] == key) {
            positions.add(s);
        }
        return helperGetElementPositions(arr, key, positions, s + 1);
    }

    /**
     * Performs a linear search to find the first occurrence of a specified element in the array.
     *
     * @param arr the array to search in.
     * @param key the element to find.
     * @return the index of the first occurrence of the element, or -1 if not found.
     */
    static int search(int[] arr, int key) {
        return helper(arr, key, 0);
    }

    /**
     * Helper method that recursively searches for the first occurrence of the key in the array.
     *
     * @param arr the array to search in.
     * @param key the element to find.
     * @param s the starting index for the search.
     * @return the index of the first occurrence of the element, or -1 if not found.
     */
    private static int helper(int[] arr, int key, int s) {
        if (s == arr.length) {
            return -1;
        }
        return (arr[s] == key) ? s : helper(arr, key, s + 1);
    }
}
