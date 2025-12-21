package BinarySearch;

public class _8Leet852_162 {
    public static void main(String[] args) {
        int[] arr ={0,1,0};
        System.out.println(peakIndex(arr));
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
