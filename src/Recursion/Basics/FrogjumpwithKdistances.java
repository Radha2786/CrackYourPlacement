package Recursion.Basics;
import java.util.*;

public class FrogjumpwithKdistances {
    public static void main(String[] args){
        int[] heights = {15, 4, 1, 14, 15};
        int k = 3;
        int[] dp = new int[heights.length];
        Arrays.fill(dp,-1);
        int ans = Jump(heights,k,heights.length-1,dp);
        System.out.println(ans);
    }
    public static int Jump(int[] heights,int k, int index, int[] dp){

        if(index==0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=k;i++) {
            if (index >= i) {
                min = Math.min(min, Jump(heights, k, index - i,dp) + Math.abs(heights[index] - heights[index - i]));
            }
        }
        return dp[index]=min;
    }
}
