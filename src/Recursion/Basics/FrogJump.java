package Recursion.Basics;

public class FrogJump {
    public static void main(String[] args){
        int[] heights = {20, 30, 40, 20};
        int[] dp = new int[heights.length];
//         int ans = Jump(heights,heights.length-1,dp);
//        int ans = JumpBottomUp(heights);
        int ans=JumpOptmimal(heights);
        System.out.println(ans);
    }
    public static int Jump(int[] heights, int index,int[] dp){
        if(index==0){
            return 0;
        }
        //call for i-1
        int right= Integer.MAX_VALUE;
        int left=Jump(heights, index-1,dp)+ Math.abs(heights[index]-heights[index-1]);
        if(index>1) {
            right = Jump(heights, index - 2,dp) + Math.abs(heights[index] - heights[index - 2]);
        }
        return dp[index]=Math.min(right,left);
    }
    // tabulation
    public static int JumpBottomUp(int[] heights){
      int[] dp = new int[heights.length];
      dp[0]=0;
      for(int i=1;i<heights.length;i++){
          int left = dp[i-1]+ Math.abs(heights[i]-heights[i-1]);
          int right = Integer.MAX_VALUE;
          if(i>1){
              right = dp[i-2]+ Math.abs(heights[i]-heights[i-2]);
          }
          dp[i] = Math.min(left,right);
      }
      return dp[dp.length-1];
    }
    // space optimization
    public static int JumpOptmimal(int[] heights){
       int prev1 =0;
       int prev2=0;
        for(int i=1;i<heights.length;i++){
            int left = prev1+ Math.abs(heights[i]-heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1){
                right = prev2+ Math.abs(heights[i]-heights[i-2]);
            }
            int curr = Math.min(left,right);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }

}
