package Arrays.SlidingWindow;

public class Max_Consecutive_Ones3 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int ans= longestOnes(nums, k);
        System.out.println(ans);
    }
    public static int longestOnes(int[] nums, int k) {
        int Count = 0;
        int CountZero =0;
        int MaxCount=0;
        int r = 0 , l=0;
        while(r<nums.length){
            if(nums[r]==0){
                if(CountZero >= k){
                    CountZero=1;
                    Count=1;
                }else{
                    CountZero++;
                    Count++;
                    MaxCount = Math.max(Count, MaxCount);
                }
            }else{
                Count++;
                MaxCount = Math.max(Count, MaxCount);
            }
            r++;
        }
        return MaxCount;
    }
}
