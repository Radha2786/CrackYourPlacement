package Arrays;

public class Continuous_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums ={1,0};
        int k=2;
        boolean ans=checkSubarraySum(nums,k);
        System.out.println(ans);
    }
    public static  boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum%k==0){
                    if(j==0){
                        continue;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
