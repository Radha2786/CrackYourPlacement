package Recursion.Basics;
import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args){
        int n = 2;
       int ans= ClimbStairs(n,0);
       System.out.println(ans);
    }
    public static int ClimbStairs(int target, int i){
        if(i==target){
            return 1;
        }
        if(i>target){
            return 0;
        }
        // choose 1
        int choose=ClimbStairs(target, i+1);
        //choose 2
        int notchoose=ClimbStairs(target, i+2);
        return choose+notchoose;
    }
}
