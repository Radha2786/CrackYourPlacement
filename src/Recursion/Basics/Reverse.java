package Recursion.Basics;

public class Reverse {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2,4,3,5,6,3,7,56,3,11};
//        Reverse(n);
        System.out.println( firstOccurance(arr, 1, 0));
    }
    public static void Reverse(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Reverse(n-1);
    }

    public static int firstOccurance(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
//            System.out.println(index);
            return index;
        }
        return firstOccurance(arr,target,index+1);
    }

    public static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f1 = fibo(n-1);
         int f2 = fibo(n-2);
         return f1+f2;
    }
}
