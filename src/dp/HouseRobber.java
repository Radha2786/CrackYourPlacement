package dp;
import java.util.*;
public class HouseRobber {
    public static void main(String[] args){
        int[] nums = {7,5,3,13,1};
        int[] dp = new int[nums.length];
//        int ans = HouseRobberTopDown(nums,0, dp);
//        int ans = HouseRobberTopDown2(nums,nums.length-1, dp);
        int ans  = HouseRobberBottomUp( nums,  dp);
        System.out.println(ans);
    }
    public static int HouseRobberTopDown(int[] arr, int index, int[] dp){
        if(index>=arr.length){
            return 0;
        }
        int choose=arr[index]+HouseRobberTopDown(arr,index+2,dp);
        int notchoose =HouseRobberTopDown(arr, index+1,dp);
        return dp[index] = Math.max(choose, notchoose);
    }

    public static int HouseRobberTopDown2(int[] arr, int index, int[] dp){
        if(index<0){
            return 0;
        }
        int choose=arr[index]+HouseRobberTopDown2(arr,index-2,dp);
        int notchoose =HouseRobberTopDown2(arr, index-1,dp);
        return dp[index] = Math.max(choose, notchoose);
    }

    public static int HouseRobberBottomUp(int[] arr, int[] dp){
        dp[0] = arr[0];
        dp[1]= Math.max(arr[0], arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i]= Math.max(dp[i-1], arr[i]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}
