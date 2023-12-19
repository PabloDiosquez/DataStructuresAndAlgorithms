package com.Sorting.CyclicSort;

// Given an array 'nums' containing n distinct numbers in the range [0, n], return
// the only number in the range that is missing from the array.
// Could you implement a solution using only O(1) extra space in memory
// and O(n) runtime complexity?

public class MissingNumber {
    public static void main(String[] args) {
        int[] range = {0,2};
        System.out.println(missingNumber(range));
    }

    static int missingNumber(int[] range){
        cyclicSort(range);
        int j = 0;
        while(j < range.length){
            if(range[j] != j) break;
            j++;
        }
        return j;
    }

    static void cyclicSort(int[] range){
        int i = 0;
        while(i < range.length){
            int correct = range[i];
            if(range[i] == range.length){
                i++;
            } else {
                if(range[i] != range[correct]){
                    swap(range, i, correct);
                } else {
                    i++;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp    = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
