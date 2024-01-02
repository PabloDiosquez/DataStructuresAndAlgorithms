package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }
        System.out.println("Unsorted:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\nSorted:");
        System.out.println(Arrays.toString(mergeSort(numbers)));
    }

    static int[] mergeSort(int[] arr){
        return _mergeSort(arr, 0, arr.length-1);
    }
    private static int[] _mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return new int[]{arr[start]};
        }

        int middle  = start + (end - start) / 2;
        int[] left  = _mergeSort(arr, start, middle);
        int[] right = _mergeSort(arr, middle+1, end);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length+right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                merge[k] = left[i];
                i += 1;
            } else {
                merge[k] = right[j];
                j += 1;
            }
            k += 1;
        }

        while(i < left.length){
            merge[k] = left[i];
            i += 1;
            k += 1;
        }

        while(j < right.length){
            merge[k] = right[j];
            j += 1;
            k += 1;
        }
        return merge;
    }
}
