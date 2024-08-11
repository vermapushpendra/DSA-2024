package Searching.LinearSearch;

// https://leetcode.com/problems/richest-customer-wealth/

public class Richest_Customer {

    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(checkWealth(nums));
    }

    static int checkWealth(int[][] accounts) {
        int result = 0;
        // for (int person = 0; person < accounts.length; person++) {
        for (int[] row : accounts) {
            int sum = 0;
            // for (int account = 0; account < accounts[person].length; account++) {
            for (int account : row) {
                sum += account;
            }
            if (sum > result) {
                result = sum;
            }
        }

        return result;

    }
}
