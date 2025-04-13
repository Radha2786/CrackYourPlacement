package Arrays;

public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));

    }
    public static int maxAscendingSum(int[] nums) {
        int sum =nums[0];
        int MaxSum=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                sum=nums[i];
                continue;
            }
            sum+=nums[i];
            MaxSum = Math.max(sum, MaxSum);

        }
        return MaxSum;
    }
}
