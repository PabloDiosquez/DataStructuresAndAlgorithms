package org.example;

/**
 * The {@code SortedArr} class provides a method to check whether
 * a given array of integers is sorted in non-decreasing order.
 */
public class SortedArr {

    /**
     * The main method serves as the entry point of the program.
     * It tests the {@code sorted} method with a sample input array.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 5, 7, 9};
        System.out.println(sorted(arr));  // Output: true
    }

    /**
     * Checks if the array is sorted in non-decreasing order.
     *
     * @param arr the array of integers to check
     * @return {@code true} if the array is sorted in non-decreasing order, {@code false} otherwise
     */
    static boolean sorted(int[] arr) {
        // An empty array or an array with a single element is considered sorted
        if (arr.length <= 1) {
            return true;
        }
        return sortedHelper(arr, 0);
    }

    /**
     * A recursive helper method that checks whether the array is sorted
     * starting from a given index.
     *
     * @param arr the array of integers to check
     * @param index the current index in the array to compare
     * @return {@code true} if the array is sorted from {@code index} onward, {@code false} otherwise
     */
    private static boolean sortedHelper(int[] arr, int index) {
        // Base case: if we've reached the last element, the array is sorted
        if (index == arr.length - 1) {
            return true;
        }

        // Recursive case: check if the current element is less than or equal to the next one
        // and proceed to the next element
        return arr[index] <= arr[index + 1] && sortedHelper(arr, index + 1);
    }
}
