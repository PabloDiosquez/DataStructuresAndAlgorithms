package com.LinearSearch;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        // Example usage of maximumWealth function with a 2D array representing bank accounts
        int[][] bankAccounts = {
                {1, 26},
                {2, 4, 50},
                {10, 20}
        };

        // Calculate and print the maximum wealth among all persons
        System.out.println("Maximum Wealth: " + maximumWealth(bankAccounts));
    }

    // Function to find the maximum wealth among all persons
    static int maximumWealth(int[][] accounts) {
        // Initialize maximumWealth with the wealth of the first person
        int maximumWealth = total_wealth_of_a_person(accounts[0]);

        // Iterate through each person's accounts to find the maximum wealth
        for (int person = 1; person < accounts.length; person++) {
            int currentWealth = total_wealth_of_a_person(accounts[person]);

            // Update maximumWealth if the current person has more wealth
            if (maximumWealth < currentWealth) {
                maximumWealth = currentWealth;
            }
        }
        return maximumWealth;
    }

    // Function to calculate the total wealth of a person
    static int total_wealth_of_a_person(int[] person) {
        int totalWealth = 0;

        // Iterate through each account to calculate total wealth
        for (int account = 0; account < person.length; account++) {
            totalWealth += person[account];
        }
        return totalWealth;
    }
}
