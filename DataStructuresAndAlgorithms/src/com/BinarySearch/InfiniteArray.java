package com.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,7,8,9,10,12,14,16,19,20,22};
        int target = 16;

        System.out.println(findIndex(arr, target));
    }

    static int findIndex(int[] sortedArray, int target){
        int start  = 0;
        int end    = 1;
        int middle = 0;

        while(true){
            if(sortedArray[end] <= target) end = end * 2;
            else break;
        }

        // Binary Search
        while(start <= end){
            middle = start + (end - start) / 2;
            if(sortedArray[middle] == target) return middle;
            else if(sortedArray[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return -1;
    }
}
