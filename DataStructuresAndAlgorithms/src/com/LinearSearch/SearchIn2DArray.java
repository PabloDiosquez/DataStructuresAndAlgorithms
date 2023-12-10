package com.LinearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {

    }

    static int[] search(int[][] arr, int target) throws Exception {
        // Check if the 2D array is empty
        if (arr.length == 0) throw new Exception("The array is empty.");

        // Loop through each row of the 2D array
        for (int row = 0; row < arr.length; row++) {
            // Loop through each column of the current row
            for (int col = 0; col < arr[row].length; col++) {
                // Check if the current element is equal to the target
                if (arr[row][col] == target)
                    // Return [row, col] of the target if the target is found.
                    return new int[] {row, col};
            }
        }
        return new int[] {-1, -1};
    }
}