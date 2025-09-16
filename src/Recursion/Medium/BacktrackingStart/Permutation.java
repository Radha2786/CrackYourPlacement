package Recursion.Medium.BacktrackingStart;
import java.util.*;
public class Permutation {
    public static void main(String[] args){
        String str = "abca";
        ArrayList<String> list = new ArrayList<>();
        // Convert string to char array
//        char[] arr = str.toCharArray();

        // Sort the char array
//        Arrays.sort(arr);

        // Convert back to string
//        String sortedStr = new String(arr);
        Permutation(str, "", list);
        System.out.println(list);
    }

//    public static void Permutation(String question, String ans, ArrayList<String> list){
//        // base case
//        if(question.length()==0){
//            list.add(ans);
//            return;
//        }
//
//        for(int i=0;i<question.length();i++){
//            if(i==question.length()-1 || question.charAt(i)!=question.charAt(i+1)){
//                char ch = question.charAt(i);
////            question = question.substring(0,i)+ question.substring(i+1);
//                String leftPart = question.substring(0, i);
//                String rightPart = question.substring(i + 1);
//                String rest = leftPart + rightPart;
//                Permutation(rest, ans+ch, list);
//            }
//
//        }
//    }

    // another way, we can implement through loop(checking for duplicate, then here we don't need to sort the string)
    public static void Permutation(String question, String ans, ArrayList<String> list){
        // base case
        if(question.length()==0){
            list.add(ans);
            return;
        }

        for(int i=0;i<question.length();i++){
                char ch = question.charAt(i);
                boolean flag = true;
                for(int j = i+1 ;j<question.length();j++){
                    if(question.charAt(j)==ch){
                        flag = false;
                        break;
                    }
                }
                if(flag == true) {
                    String leftPart = question.substring(0, i);
                    String rightPart = question.substring(i + 1);
                    String rest = leftPart + rightPart;
                    Permutation(rest, ans + ch, list);
                }


        }
    }
}

