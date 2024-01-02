package com.Recursion;

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

        mergeSort(numbers);

        System.out.println("\nSorted:");
        System.out.println(Arrays.toString(numbers));
    }

    static void mergeSort(int[] inputArr){
        int inputLength = inputArr.length;

        if(inputLength <= 1){
            return;
        }

        int half = inputLength / 2;
        int[] left = new int[half];
        int[] right = new int[inputLength - half];

        for (int i = 0; i < half; i++) {
            left[i] = inputArr[i];
        }

        for (int i = half; i < inputLength; i++) {
            right[i - half] = inputArr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(inputArr, left, right);
    }

    private static void merge(int[] inputArr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                inputArr[k] = left[i];
                i++;
            } else {
                inputArr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            inputArr[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            inputArr[k] = right[j];
            j++;
            k++;
        }
    }

    static int[] mergeSortV1(int[] arr){
        return _mergeSortV1(arr, 0, arr.length-1);
    }
    private static int[] _mergeSortV1(int[] arr, int start, int end){
        if(start >= end){
            return new int[]{arr[start]};
        }

        int middle  = start + (end - start) / 2;
        int[] left  = _mergeSortV1(arr, start, middle);
        int[] right = _mergeSortV1(arr, middle+1, end);

        return mergeV1(left, right);
    }

    private static int[] mergeV1(int[] left, int[] right) {
        int[] merge = new int[left.length+right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                merge[k] = left[i];
                i++;
            } else {
                merge[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            merge[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            merge[k] = right[j];
            j++;
            k++;
        }
        return merge;
    }
}
