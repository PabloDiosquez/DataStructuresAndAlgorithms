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

    static int[] binSearch(int[][] sortedArr, int target){
        return null;
    }

    private static int[] binarySearch(int[] arr, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int middle = (colStart + colEnd) / 2;

            if(arr[middle] == target){
                return new int[] {row, middle};
            }

            if(arr[middle] < target){
                colStart = middle+1;
            } else {
                colEnd = middle-1;
            }
        }
        return new int[]{-1, -1};
    }
}
