package org.example;

public class MergeSort {

    public static int[] sort(int[] arr){
        return sort(arr, 0, arr.length - 1);
    }

    private static int[] sort(int[] arr, int start, int end){
        if (start >= end) {
            return new int[]{arr[start]};
        }
        int middle = start + (end - start) / 2;
        int[] left = sort(arr, start, middle);
        int[] right = sort(arr, middle + 1, end);
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int s = 0; int e = 0; int k = 0;
        int[] merged = new int[first.length + second.length];
        while(s < first.length && e < second.length){
            if(first[s] < second[e]){
                merged[k] = first[s];
                s++;
            } else {
                merged[k] = second[e];
                e++;
            }
            k++;
        }
        if (first.length - s >= 0) System.arraycopy(first, s, merged, k, first.length - s);
        if (second.length - e >= 0) System.arraycopy(second, e, merged, k, second.length - e);
        return merged;
    }
}
