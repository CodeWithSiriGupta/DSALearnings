package BinarySearch;

public class _2OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = { 567 , 230 , 156 , 89, 34 , 7 , 6 , -4 , -11};
        int target = 230;
        System.out.println(OrderAgnosticBS(arr , target));
    }

    private  static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = false;
        if(arr[start]<arr[end]){
            isAsc=true;
        }

        while(start<=end)
        {
            int mid = start+end /2;

            if(target == arr[mid])
            {
                return mid;
            }

            if(isAsc)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if(target>arr[mid])
                {
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
