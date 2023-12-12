package com.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 4, 6, 8, 12, 15};
        int target = 2;

        try {
            int result = ceiling(arr, target);
            System.out.println("Index value: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int resultV2 = ceilingV2(arr, target);
            System.out.println("Index value (V2): " + resultV2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Improved algorithm to find the index of ceiling value in a sorted array
    static int ceiling(int[] sortedArr, int target) throws Exception {
        if (sortedArr.length == 0) throw new Exception("The array is empty.");

        if(target > sortedArr[sortedArr.length - 1]) return -1;

        int start = 0;
        int end = sortedArr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (sortedArr[middle] == target) return middle;
            else if (sortedArr[middle] < target) start = middle + 1; // Move to the right half
            else end = middle - 1; // Move to the left half
        }

        // If the loop ends, start points to the smallest element greater than target
        return start;
    }

    // Alternative implementation of the ceiling algorithm
    static int ceilingV2(int[] sortedArr, int target) throws Exception {
        if (sortedArr.length == 0) throw new Exception("The array is empty.");

        if(target > sortedArr[sortedArr.length - 1]) return -1;

        int start = 0;
        int end = sortedArr.length - 1;
        int middle = 0;

        while (start <= end) {
            middle = start + (end - start) / 2;

            if (sortedArr[middle] < target) start = middle + 1; // Move to the right half
            else end--; // Move to the left half
        }

        // If the loop ends, middle points to the smallest element greater than target
        return middle;
    }
}
