package com.BinarySearch;

public class BS_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;

        int[] result = linearSearch(arr, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at indices: " + result[0] + ", " + result[1]);
        }
    }

    static int[] linearSearch(int[][] arr, int target){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] == target){
                    return new int[] {r, c};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] sortedArr, int target){
        int lb = 0;
        int ub = sortedArr.length-1;

        while(lb < sortedArr.length && ub >= 0){
            if(sortedArr[lb][ub] == target){
                return new int[]{lb, ub};
            }
            if(sortedArr[lb][ub] < target){
                lb++;
            } else {
                ub--;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] binSearch(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols / 2;

        while (rStart < rEnd-1){
            int middle = rStart + (rEnd - rStart) / 2;

            if(matrix[middle][cMid] == target){
                return new int[] {middle, cMid};
            }
            if(matrix[middle][cMid] < target){
                rStart = middle;
            } else {
                rEnd = middle;
            }
        }

        // Now we have 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        // Search in 1st half
        if(target <= matrix[rStart][cMid]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }

    }

    private static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int middle = colStart + (colEnd - colStart) / 2;

            if(arr[row][middle] == target){
                return new int[] {row, middle};
            }
            if(arr[row][middle] < target){
                colStart = middle+1;
            } else {
                colEnd = middle-1;
            }
        }
        return new int[]{-1, -1};
    }
}
