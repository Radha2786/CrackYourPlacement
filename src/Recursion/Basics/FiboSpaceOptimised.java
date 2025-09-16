package Recursion.Basics;

public class FiboSpaceOptimised {
    public static void main(String[] args){
        int prev=1;
        int prev2=0;
        int curr=0;
        int n = 7;
        for(int i=2;i<=n;i++){
             curr = prev+prev2;
            prev2=prev;
            prev=curr;
        }
        System.out.println(curr);
    }
}
