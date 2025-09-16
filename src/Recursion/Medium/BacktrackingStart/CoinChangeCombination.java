package Recursion.Medium.BacktrackingStart;

import java.util.ArrayList;

// similar to coin change 2 of leetcode but this is permutation that means multiple way of same representation
public class CoinChangeCombination {
    public static void main(String[] args){
        int amount = 5;
        int[] coins = {1,2,5};
        ArrayList<Integer> list = new ArrayList<>();
        int ans = CoinChange(amount, coins, "", 0);
        System.out.println(ans);
    }
    public static int CoinChange(int amount, int[] coins,String ans, int index){
        if(amount==0){
            System.out.println(ans);
            return 1;
        }
        int count=0;
        for(int i=index;i<coins.length;i++){
            if(amount>=coins[i]){
//                list.add(coins[i]);
                count+=CoinChange(amount-coins[i], coins, ans+coins[i], i);
//                list.remove(list.size()-1);
            }
        }
        return count;
    }
}
