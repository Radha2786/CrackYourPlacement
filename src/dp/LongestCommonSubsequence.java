package dp;

public class LongestCommonSubsequence {
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = "abcde";
        int[][] dp = new int[str1.length()][str2.length()];
//        int ans = LCS(str1, str2, 0, 0,dp);
//        System.out.println(ans);
        int ans = LCSBottomUp(str1, str2);
        System.out.println(ans);
    }
    public static int LCS(String str1, String str2, int i, int j, int[][] dp){
        // base case
        if(i==str1.length() || j== str2.length()){
            return 0;
        }
        int ans=0;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(str1.charAt(i)==str2.charAt(j)){
            ans= 1+ LCS(str1, str2, i+1,j+1,dp);
        }else{
            // exploring both choices(1 baar 1 string se kam krke and 2nd baar dusri se)
            int c1 = LCS(str1, str2, i+1,j,dp);
            int c2 = LCS(str1, str2, i,j+1,dp);
            ans = Math.max(c1, c2);
            dp[i][j]= ans;
        }
        return ans;
    }

    public static int LCSBottomUp(String str1, String str2){
        int n = str1.length()+1;
        int m = str2.length()+1;
        // hume blank ka bhi dhyn rkhna hai isliye 1 extra length ka banaya hai
        // 0 par humne blank rkha hai and 1 se start kiya hai
        int[][] dp = new int[n][m];
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1]+1;
                }else{
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1];
    }
}
