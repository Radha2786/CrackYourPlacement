package dp;
import java.util.*;
public class EditDistance {
    public static void main(String[] args){
        String word1 = "Food";
        String word2 = "Money";
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
//       int ans= Edit_Distance(word1, word2,0, 0, dp);

        int ans=EditDistanceBU(word1, word2);
        System.out.println(ans);
    }
    public static int Edit_Distance(String s1, String s2, int i, int j, int[][] dp){
        // 3 choices
        // base case
        if(i==s1.length() && j==s2.length()){
            return 0;
        }
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans = Edit_Distance(s1, s2, i+1, j+1,dp);
        }else{
            int delete = Edit_Distance(s1, s2, i+1, j,dp);
            int insert = Edit_Distance(s1, s2, i, j+1,dp);
            int replace = Edit_Distance(s1, s2, i+1, j+1,dp);
            ans = 1+ Math.min(delete,Math.min(insert,replace));
        }
        return dp[i][j]= ans;
    }

    public static int EditDistanceBU(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        // filled base cases
        // filling column first
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
//        filling row first
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=j;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dp[s1.length()][s2.length()];
    }
}
