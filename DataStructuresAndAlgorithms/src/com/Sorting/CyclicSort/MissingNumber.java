package com.Sorting.CyclicSort;

// Given an array 'numbers' containing n distinct numbers in the range [0, n], return
// the only number in the range that is missing from the array.
// Could you implement a solution using only O(1) extra space in memory
// and O(n) runtime complexity?

public class MissingNumber {
    public static void main(String[] args) {
        int[] range = {0, 2, 3, 4};
        System.out.println("Missing Number: " + missingNumber(range));
    }

    static int missingNumber(int[] numbers){
        cyclicSort(numbers);
        int j = 0;
        while(j < numbers.length){
            if(numbers[j] != j) break;
            j++;
        }
        return j;
    }

    static void cyclicSort(int[] numbers){
        int i = 0;
        while(i < numbers.length){
            int correct = numbers[i]; // 3
            if(numbers[i] < numbers.length && numbers[i] != numbers[correct]){
                swap(numbers, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp    = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
