package Sorting;

import java.util.Arrays;

public class _1BubbleSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2 ,11};

        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static int[]   bubble(int [] arr){

        boolean swaped;
        for(int i=0;i<arr.length;i++){
            swaped=false;
            for(int j=1; j< arr.length-i;j++)
            {
                //swap
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;

                    swaped =true;
                }
            }

            if(!swaped){
                break;
            }
        }
 return arr;
    }
}
