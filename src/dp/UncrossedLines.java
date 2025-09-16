package dp;
import java.util.*;
public class UncrossedLines {
    public static void main(String[] args){
        int[] nums1 = {1,4,2};
        int[] nums2 = {1,2,4};
        int[][] dp = new int[nums1.length][nums2.length];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        int ans= LCS( nums1, nums2, 0, 0,dp);
        System.out.println(ans);
    }

    public static int LCS(int[] nums1, int[] nums2, int i, int j,int[][] dp){
        // base case
        if(i== nums1.length || j== nums2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(nums1[i]==nums2[j]){
            ans= 1 + LCS(nums1, nums2, i+1,j+1,dp);
        }else{
            int c1 = LCS(nums1, nums2, i+1,j,dp);
            int c2 = LCS(nums1, nums2, i,j+1,dp);
            ans= Math.max(c1,c2);
            dp[i][j]=ans;
        }
        return ans;
    }
}
