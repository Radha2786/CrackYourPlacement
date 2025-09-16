package dp;
import java.util.*;
public class LIS {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,2,3};
        int answer = LongestIncreasingSubsequence(arr);
        System.out.println(answer);
    }
    public static int LongestIncreasingSubsequence(int[] arr){
        int[] ans = new int[arr.length];
        Arrays.fill(ans,1);
        for(int i=0;i<ans.length;i++){
          for(int j=i-1;j>=0;j--){
              if(arr[i]>=arr[j]){
                  ans[i]= Math.max(ans[i],ans[j]+1);
              }
          }
        }
        int max =0;
        for(int i=0;i<ans.length;i++){
            max = Math.max(max, ans[i]);
        }
        return max;
    }
}
