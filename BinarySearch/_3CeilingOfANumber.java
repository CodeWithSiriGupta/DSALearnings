package BinarySearch;

public class _3CeilingOfANumber {
    public static void main(String[] args) {
        int [] arr = { 2,3,5,9,14,16,18};
        //ceiling = smallest element which should be greater than or equal to target
        int target = 15;
        System.out.println(ceilingSearch(arr, target));
    }

    //return the index of smallest number >=target
    static int ceilingSearch(int [] arr , int target)
    {
        if(target > arr[arr.length-1])
              return -1;

        int start=0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = (start+end )/2 ;

            if( arr[mid]==target)
            {
                return mid;
            }

            if(arr[mid]>target)
            {
                end=mid-1;
            }
            if(arr[mid]<target)
            {
                start=mid+1;
            }
        }
        return start;
    }
}
