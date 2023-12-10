package com.LinearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // Example 2D array
        int[][] exampleArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Example target for search
        int targetSearch = 5;

        try {
            // Call the search function and print the result
            int[] searchResult = search(exampleArray, targetSearch);
            System.out.println("Search Result: [" + searchResult[0] + ", " + searchResult[1] + "]");

            // Call the max function and print the result
            int[] maxResult = max(exampleArray);
            System.out.println("Max Value Index: [" + maxResult[0] + ", " + maxResult[1] + "]");

        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Exception: " + e.getMessage());
        }
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

    static int[] max(int[][] arr) throws Exception {
        // Check if the 2D array is null
        if (arr == null) throw new Exception("The array is null.");

        // Check if the 2D array is empty
        if (arr.length == 0 || arr[0].length == 0) {
            throw new Exception("The array is empty.");
        }

        int rowMax = 0, colMax = 0;
        int max = arr[rowMax][colMax];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                    rowMax = row;
                    colMax = col;
                }
            }
        }
        return new int[]{rowMax, colMax};
    }
}