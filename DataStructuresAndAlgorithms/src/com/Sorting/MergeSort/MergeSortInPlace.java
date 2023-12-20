package com.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 6, 0, 2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr){
        _mergeSort(arr, 0, arr.length);
    }

    static void _mergeSort(int[] arr, int start, int end){
        if(end - start == 1) return;

        int middle = (start + end) / 2;
        _mergeSort(arr, start, middle);
        _mergeSort(arr, middle, end);
        merge(arr, start, middle, end);
    }

    static void merge(int[] arr, int start, int middle, int end){
        int[] mix = new int[end - start];
        int i = start, j = middle, k = 0;
        while(i < middle && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < middle){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
