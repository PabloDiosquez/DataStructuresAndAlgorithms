package com.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 12, 14, 15, 16, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58};
        int target = 30;

        System.out.println(findIndex(arr, target));
    }

    static int findIndex(int[] sortedArray, int target){
        int start  = 0;
        int end    = 1;

        while(true){
            if(sortedArray[start] <= target && target <= sortedArray[end])
                break;
            start = end + 1;
            end = end * 2;
        }

        // Binary Search
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(sortedArray[middle] == target) return middle;
            else if(sortedArray[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return -1;
    }
}
