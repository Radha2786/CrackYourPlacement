package Arrays.Algorithm;
import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i] = arr[i] + ans[i-1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
