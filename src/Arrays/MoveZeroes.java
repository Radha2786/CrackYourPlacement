package Arrays;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] nums) {
        int p1=0, p2=1;
        while(p2<nums.length){
            if(nums[p2]!=0 && nums[p1]==0){
                //swap
                int temp = nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
                p1++;
                p2++;
            }else if(nums[p1]!=0){
                p1++;
                p2++;
            }
            else{
                p2++;
            }
        }
    }
}
