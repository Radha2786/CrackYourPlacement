package Stack.Questions;
import java.util.*;

public class CheckifaParenthesesStringCanBeValid {
    public static void main(String[] args) {
        String s = ")(";
        String  locked = "00";

        System.out.println( canBeValid(s,locked));
    }
    public static boolean canBeValid(String s, String locked) {
        if(s.length()==1){
            return false;
        }

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int value = digit(ch);
            if(value > 0){
                if(locked.charAt(i)=='0'){
                    if(!st.isEmpty()){
                        int top = st.pop();
                        value = -1;
                        if(top + value == 0){
                            continue;
                        } else{
                            st.push(-1);
                        }
                    }
                }else{
                    st.push(value);
                }

            }else{
                if(locked.charAt(i)=='1'){

                    if(st.isEmpty()){
                        return false;
                    }

                    int top = st.pop();
                    if(top + value != 0){
                        return false;
                    }

                }else{
                    if(!st.isEmpty()){
                        int top = st.pop();
                        if(top + value == 0){
                            continue;
                        } else{
                            st.push(1);
                        }
                    }

                    st.push(1);
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else if(st.size()==2){
            return  st.pop() + st.pop() ==0 ;
        }
        return false ;

    }

    public static int digit(char ch){
        if(ch == '('){
            return 1;
        }else{
            return -1;
        }
    }
}
