package com.Sorting.CountingSort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,1,3,2,5,2,3};
        System.out.println(Arrays.toString(countingSort(arr)));
    }

    public static int[] countingSort(int[] arr){
        int max_value = findMax(arr);
        int[] count = new int[max_value+1];
        int[] sums  = new int[max_value+1];
        int[] ans   = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] += 1;
        }

        for (int i = 1; i < max_value+1; i++) {
            sums[i] = sums[i-1] + count[i-1];
        }

        for (int i = 0; i < arr.length; i++) {
            ans[sums[arr[i]]] = arr[i];
            sums[arr[i]]++;
        }

        return ans;
    }

    private static int findMax(int[] arr) {
        int max_value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }
}
