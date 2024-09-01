package Searching.BinarySearch;

public class Agnostic_Binary {

    public static void main(String[] args) {
        // int[] nums = { 2, 4, 7, 9, 11, 13, 15, 17, 45, 49 };
        int[] nums = { 56, 49, 45, 17, 13, 11, 9, 7, 4, 2 };
        int target = 11;
        System.out.println(searchIndex(nums, target));

    }

    static int searchIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[0] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                    // } else if (target < arr[mid]) {
                    // start = mid + 1;
                    // } else {
                    // return mid;
                    // }

                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}
