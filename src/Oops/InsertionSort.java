package Oops;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10,9,5,8,1};
         Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void Sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int item = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                 j--;
            }

            arr[j+1]=item;
        }
    }
}
