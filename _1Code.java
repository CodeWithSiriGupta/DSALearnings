package LinearSearch;

public class _1Code {

    public static void main(String[] args) {
      int[] arr = { 12, 45, 1 , 4, 7, 13, 19};
      int target = 45;
      int ans1 = linearSearch(arr,target);
      int ans2 = linearSearch2(arr,target);
      boolean ans3 = linearSearch3(arr,target);
      System.out.println(ans3);
    }

    //search the element and return true or false
    static boolean linearSearch3(int arr[] , int target)
    {
        if(arr.length == 0)
        {
            return false;
        }

        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    //search the element and return element
    static int linearSearch2(int arr[] , int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for (int i : arr) {
            if (i == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    //search in array : return the index if item is found
    //otherwise if item not found return -1
    static int linearSearch(int arr[] , int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int index =0 ; index < arr.length ;index++)
        {
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }
}