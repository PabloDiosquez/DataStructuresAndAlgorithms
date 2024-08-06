package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Test case 1: Regular array with mixed values
        int[] arr1 = {3, 4, 7, 1, 22};
        //SelectionSort.sort(arr1);
        QuickSort.sort(arr1);
        System.out.println("Sorted arr1 = " + Arrays.toString(arr1));

        // Test case 2: Array already sorted
        int[] arr2 = {1, 2, 3, 4, 5};
        SelectionSort.sort(arr2);
        System.out.println("Sorted arr2 = " + Arrays.toString(arr2));

        // Test case 3: Array sorted in descending order
        int[] arr3 = {5, 4, 3, 2, 1};
        SelectionSort.sort(arr3);
        System.out.println("Sorted arr3 = " + Arrays.toString(arr3));

        // Test case 4: Array with duplicate values
        int[] arr4 = {2, 3, 2, 3, 2};
        SelectionSort.sort(arr4);
        System.out.println("Sorted arr4 = " + Arrays.toString(arr4));

        // Test case 5: Array with a single element
        int[] arr5 = {42};
        SelectionSort.sort(arr5);
        System.out.println("Sorted arr5 = " + Arrays.toString(arr5));

        // Test case 6: Empty array
        int[] arr6 = {};
        SelectionSort.sort(arr6);
        System.out.println("Sorted arr6 = " + Arrays.toString(arr6));
    }
}
