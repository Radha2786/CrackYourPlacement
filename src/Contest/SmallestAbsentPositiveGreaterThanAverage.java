package Contest;
import java.util.*;
public class SmallestAbsentPositiveGreaterThanAverage {
    public static void main(String[] args){
        int[]  nums = {4,-1};
        int ans=smallestAbsent(nums);
        System.out.println(ans);

    }
    public  static int smallestAbsent(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int total=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
            set.add(nums[i]);
        }
        int average = total/n;
        int i=average+1;
        if(average<1){
            i=1;
        }
        boolean flag = true;
        while(flag){
            if(!set.contains(i)){
                flag=false;
                return i;
            }
            i++;
        }
        return i;
    }
}
