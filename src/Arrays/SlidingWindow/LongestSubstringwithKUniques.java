package Arrays.SlidingWindow;
import java.util.*;

public class LongestSubstringwithKUniques {
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k = 3;
        int ans = longestkSubstr(s,k);
        System.out.println(ans);
    }
    public static int longestkSubstr(String s, int k) {
        // code here
        int MaxSize=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),j);

                if(map.size()==k){
                    MaxSize = Math.max(MaxSize,j-i+1);
                }else if(map.size()>k){
                    break;
                }
            }
        }
        return MaxSize==0? -1 : MaxSize;
    }
}
