package BinarySearch;

import java.util.Arrays;

public class _6Leet34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(firstAndLastPosition(arr, target)));
    }

    public static int[] firstAndLastPosition(int[] arr, int target) {
        
        if(target>arr[arr.length-1] || target<arr[0])
        {
            return new int[]{-1,-1};
        }
        //first occurence
        int start = 0;
        int end = arr.length;
        int firstPosition =-1;
        int lastPosition =-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        if(start>=0 && target==arr[start]) {
            firstPosition = start;
        }

        //second occurence
        int start1 = 0;
        int end1 = arr.length;

        while (start1 <= end1) {
            int mid1 = (start1 + end1) / 2;

            if (target < arr[mid1]) {
                end1 = mid1 - 1;
            } else {
                start1 = mid1 + 1;
            }
        }
        if(end1>=0 && target==arr[end1]) {
            lastPosition = end1;
        }
        return new int[]{firstPosition, lastPosition};
    }

}
