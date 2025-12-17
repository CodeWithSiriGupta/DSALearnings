package LinearSearch;

public class _4MinNum {
    public static void main(String[] args) {
        int[] arr = { 34 , 12 , 9 , 5, 34};
        System.out.println(minNum(arr));
    }


    static int minNum(int[] arr)
    {
        int defaultMin = arr[1];
        for(int index=0 ; index < arr.length ; index++)
        {
            if(defaultMin >arr[index])
            {
                defaultMin=arr[index];
            }
        }
        return defaultMin;
    }
}
