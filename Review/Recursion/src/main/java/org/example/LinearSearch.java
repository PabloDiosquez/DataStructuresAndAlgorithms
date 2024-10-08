package org.example;

import java.util.ArrayList;
import java.util.List;

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
        int[] arr = new int[] {3, 5, 12, 4, 4, 0, 4};
        System.out.println(findAllIndex(arr, 4));
        System.out.println(findAllIndexV(arr, 4));
    }

    /**
     * Finds all occurrences of a target value in an array and returns their indices.
     *
     * This method searches through the `arr` array for all positions where the `target` value appears
     * and returns a list of integers containing the indices of those occurrences.
     *
     * @param arr    The array of integers to search for the target value.
     * @param target The target value to find within the array.
     * @return A list of integers containing the indices where the `target` value appears in the array.
     */
    static List<Integer> findAllIndexV(int[] arr, int target) {
        return helperFindAllIndexV(arr, target, 0);
    }

    /**
     * Recursive helper method that performs the search for the target value in the array.
     *
     * This method traverses the array starting at the position indicated by `s`, comparing each element
     * with the target value. If the target is found, its index is added to the result list.
     *
     * @param arr    The array of integers to search through.
     * @param target The target value to find.
     * @param s      The starting index for the search in the array.
     * @return A list of integers containing the indices of the target value found in the array.
     */
    static List<Integer> helperFindAllIndexV(int[] arr, int target, int s) {
        List<Integer> indexes = new ArrayList<>();
        if (s == arr.length) {
            return indexes;
        }
        if (arr[s] == target) {
            indexes.add(s);
        }
        indexes.addAll(helperFindAllIndexV(arr, target, s + 1));
        return indexes;
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
    static ArrayList<Integer> findAllIndex(int[] arr, int key) {
        return helperFindAllIndex(arr, key, new ArrayList<>(), 0);
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
    private static ArrayList<Integer> helperFindAllIndex(int[] arr, int key, ArrayList<Integer> positions, int s) {
        if (s == arr.length) {
            return positions;
        }
        if (arr[s] == key) {
            positions.add(s);
        }
        return helperFindAllIndex(arr, key, positions, s + 1);
    }

    /**
     * Performs a linear search to find the first occurrence of a specified element in the array.
     *
     * @param arr the array to search in.
     * @param key the element to find.
     * @return the index of the first occurrence of the element, or -1 if not found.
     */
    static int find(int[] arr, int key) {
        return helperFind(arr, key, 0);
    }

    /**
     * Helper method that recursively searches for the first occurrence of the key in the array.
     *
     * @param arr the array to search in.
     * @param key the element to find.
     * @param s the starting index for the search.
     * @return the index of the first occurrence of the element, or -1 if not found.
     */
    private static int helperFind(int[] arr, int key, int s) {
        if (s == arr.length) {
            return -1;
        }
        return (arr[s] == key) ? s : helperFind(arr, key, s + 1);
    }
}
