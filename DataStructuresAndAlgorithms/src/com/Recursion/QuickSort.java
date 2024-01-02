package com.Recursion;

import java.util.Arrays;
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
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }

        int leftPointer = partition(arr, lowIndex, highIndex);

        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }

    private static int partition(int[] arr, int lowIndex, int highIndex){
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);
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
        return leftPointer;
    }
    private static void swap(int[] arr, int first, int second){
        int temp    = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
