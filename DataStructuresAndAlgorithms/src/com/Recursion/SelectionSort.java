package com.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 8, 0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        _selection(arr, 0);
    }

    static void _selection(int[] arr, int index){
        if(index == arr.length){
            return;
        }

        int minIndex = minIndex(arr, index);
        swap(arr, index, minIndex);
        _selection(arr, index+1);
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int minIndex(int[] arr, int index) {
        if(index == arr.length-1){
            return index;
        }

        int minIndex = minIndex(arr, index+1);
        if(arr[index] < arr[minIndex]){
            return index;
        }
        return minIndex;
    }


}
