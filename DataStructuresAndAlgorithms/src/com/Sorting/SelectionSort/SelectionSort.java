package com.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {12, 4, -21, 0, 7, 8, 91};
        try {
            selection(nums);
            System.out.println(Arrays.toString(nums));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void selection(int[] arr) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            swap(arr, last, getMaxIndex(arr, 0, arr.length-i));
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) throws Exception{
        if(arr.length == 0) throw new Exception("The array is empty.");
        int maxIndex = start;
        for (int i = start+1; i < end; i++) {
            if(arr[i] > arr[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int second){
        int temp    = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
