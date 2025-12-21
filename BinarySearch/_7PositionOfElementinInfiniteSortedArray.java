package BinarySearch;

public class _7PositionOfElementinInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 12, 15, 23, 45, 89,100};
        int target = 45;
        System.out.println(search(arr,target));

    }

   public  static int search(int[] arr , int target)
    {
     int start =0;
     int end=1;
     while(end < arr.length &&target>arr[end])
     {
         int newStart=end+1;
         int newEnd = end + ((end-start+1)*2);
          start = newStart;
          end = newEnd;
     }

     return BinarySearch(arr , target , start,end);

    }

     static int BinarySearch(int[] arr, int target, int start, int end) {

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
