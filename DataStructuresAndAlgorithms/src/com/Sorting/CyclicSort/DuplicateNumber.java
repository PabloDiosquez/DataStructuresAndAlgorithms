package com.Sorting.CyclicSort;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,5,3,4,5};
        cyclicSort(nums);
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums){
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) return nums[i];
        }
        return nums.length;
    }

    static void cyclicSort(int[] numbers){
        int i = 0;
        while(i < numbers.length){
            int correct = numbers[i] - 1;
            if(numbers[i] != numbers[correct]){
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
