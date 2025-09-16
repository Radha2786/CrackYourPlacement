package Recursion.Basics;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str,"");
    }

    public static void printSubsequence(String str, String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //choose
        printSubsequence(str.substring(1),ans+str.charAt(0));
        //not-choose
        printSubsequence(str.substring(1),ans);

    }
}
