package com.Sorting.RadixSort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[] {291, 832, 47, 16, 11, 84};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
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
        int[] count  = new int[10]; // 10 digits: 0 -- 9
        int[] sums   = new int[10];

        // Arrays.fill(count, 0);

        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        for (int i = 1; i <= 9; i++) {
            sums[i] = sums[i-1] + count[i-1];
        }

        for (int num : arr) {
            output[sums[(num / exp) % 10]] = num;
            sums[(num / exp) % 10]++;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }
}
