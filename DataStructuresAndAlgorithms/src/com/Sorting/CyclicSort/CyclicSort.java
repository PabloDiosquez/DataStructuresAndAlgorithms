package com.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,1,5,2,4,6,8,10,9,7};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Time Complexity: O(N)
    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp    = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
