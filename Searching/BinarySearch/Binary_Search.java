package Searching.BinarySearch;

public class Binary_Search {

    public static void main(String[] args) {
        int[] nums = { 6, 9, 11, 15, 22, 45 }; // Ascending
        int target = 15;
        System.out.println(searchIndex(nums, target));
    }

    static int searchIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target == arr[middle]) {
                return middle;
            } else if (target < arr[middle]) {
                end = middle - 1; // Ascending
            } else if (target > arr[middle]) {
                start = middle + 1; // Ascending
            } else {
                return middle;
            }
        }
        return -1;
    }

}
