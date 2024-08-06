package org.example;

//Not stable
//In-place
public class QuickSort {



    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
