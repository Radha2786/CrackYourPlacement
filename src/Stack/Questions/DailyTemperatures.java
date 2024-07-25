package Stack.Questions;
import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = 0;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            if(temp[st.peek()] > temp[i]){
                ans[i]= st.peek() - i;

            }else{
                while(!st.isEmpty()){

                    if(temp[st.peek()] > temp[i]){
                        ans[i]= st.peek() - i;
                        break;
                    }
                    st.pop();
                }
            }
            st.push(i);
        }

        return ans;

    }
}
