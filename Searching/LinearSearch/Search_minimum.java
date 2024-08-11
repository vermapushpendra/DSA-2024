package Searching.LinearSearch;

public class Search_minimum {
    public static void main(String[] args) {
        int nums[] = { 23, 16, -1, 9, 2, 1, 45 };

        System.out.println(searchMin(nums));

    }

    static int searchMin(int arr[]) {
        int min = arr[0];

        if (arr.length == 0) {
            return -1; // length of array is o
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;

    }
}
