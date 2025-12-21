package BinarySearch;

public class _11RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4,5,6,7,0,1,2};
        int ans = findPivot(arr);

        System.out.println(ans+1);
    }

    public static  int findPivot(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start<=end){
            int mid=(start+end)/2;

            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
