package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int firstMax = Integer.MIN_VALUE;
        int secondMax = firstMax;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if(arr[i]> secondMax && arr[i]!= firstMax){
                secondMax = arr[i];
            }

        }
        if(secondMax == firstMax){
            return -1;
        }else{
            return secondMax;
        }
    }
}
