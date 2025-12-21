package BinarySearch;

import java.util.Arrays;

public class _13SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.toString(search(arr,8)));
    }

    static int[] binarySearch(int[][] arr,int row , int cStart , int cEnd, int target)
    {
        while(cStart<=cEnd){
            int mid=(cStart+cEnd)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(target<arr[row][mid]){
                cEnd=mid-1;
            }else {
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr,int target){
        int rows = arr.length;
        int cols = arr[0].length;//be cautious matrix can be empty

        if(cols==0){
            return new int[]{-1,-1};
        }

        if(rows==1){
            return binarySearch(arr,0,0,cols-1,target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run the loop till 2 rows remaining
        while(rStart<(rEnd-1)){
            int mid = (rStart+rEnd)/2;

            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }

            if(target<arr[mid][cMid]){
                rEnd= mid;
            }else {
                rStart=mid;
            }
        }

        //now we have two rows
        //check weather the target is in the 2 rows

        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //Search in 1st half
        if(target<arr[rStart][cMid-1]){
            return binarySearch(arr,rStart,0,cMid-1,target);
        }
        //Search in 2nd half
        if(target>=arr[rStart][cMid+1] && target<=arr[rStart][cols-1]){
            return binarySearch(arr,rStart,cMid+1,cols-1,target);
        }

        //search in 3rd half
        if(target<arr[rStart+1][cMid-1])
        {
            return binarySearch(arr,rStart+1,0,cMid-1,target);
        }
        //search in 4 th half
        if(target>arr[rStart+1][cMid+1] && target <=arr[rStart+1][cols-1])
        {
            return binarySearch(arr,rStart+1,cMid+1 , cols-1,target);
        }

        return new int[]{-1,-1};
    }
}
