package Recursion.Medium.BacktrackingStart;

public class PermutationPractice {
    public static void main(String[] args){
        String str="abc";
        findPermutation(str,0,"");
    }
    public static void findPermutation(String question, int index, String ans){

        // base case
        if(question.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<question.length();i++){
//            ans= ans+ question.charAt(i);
            findPermutation(question.substring(0,i)+question.substring(i+1), index, ans+question.charAt(i));

        }

    }
}
