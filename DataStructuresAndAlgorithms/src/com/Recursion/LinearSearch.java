package com.Recursion;

/**
 * The LinearSearch class provides methods for performing linear search on an array.
 */
public class LinearSearch {

    /**
     * The main method to demonstrate the usage of the search and searchIndex methods.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 8, 4, 9};
        System.out.println(search(arr, 4));
        System.out.println(searchIndex(arr, 4));
    }

    /**
     * Performs linear search to determine if a target element exists in the array.
     *
     * @param arr The input array to be searched.
     * @param target The target element to search for.
     * @return true if the target element is found, false otherwise.
     */
    static boolean search(int[] arr, int target){
        return _search(arr, target, 0);
    }

    /**
     * Recursive helper method for linear search.
     *
     * @param arr The input array to be searched.
     * @param target The target element to search for.
     * @param index The current index being checked.
     * @return true if the target element is found, false otherwise.
     */
    private static boolean _search(int[] arr, int target, int index){
        // Base case: If the index reaches the end of the array, the element is not found.
        if(index == arr.length){
            return false;
        }
        // Recursive case: Check if the current element is equal to the target,
        // or recursively search the rest of the array.
        return arr[index] == target || _search(arr, target, index+1);
    }

    /**
     * Finds the index of the target element in the array using linear search.
     *
     * @param arr The input array to be searched.
     * @param target The target element to search for.
     * @return The index of the target element if found, -1 otherwise.
     */
    static int searchIndex(int[] arr, int target){
        return _searchIndex(arr, target, 0);
    }

    /**
     * Recursive helper method to find the index of the target element in the array.
     *
     * @param arr The input array to be searched.
     * @param target The target element to search for.
     * @param index The current index being checked.
     * @return The index of the target element if found, -1 otherwise.
     */
    private static int _searchIndex(int[] arr, int target, int index){
        // Base case: If the index reaches the end of the array, the element is not found.
        if(index == arr.length){
            return -1;
        }
        // Recursive case: Check if the current element is equal to the target,
        // and return the index if found, or recursively search the rest of the array.
        if(arr[index] == target){
            return index;
        }
        return _searchIndex(arr, target, index+1);
    }
}
