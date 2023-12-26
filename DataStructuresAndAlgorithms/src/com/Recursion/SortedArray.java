package com.Recursion;

/**
 * The SortedArray class checks if an array is sorted in ascending order.
 */
public class SortedArray {

    /**
     * The main method to demonstrate the usage of the sorted method.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9};
        System.out.println(sorted(arr));
    }

    /**
     * Checks if an array is sorted in ascending order.
     *
     * @param arr The input array to be checked for sorting.
     * @return true if the array is sorted, false otherwise.
     */
    static boolean sorted(int[] arr){
        return _sorted(arr, 0);
    }

    /**
     * Recursive helper method to check if an array is sorted in ascending order.
     *
     * @param arr The input array to be checked for sorting.
     * @param index The index to index checking for sorting.
     * @return true if the array is sorted, false otherwise.
     */
    static boolean _sorted(int[] arr, int index){
        // Base case: If the 'index' index is at the end of the array, it is considered sorted.
        if(index == arr.length - 1){
            return true;
        }
        // Recursive case: Check if the current element is less than the next element,
        // and recursively check the rest of the array.
        return arr[index] < arr[index+1] && _sorted(arr, index+1);
    }
}
