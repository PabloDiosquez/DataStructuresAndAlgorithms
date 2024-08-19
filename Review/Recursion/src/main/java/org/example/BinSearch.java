package org.example;

public class BinSearch {
    public static int search(int[] arr, int item, int start, int end) {
        // Base case: item not found
        if (start > end) {
            return -1;
        }

        // Calculate the midpoint to avoid overflow
        int mid = start + (end - start) / 2;

        // Check if the middle element is the item
        if (arr[mid] == item) {
            return mid;
        }

        // If the item is greater, search the right half
        else if (arr[mid] < item) {
            return search(arr, item, mid + 1, end);
        }

        // Otherwise, search the left half
        return search(arr, item, start, mid - 1);
    }

}
