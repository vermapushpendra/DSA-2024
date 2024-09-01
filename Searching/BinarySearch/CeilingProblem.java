package Searching.BinarySearch;

public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 8, 12, 17, 19 };
        int target = 15;

        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return start; // returning next greater element to the target instead of -1
    }
}
