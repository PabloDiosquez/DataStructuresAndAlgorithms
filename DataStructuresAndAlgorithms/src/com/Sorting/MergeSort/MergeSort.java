package com.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 10, 2, -1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;

        int middle = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] sortedArr1, int[] sortedArr2){
        int[] sorted = new int[sortedArr1.length + sortedArr2.length];

        int i = 0, j = 0, k = 0;
        while(i < sortedArr1.length && j < sortedArr2.length){
            if(sortedArr1[i] < sortedArr2[j]){
                sorted[k] = sortedArr1[i];
                i++;
            } else {
                sorted[k] = sortedArr2[j];
                j++;
            }
            k++;
        }

        while(i < sortedArr1.length){
            sorted[k] = sortedArr1[i];
            i++;
            k++;
        }

        while(j < sortedArr2.length){
            sorted[k] = sortedArr2[j];
            j++;
            k++;
        }
        return sorted;
    }
}
