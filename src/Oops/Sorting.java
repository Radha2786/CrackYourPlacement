package Oops;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {7,5,3,1,9,4};
//        InsertionSort(arr);
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
    }
    public static void InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int item = arr[i];
            while(j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=item;
        }
    }
    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void QuickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid=Partition(arr,low,high);
        QuickSort(arr,low,mid-1);
        QuickSort(arr,mid+1,high);
    }
    public static int Partition(int[] arr, int low, int high){
        int idx = 0;
        int last_ele = arr[high];
        low=0;
        while(low<high){
            if(arr[low]<arr[high]){
                // swap
                int temp = arr[idx];
                arr[idx]= arr[low];
                arr[low]= temp;
                idx++;
            }
            low++;
        }
        int temp=arr[idx];
        arr[idx]= arr[high];
        arr[high] = temp;
        return idx;
    }

}
