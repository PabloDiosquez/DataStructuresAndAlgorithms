package com.LinearSearch;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] nums = {23, 12, 56, 75, 11, 14};
        int target = 75;

        System.out.printf("Index of %s: %s%n", target, linearSearch(nums, 75));
    }

    static int linearSearch(int[] numbers, int target) throws Exception {
        if(numbers == null) throw new Exception("The array is null.");
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] == target) return index;
        }
        return -1;
    }
}
