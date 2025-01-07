package Oops;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7,3,2,15,7,1};
        System.out.println(Arrays.toString(arr));
        int[] sortedArray=MergeSort(arr);
        System.out.println("********");
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] MergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int s=0, end= arr.length-1;
        int mid = (s+(end-s)/2);
        int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid+1));
        int[] right = MergeSort(Arrays.copyOfRange(arr,mid+1,arr.length));
        int[] mergedArray= MergeTwoSortedArrays(left,right);
        return mergedArray;

    }
    public static int[] MergeTwoSortedArrays(int[] left, int[] right){
        int p1=0,p2=0;
        int[] ans = new int[left.length+right.length];
        int i=0;
        while(p1<left.length && p2<right.length){
            if(left[p1]<right[p2]){
                ans[i]= left[p1];
                p1++;
            }else{
                ans[i] = right[p2];
                p2++;
            }
            i++;
        }
        while(p1<left.length){
            ans[i]=left[p1];
            p1++;
            i++;
        }
        while(p2<right.length){
            ans[i]=right[p2];
            p2++;
            i++;
        }
        return ans;
    }
}
