package BinarySearch;

public class _4FlooringOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        //flooring = greatest element which should be less than or equal to target
        int target = 17;
        System.out.println(flooringSearch(arr, target));
    }

    //return the index of greatest number <=target
    static int flooringSearch(int[] arr, int target) {
        if (target > arr[arr.length - 1])
            return arr.length-1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return end;
    }
}
