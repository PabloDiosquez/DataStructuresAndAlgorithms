package com.Sorting.CountingSort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,1,3,2,5,2,3};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }

        int max = findMax(arr);

        int[] countArr = new int[max+1];

        // Frequency array
        for(int num: arr){
            countArr[num]++;
        }

        int index = 0;
        for (int i = 0; i < max; i++) {
            while(countArr[i] > 0){
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }

    public static int[] countingSort(int[] arr){
        int max_value = findMax(arr);
        int[] count = new int[max_value+1];
        int[] sums  = new int[max_value+1];
        int[] ans   = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
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
        for (int num : arr){
            if(num > max_value){
                max_value = num;
            }
        }
        return max_value;
    }
}
