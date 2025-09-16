package dp.Part2.DpOnGrids;
import java.util.*;

public class MinimumPathSum {
    public static void main(String[] args){
       int[][] grid = {{1,2,3},{4,5,6}};
       int[][] dp = new int[grid.length][grid[0].length];
       for(int[] arr: dp){
           Arrays.fill(arr,-1);
       }
       int ans= PathSum(grid,0,0, dp);
       System.out.println(ans);
    }
    public static int PathSum(int[][] grid,int row, int col, int[][] dp){
        int n = grid.length;
        int m = grid[0].length;
        if(row==n-1 && col==m-1){
            return grid[row][col];
        }
        if(row>=n){
            return Integer.MAX_VALUE;
        }
        if(col>=m){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int right=0;
        int down=0;
        right =  PathSum(grid,row,col+1,dp);
        down = PathSum(grid,row+1,col,dp);
        return dp[row][col]= grid[row][col] + Math.min(right,down);
    }
}
