package BinarySearch;

import java.sql.SQLOutput;
import java.util.Arrays;

public class _12RowColMatric {
    public static void main(String[] args) {
        //matrix sorted in row wise and col wise
        int [][] matrix = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 50;
        System.out.println(matrix.length);
        System.out.println(Arrays.toString(searchIndex(matrix , target)));
    }
//using lowerbound and upperbound concept
    static int[] searchIndex(int[][] matrix,int target){
        int row=0;
        int col= matrix.length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target)
            {
                return new int[]{row,col};
            }
            if(target>matrix[row][col]){
                row++;
            }
            if(target<matrix[row][col]){
                col--;
            }
        }
        return new int[]{-1,-1};

    }
}
