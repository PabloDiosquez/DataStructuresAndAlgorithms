package org.example;

// Stable.
// Used for smaller values of N. Works good when array is
// partially sorted.
// Best case: O(N)
// Worst case: O(N2)
public class InsertionSort {

    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length-1){
            int j = i+1;
            while (j > 0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
            i++;
        }
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
