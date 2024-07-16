package Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] arr) {
        int mid = 0, low =0 , high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==1){
                mid++;
                continue;
            }else if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]= temp;
                high--;
            }
        }
    }
}
