package dp;
import java.util.*;

public class CoinChange2 {
    public static void main(String[] args){
       int amount = 5;
       int[] coins = {1,2,5};
//       int ans=Coin(amount,coins,0);
//       System.out.println(ans);
        // 2 variables change ho rahe hai recursion m (amount and index) isliye 2d array banega
        int[][] dp = new int[amount+1][coins.length];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
//        System.out.println(CoinChange2TD(amount, coins,0,dp));
        System.out.println(CoinChange2BU(amount, coins));
    }
    public static int Coin(int amount, int[] coins,int index){
        if(amount==0){
            return 1;
        }
        if(index==coins.length){
            return 0;
        }
        int pick=0;
        int notpick=0;
            if(amount>=coins[index]) {
                pick = Coin(amount - coins[index], coins, index);
            }
            notpick=Coin(amount,coins,index+1);

        return pick+notpick;
    }

    public static int CoinChange2TD(int amount, int[] coins,int index, int[][] dp){
        if(amount==0){
            return 1;
        }
        if(index==coins.length){
            return 0;
        }
        if(dp[amount][index]!=-1){
            return dp[amount][index];
        }
        int pick=0;
        int notpick=0;
        if(amount>=coins[index]) {
            pick = CoinChange2TD(amount - coins[index], coins, index,dp);
        }
        notpick=CoinChange2TD(amount,coins,index+1,dp);
        dp[amount][index]=pick+notpick;
        return pick+notpick;
    }

    public static int CoinChange2BU(int amount, int[] coins){
        int[][] dp = new int[amount+1][coins.length+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=1;
        }
        for(int  am=1;am<dp.length;am++){ // amount (row)
            for(int i=1;i<dp[0].length;i++){ // coin(col)
                int pick=0;
                int notpick=0;
                if(am>=coins[i-1]) {
                pick = dp[am - coins[i-1]][i];
                }
                notpick=dp[am][i-1];
                dp[am][i]= pick+notpick;
            }
        }
        return dp[amount][coins.length];

    }

}
