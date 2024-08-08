package org.example;

// InsertionSort is a class that provides a static method to sort an array of integers
// using the insertion sort algorithm.
//
// Insertion sort is a stable sorting algorithm that works well for smaller arrays
// or arrays that are already partially sorted.
//
// Characteristics:
// - Stable: Yes
// - Best case time complexity: O(N)
// - Worst case time complexity: O(N^2)
// - Use case: Suitable for smaller arrays or arrays that are partially sorted
public class InsertionSort {

    // Sorts the specified array of integers using the insertion sort algorithm.
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] >= arr[j - 1]) {
                    break;
                }
                swap(arr, j, j - 1);
            }
        }
    }

    // Swaps two elements in the specified array.
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
