package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Before:");
        System.out.println(Arrays.toString(numbers));

        quickSort(numbers);

        System.out.println("\nAfter:");
        System.out.println(Arrays.toString(numbers));
    }

    static void quickSort(int[] arr){
        _quickSort(arr, 0, arr.length-1);
    }

    private static void _quickSort(int[] arr, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }

        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){

            while(leftPointer < rightPointer && arr[leftPointer] <= pivot){
                leftPointer++;
            }

            while(leftPointer < rightPointer && arr[rightPointer] >= pivot){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        _quickSort(arr, lowIndex, leftPointer-1);
        _quickSort(arr, leftPointer+1, highIndex);
    }

    private static void swap(int[] arr, int first, int second){
        int temp    = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
