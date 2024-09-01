package Searching.BinarySearch;

public class RotatedArrayWithDuplicate {

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 10, 10, 0, 1, 2, 10 };
        int target = 1;
        System.out.println("Pivot: " + findPivotDuplicate(arr));
        System.out.println("Ans: " + search(arr, target));

    }

    static int search(int[] arr, int target) {
        int pivot = findPivotDuplicate(arr);

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

    static int findPivotDuplicate(int[] arr) {
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

            // if start, mid, end is equal then skip the element & narrow the array
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // At arround start and end might be pivot available
                if (arr[start] > arr[start + 1]) {
                    return start; // pivot
                }
                // skip
                start++;

                if (arr[end - 1] > arr[end]) {
                    return end - 1; // pivot
                }
                end--;

            } else if (arr[start] <= arr[mid]) {
                // Left is sorted, search in right side
                start = mid + 1;

            } else {
                // Right is sorted, search in Left side
                end = mid - 1;
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
