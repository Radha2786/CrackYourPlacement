package Recursion.Basics;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        int n=3;
        Generate(n, 0, 0,ans,"");
        System.out.println(ans);
    }
    public static void Generate(int n, int open, int close, List<String> ans, String str){
        if(open== n && close==n){
//            System.out.println(str);
            ans.add(str);
            return;
        }

        if(open>n || close > n){
            return;
        }

        Generate(n, open+1, close,ans, str+"(");
        if(close<n && open>close ){
            Generate(n, open, close+1, ans,str+ ")");
        }

    }
}



