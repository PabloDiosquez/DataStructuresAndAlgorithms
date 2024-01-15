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
        int[] ans = new int[]{-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    static int[] binSearch(int[][] sortedArr, int target){
        int[] ans = new int[] {-1, -1};

        int lowBound = 0;
        int upperBound = sortedArr.length-1;

        while(lowBound <= upperBound){
            if(sortedArr[lowBound][upperBound] == target){
                ans[0] = lowBound;
                ans[1] = upperBound;
                return ans;
            }

            if(sortedArr[lowBound][upperBound] < target){
                lowBound++;
            } else {
                upperBound--;
            }
        }
        return ans;
    }
}
