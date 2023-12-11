package com.BinarySearch;

public class OrderAgnosticBS {
    /**
     * Main method to demonstrate the order-agnostic binary search algorithm.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        try {
            // Sorted array for order-agnostic binary search
            int[] numbersAsc = new int[] {2, 5, 10, 15, 23, 34, 65, 78};
            int[] numbersDesc = new int[] {78, 65, 34, 23, 15, 10, 5, 2};

            // Target value to search for
            int target = 15;

            // Perform order-agnostic binary search for ascending order
            int resultAsc = orderAgnosticBinSearch(numbersAsc, target);
            printSearchResult(resultAsc, target, "Ascending Order");

            // Perform order-agnostic binary search for descending order
            int resultDesc = orderAgnosticBinSearch(numbersDesc, target);
            printSearchResult(resultDesc, target, "Descending Order");

        } catch (Exception e) {
            // Handle any exceptions thrown during binary search
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Perform order-agnostic binary search on a sorted array.
     *
     * @param sortedArr The sorted array to search.
     * @param target    The value to search for.
     * @return The index of the target value if found; otherwise, -1.
     * @throws Exception If the array is empty.
     */
    static int orderAgnosticBinSearch(int[] sortedArr, int target) throws Exception {
        // Check if the array is empty
        if (sortedArr.length == 0) {
            throw new Exception("The array is empty.");
        }

        // Determine the order of the array (ascending or descending)
        boolean isAsc = determineOrder(sortedArr);

        // Initialize start and end indices for binary search
        int start = 0;
        int end = sortedArr.length - 1;

        // Perform order-agnostic binary search
        while (start <= end) {
            int middle = start + (end - start) / 2;

            // Check if the middle element is the target
            if (sortedArr[middle] == target) {
                return middle; // Target found
            }

            // Adjust the search range based on the order of the array
            if (isAsc) {
                if (sortedArr[middle] < target) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (sortedArr[middle] < target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        // Target not found in the array
        return -1;
    }

    static boolean determineOrder(int[] sortedArr){
        return sortedArr[0] < sortedArr[sortedArr.length - 1] ;
    }

    /**
     * Print the result of the binary search.
     *
     * @param result The result of the binary search.
     * @param target The target value being searched for.
     * @param order  The order of the array (ascending or descending).
     */
    static void printSearchResult(int result, int target, String order) {
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result + " in " + order + ".");
        } else {
            System.out.println("Element " + target + " not found in the " + order + " array.");
        }
    }
}
