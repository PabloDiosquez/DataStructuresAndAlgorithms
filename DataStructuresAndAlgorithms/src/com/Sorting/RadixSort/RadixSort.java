package com.Sorting.RadixSort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[] {29, 83, 471, 36, 91, 8};
        radixSort(arr);
    }

    public static void radixSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();

        // Do count sort for every digit place
        for (int exp = 1; max/exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // 10 digits: 0 -- 9

        // Arrays.fill(count, 0);

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i-1];
        }



    }
}
