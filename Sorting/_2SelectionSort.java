package Sorting;

import java.util.Arrays;

public class _2SelectionSort {
    public static void main(String[] args) {
        int[] arr={ 3 , 5, 7, 8, 10 , 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int [] arr)
    {
        for(int i=0 ; i< arr.length ;i++){

            //first find max index from the remaininf array
            int maxIndex=getMaxIndex(arr,0,arr.length-i-1);
            //swap
            swap(arr,maxIndex,arr.length-i-1);//arr.length-i-1 is the last index
        }
    }

    public static void swap(int[]arr, int first  , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static int getMaxIndex(int [] arr , int start , int end){

        int max = start;

      for(int i=start ; i<end ; i++){
          if(arr[max]<arr[i]){
              max=i;
          }
      }
      return max;
    }
}
