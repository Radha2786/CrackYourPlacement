package dp;

import java.util.Arrays;

public class DistinctSubsequences {
    public static void main(String[] args){
        String s = "rabbbit";
        String t = "rabbit";
        int[][] dp = new int[s.length()][t.length()];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
       int ans= CoinChangeVersion(s,t,0,0,dp);
       System.out.println(ans);
//       index1 -- s--> behaves like coin
//       index2 -- t--> behaves like amount;
    }
    public static int CoinChangeVersion(String s,String t, int index1, int index2,int[][] dp){
        if(index2==t.length()){
            return 1;
        }
        if(index1>=s.length()){
            return 0;
        }
        if(dp[index1][index2]!=-1){
            return dp[index1][index2];
        }
        int pick=0;
        int notpick=0;
        if(s.charAt(index1)==t.charAt(index2)){
            pick = CoinChangeVersion(s,t, index1+1,index2+1,dp);
        }
        notpick = CoinChangeVersion(s,t, index1+1,index2,dp);
        return dp[index1][index2]=pick+notpick;
    }
}
