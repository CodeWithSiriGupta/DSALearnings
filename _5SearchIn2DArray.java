package LinearSearch;

import java.util.Arrays;

public class _5SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{23 , 34,12 }, { 45 , 98,67} , {12 , 3,6}};
        int target = 45;
        System.out.println(Arrays.toString(searchIn2D(arr,target)));
        System.out.println(max(arr));
    }

    static int[] searchIn2D(int[][] arr , int target)
    {
        if(arr.length==0)
        {
            return new int[]{-1,-1};
        }

        for(int row = 0 ; row<arr.length ;row++)
        {
            for(int col = 0 ; col < arr[row].length ; col++)
            {
                if(target == arr[row][col])
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr)
    {
        int max= Integer.MIN_VALUE;

        for( int[] i : arr)
        {
            for(int ele : i)
            {
                if(ele>max)
                {
                    max= ele;
                }
            }
        }
        return max;
    }
}
