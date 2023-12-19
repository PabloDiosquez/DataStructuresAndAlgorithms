package com.Sorting.CyclicSort;

// Given an array of integers nums containing n + 1 integers where each
// integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses
// only constant extra space.

// Constraints
// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one
// integer which appears two or more times.

import java.util.Arrays;

/**
 * The DuplicateNumber class demonstrates the identification of a duplicate number
 * in an array using the Cyclic Sort algorithm.
 */
public class DuplicateNumber {

    /**
     * The main method serves as the entry point of the program.
     * It initializes an array, and prints the duplicate number if found.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    /**
     * Finds and returns the first duplicate number in the given array using the Cyclic Sort algorithm.
     *
     * @param numbers The array of integers to find the duplicate number in.
     * @return The first duplicate number found, or -1 if no duplicates are found.
     */
    static int findDuplicate(int[] numbers) {
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] != i + 1) {
                int correct = numbers[i] - 1;
                if (numbers[i] != numbers[correct]) {
                    swap(numbers, i, correct);
                } else {
                    return numbers[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    /**
     * Swaps two elements in an array of integers.
     *
     * @param arr    The array in which the elements will be swapped.
     * @param first  The index of the first element to be swapped.
     * @param second The index of the second element to be swapped.
     */
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
