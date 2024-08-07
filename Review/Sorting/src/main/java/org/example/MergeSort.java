package org.example;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = sort(Arrays.copyOfRange(arr, middle, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        copy(first, mix, i, k);
        copy(second, mix, j, k);
        return mix;
    }

    private static void copy(int[] old, int[] arr, int startOld, int startNew) {
        while (startOld < old.length) {
            arr[startNew] = old[startOld];
            startOld++;
            startNew++;
        }
    }

}
