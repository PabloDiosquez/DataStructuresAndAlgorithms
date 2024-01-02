package com.Recursion;

import java.util.Arrays;
import java.util.Random;

/**
 * This class provides an implementation of the QuickSort algorithm for sorting integer arrays.
 */
public class QuickSort {

    /**
     * The main method generates an array of random integers, sorts it using QuickSort,
     * and prints the array before and after sorting.
     *
     * @param args The command-line arguments (not used in this program).
     */
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

    /**
     * Sorts the given array using the QuickSort algorithm.
     *
     * @param arr The array to be sorted.
     */
    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Recursive method that performs QuickSort on a specified range of the array.
     *
     * @param arr       The array to be sorted.
     * @param lowIndex  The lowest index of the range to be sorted.
     * @param highIndex The highest index of the range to be sorted.
     */
    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int leftPointer = partition(arr, lowIndex, highIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    /**
     * Partitions the array into two segments around a randomly chosen pivot element.
     *
     * @param arr       The array to be partitioned.
     * @param lowIndex  The lowest index of the partition.
     * @param highIndex The highest index of the partition.
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(int[] arr, int lowIndex, int highIndex) {
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && arr[leftPointer] <= pivot) {
                leftPointer++;
            }

            while (leftPointer < rightPointer && arr[rightPointer] >= pivot) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param arr    The array in which elements are to be swapped.
     * @param first  The index of the first element to be swapped.
     * @param second The index of the second element to be swapped.
     */
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
