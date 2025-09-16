package Recursion.Advance;
import java.util.*;
public class ExpressionAddOperators {
    public static void main(String[] args){
        String num = "123";
        int target = 6;
        List<String> list = new ArrayList<>();
        String str= "";
        addOperators(num, target, list,0, str);
        System.out.println(list);
    }
    public static List<String> addOperators(String num, int target,List<String> list,int ans, String str) {
        // base case
        if(num.length()==0){
            if(ans==target){
                list.add(str);
            }
            return list;
        }

        addOperators(num.substring(1), target,list,ans=ans+(num.charAt(0)-'0'),str=str+num.charAt(0)+'+');
        addOperators(num.substring(1), target,list,ans=ans-(num.charAt(0)-'0'),str=str+num.charAt(0)+'-');

        addOperators(num.substring(1), target,list,ans=ans*(num.charAt(0)-'0'),str=str+num.charAt(0)+'*');
        return list;
    }
}
