package Sorting;

import java.util.Arrays;

public class _4CycleSort {
    public static void main(String[] args) {
        int[] arr = { 3,5,2,1,4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr){

        int i =0;
        while(i<arr.length){
            int index= arr[i]-1;
            if(arr[index]!=arr[i]){
                swap(arr,i,index);
            }else {
                i++;
            }
        }

    }

    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
