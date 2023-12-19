package com.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

/**
 * This class, FindAllMissingNumbers, demonstrates the use of Cyclic Sort to find and document missing numbers in an array.
 */
public class FindAllMissingNumbers {

    /**
     * The main method serves as the entry point of the program.
     * It initializes an array, applies the Cyclic Sort algorithm, and prints the missing numbers.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] arr = {1, 1};
        cyclicSort(arr);
        System.out.println(findNumbers(arr));
    }

    /**
     * Finds and returns a list of missing numbers in the given array using the Cyclic Sort algorithm.
     *
     * @param numbers The array of integers to find missing numbers in.
     * @return A list of missing numbers in the array.
     */
    static List<Integer> findNumbers(int[] numbers) {
        cyclicSort(numbers);
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= numbers.length; i++) {
            if (numbers[i - 1] != i) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    /**
     * Applies the Cyclic Sort algorithm to sort an array of integers in place.
     *
     * @param numbers The array of integers to be sorted.
     */
    static void cyclicSort(int[] numbers) {
        int i = 0;
        while (i < numbers.length) {
            int correct = numbers[i] - 1;
            if (numbers[i] != numbers[correct]) {
                swap(numbers, i, correct);
            } else {
                i++;
            }
        }
    }

    /**
     * Swaps two elements in an array of integers.
     *
     * @param numbers The array in which the elements will be swapped.
     * @param first   The index of the first element to be swapped.
     * @param second  The index of the second element to be swapped.
     */
    static void swap(int[] numbers, int first, int second) {
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;
    }
}
