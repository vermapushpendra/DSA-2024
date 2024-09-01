package Searching.BinarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 2, 3, 5, 6, 8, 9 };
        int target = 9;
        System.out.println("Pivot: " + findPivot(arr));
        System.out.println("Ans: " + search(arr, target));

    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        int start = 0;
        int end = arr.length - 1;

        // if pivot is -1 that means pivot did not found and means array is not rotated
        // so then apply Normal Binary search for entire array
        if (pivot == -1) {
            return Binary(arr, target, start, end);
        }

        if (target == arr[pivot]) {
            return pivot;
        }

        if (target >= arr[start]) {
            // Search in left part
            int left = Binary(arr, target, 0, pivot);
            return left;
        } else {
            // search in right part
            int right = Binary(arr, target, pivot + 1, arr.length - 1);
            return right;
        }

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int Binary(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
