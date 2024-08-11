package Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int nums[] = { 16, 45, 7, 9, 5, 6, 12, 44 };
        int target = 45;

        System.out.println(linearSearch(nums, target));
    }

    // Searching: if item found return index Otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
