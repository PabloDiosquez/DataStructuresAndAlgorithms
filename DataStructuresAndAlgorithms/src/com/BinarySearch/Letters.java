package com.BinarySearch;

public class Letters {
    public static void main(String[] args) {
        // Example usage of indexOfSmallestLetterGreaterThan
        char[] sortedArray1 = {'a', 'c', 'e', 'g', 'i'};
        char target1 = 'h';
        try {
            char result1 = nextGreatestLetter(sortedArray1, target1);
            System.out.println("Smallest letter greater than '" + target1 + "': " + result1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // Example usage of indexOfSmallestLetterGreaterThanV2
        char[] sortedArray2 = {'b', 'd', 'f', 'h', 'j'};
        char target2 = 'z';
        try {
            char result2 = nextGreatestLetterV2(sortedArray2, target2);
            System.out.println("Smallest letter greater than '" + target2 + "': " + result2);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Finds the smallest letter in a sorted array that is greater or equal than the target letter.
     * @param sortedArray The sorted array of characters.
     * @param target The target letter.
     * @return The index of the smallest letter greater than the target letter.
     * @throws Exception If the array of characters is empty.
     */
    static char nextGreatestLetter(char[] sortedArray, char target) throws Exception {
        // Check if the array of characters is empty
        if (sortedArray.length == 0) throw new Exception("The array of characters is empty.");

        // Check if the largest element in the array is smaller than the target
        if (sortedArray[sortedArray.length - 1] < target) return sortedArray[0];

        // Initialize variables for linear search
        int start = 0;
        int end = sortedArray.length - 1;
        int middle;

        // Linear search loop
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (sortedArray[middle] == target) return sortedArray[middle++];
            else if (sortedArray[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return sortedArray[start];
    }

    /**
     * Finds the smallest letter in a sorted array that is greater or equal than the target letter using binary search.
     * @param sortedArray The sorted array of characters.
     * @param target The target letter.
     * @return The index of the smallest letter greater than the target letter.
     * @throws Exception If the array of characters is empty.
     */
    static char nextGreatestLetterV2(char[] sortedArray, char target) throws Exception {
        // Check if the array of characters is empty
        if (sortedArray.length == 0) throw new Exception("The array of characters is empty.");

        // Check if the largest element in the array is smaller than the target
        if (sortedArray[sortedArray.length - 1] < target) return sortedArray[0];

        // Initialize variables for binary search
        int start = 0;
        int end = sortedArray.length - 1;
        int middle = 0;

        // Binary search loop
        while (start <= end) {
            // Calculate the middle index
            middle = start + (end - start) / 2;

            // Adjust the search range based on the comparison with the target
            if (sortedArray[middle] < target) {
                start = middle + 1; // Move the start index to the right of the middle
            } else {
                end = middle - 1;   // Move the end index to the left of the middle
            }
        }

        // Return the index of the smallest letter greater than the target
        return sortedArray[middle];
    }
}
