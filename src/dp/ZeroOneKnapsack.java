package dp;

import java.util.Arrays;

public class ZeroOneKnapsack {
    public static void main(String[] args){
        int capacity = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int[][] dp = new int[capacity+1][wt.length];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
       int ans= CoinChange(capacity, val, wt, 0,dp);
       System.out.println(ans);
    }
    public static int CoinChange(int capacity, int[] val, int[] wt, int w,int[][] dp){
        if(capacity==0){
            return 0;
        }
        if(w==wt.length){
            return 0;
        }

        if(dp[capacity][w]!=-1){
            return dp[capacity][w];
        }

        int pick=0;
        int notpick=0;
        if(capacity>=wt[w]){
             pick = val[w]+ CoinChange(capacity-wt[w],val,wt,w+1, dp);
        }
        notpick = CoinChange(capacity,val,wt,w+1,dp);
        dp[capacity][w]=Math.max(pick,notpick);
        return Math.max(pick,notpick);
    }
}
