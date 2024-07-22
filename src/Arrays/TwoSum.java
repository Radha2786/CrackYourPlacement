package Arrays;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length ; i++){
            int ele = target - nums[i];
            if(map.containsKey(ele)){
                return new int[]{map.get(ele),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
