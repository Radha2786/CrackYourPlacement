package Stack.Questions;
import java.util.*;

public class BackspaceStringCompare {
    public static void main(String[] args) {
       String s = "a##c";
       String t = "#a#c";
       System.out.println(backspaceCompare( s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1= ans(s, st);
        st = new Stack<>();
        Stack<Character> st2= ans(t,st);
        if(st1.size()!=st2.size()){
            return false;
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop() != st2.pop()){
                return false;
            }
        }
        return true;
    }
    public static Stack<Character> ans(String str, Stack<Character> st){
        for(int i=0; i< str.length() ; i++){
            if(str.charAt(i)=='#'){
                if(st.isEmpty()){
                    continue;
                }
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }
        return st;
    }
}
