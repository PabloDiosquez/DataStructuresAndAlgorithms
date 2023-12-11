package com.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

    }

    static int binSearch(int[] sortedArr, int target) throws Exception {
        return _binSearch(sortedArr, target, 0, sortedArr.length);
    }

    static int _binSearch(int[] sortedArr, int target, int start, int end) throws Exception {
        if (sortedArr.length == 0) throw new Exception("The array is empty.");
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (sortedArr[middle] == target)
                return middle;
            else if (sortedArr[middle] < target)
                start = middle + 1;
            else
                end = middle - 1;
        }
        return -1;
    }
}
