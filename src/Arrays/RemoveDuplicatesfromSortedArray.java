package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {

            int i=0;
            int count=1;
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    // swap
                    i++;
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]= temp;
                    count++;
                }
            }
            return count;

    }
}
