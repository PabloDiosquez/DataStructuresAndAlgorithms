package com.LinearSearch;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {
                {1,263},
                {2,4,50,},
                {10, 20}
        }));
    }

    static int maximumWealth(int[][] accounts){
        int maximumWealth = sum(accounts[0]);
        for (int person = 1; person < accounts.length; person++){
            if(maximumWealth < sum(accounts[person]))
                maximumWealth = sum(accounts[person]);
        }
        return maximumWealth;
    }
    static int sum(int[] person){
        int totalWealth = 0;
        for(int account = 0; account < person.length; account++){
            totalWealth += person[account];
        }
        return totalWealth;
    }
}
