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

    //In-place
    public static void sorted(int[] arr){
        sorted(arr, 0, arr.length-1);
    }

    private static void sorted(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int middle = start + (end-start) / 2;
        sorted(arr, start, middle);
        sorted(arr, middle+1, end);

        merge(arr, start, middle, end);
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        int[] mix = new int[end-start];
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
            arr[start+l] = mix[l];
        }
    }

    private static void copy(int[] old, int[] arr, int startOld, int startNew) {
        while (startOld < old.length) {
            arr[startNew] = old[startOld];
            startOld++;
            startNew++;
        }
    }

}
