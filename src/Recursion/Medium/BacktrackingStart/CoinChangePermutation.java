package Recursion.Medium.BacktrackingStart;

import java.util.ArrayList;

// similar to coin change 2 of leetcode but this is permutation that means multiple way of same representation
public class CoinChangePermutation {
    public static void main(String[] args){
        int amount = 8;
        int[] coins = {2,3,5};
        ArrayList<Integer> list = new ArrayList<>();
        CoinChange(amount, coins, list);
    }
    public static void CoinChange(int amount, int[] coins,ArrayList<Integer> list){
        if(amount==0){
            System.out.println(list);
            return;
        }
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                list.add(coins[i]);
                CoinChange(amount-coins[i], coins, list);
                list.remove(list.size()-1);
            }

        }
    }
}
