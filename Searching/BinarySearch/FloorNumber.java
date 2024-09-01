package Searching.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 8, 12, 17, 19 };
        int target = 18;

        System.out.println(findFloor(arr, target));
    }

    static int findFloor(int[] arr, int target) {
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
        return end;
    }

}
