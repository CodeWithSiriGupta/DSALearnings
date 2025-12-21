package BinarySearch;

public class _9Leet1095 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,45,67,12,2};
        int target = 12;
        System.out.println(searchInMountain(arr,target));

    }

    private static int searchInMountain(int[] arr, int target) {

        //first find the peak in the array
        int index = peakIndex(arr);
        int start=0;
        int end=arr.length-1;
        if(arr[index]==target){
            return index;
        }

        int firstTry = BinarySearch(arr,target,index+1,end,false);
        if(firstTry==-1)
           return BinarySearch(arr,target,start,index-1,true);

      return firstTry;
    }

    public static int BinarySearch(int[] arr,int target,int start , int end ,boolean isAsc){

        if(isAsc){
            while(start<=end){
                int mid= (start+end)/2;

                if(target < arr[mid])
                {
                    end=mid-1;
                }
                else if (target>arr[mid]) {
                    start=mid+1;
                }
                else {
                    return mid;
                }
            }
        }else {
            int mid= (start+end)/2;

            if(target < arr[mid])
            {
                start=mid+1;
            }
            else if (target>arr[mid]) {

                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return-1;
    }

    private static int peakIndex(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int mid= (start+end)/2;
            if(arr[mid+1]>arr[mid])
            {
                start=mid+1;
            }else {
                end=mid;
            }
        }
        return end;
    }

}
