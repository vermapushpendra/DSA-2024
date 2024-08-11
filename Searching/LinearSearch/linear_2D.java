package Searching.LinearSearch;

import java.util.Arrays;

public class linear_2D {
    public static void main(String[] args) {
        int[][] nums = {
                { 3, 7, 12, 65 },
                { 4, 6, 8, 1 },
                { 45, 13, 18 }
        };

        int target = 8;

        // System.out.println(search2D(nums, target));
        System.out.println(Arrays.toString(search2D(nums, target)));
    }

    static int[] search2D(int[][] arr, int target) {

        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }

        }

        return new int[] { -1, -1 };
    }

}
