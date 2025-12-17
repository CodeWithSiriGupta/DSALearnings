package BinarySearch;

public class _1CodeBS {
    public static void main(String[] args) {
        int[] arr = { -18,-12,-5, 3 , 5 ,34 , 56 , 67, 89 , 100 };
        int target = -12;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
