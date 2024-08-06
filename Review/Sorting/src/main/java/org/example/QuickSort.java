package org.example;

//Not stable
//In-place
public class QuickSort {

    public static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = arr[middle];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
            // Recursion part
            sort(arr, low, end);
            sort(arr, start, high);
        }
    }


    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
