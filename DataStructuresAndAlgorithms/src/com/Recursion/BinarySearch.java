package com.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArr = {3,5,7,11,14,20};
        System.out.println(_binarySearch(sortedArr, 2, 0, sortedArr.length-1));
    }

    static int binarySearch(int[] sortedArr, int target){
        return _binarySearch(sortedArr, target, 0, sortedArr.length-1);
    }
    static int _binarySearch(int[] sortedArr, int target, int start, int end){
            if (end < start) return -1;
            int middle = start + (end - start) / 2;
            if(sortedArr[middle] == target) return middle;
            else if(sortedArr[middle] < target) return _binarySearch(sortedArr, target, middle+1, end);
            return _binarySearch(sortedArr, target, start, middle-1);
    }
}
