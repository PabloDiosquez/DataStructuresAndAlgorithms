package com.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {12, 3, 45, 12, 654233};

        // Call the findNumbers method and store the result in the 'even' variable
        int even = findNumbers(numbers);

        // Print the result (number of integers with even digits)
        System.out.println("The number of integers with even digits is: " + even);
    }

    // Method to find the number of integers with an even number of digits
    static int findNumbers(int[] numbers){
        int count = 0;

        // Looping through each number in the array
        for(int number: numbers){
            // Checking if the number has an even number of digits
            if(even(number)) count++;
        }

        // Returning the count of numbers with even digits
        return count;
    }

    // Method to check if a number has an even number of digits
    static boolean even(int number){
        // Using the digits method to get the number of digits
        // and checking if it is even
        return digits(number) % 2 == 0;
    }

    // Method to count the number of digits in a number
    static int digits(int number){
        // Initializing a counter for the number of digits
        int numberOfDigits = 0;

        // Looping through each digit by dividing the number by 10
        // until the number becomes 0
        while(number > 0){
            numberOfDigits++;
            number = number / 10;
        }

        // Returning the count of digits
        return numberOfDigits;
    }
}
