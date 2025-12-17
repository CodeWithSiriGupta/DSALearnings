package LinearSearch;

public class _3SearchInRange {
    public static void main(String[] args) {

        int[] arr = {12 , 34, 6, -3 ,45,23,90};
        int target = 34 ;

        System.out.println(linearSearch(arr,target,1,5));
    }

    static int linearSearch(int[] arr , int target , int start , int end)
    {
        if(arr.length ==0)
        {
            return -1;
        }

        for(int i=start ; i<=end ; i++)
        {
            if(target==arr[i])
                return i;
        }
        return -1;
    }
}
