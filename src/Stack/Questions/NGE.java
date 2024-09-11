package Stack.Questions;
import java.util.*;
public class NGE {
    public static void main(String[] args) {
//        int[] nums1 = {1,3,5,2,4};
//        int[] nums2 = {6,5,4,3,2,1,7};
//        int[] ans=nextGreaterElement(nums1,nums2);
//        System.out.println(Arrays.toString(ans));
//    }

//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int n = nums2.length;
//        int[] NGE = new int[n];
//        // firstly find the NGE for nums2 by looking from right side
//        Stack<Integer> st = new Stack<>();
//        st.push(-1);
//        Arrays.fill(NGE,-1);
//        for(int i= n-1 ; i>=0 ; i--){
//            if(!st.isEmpty() && st.peek()<nums2[i]){
//                while(!st.isEmpty()){
//                    if(st.peek()>nums2[i]){
//                        NGE[i]=st.peek();
//                        break;
//                    }
//                    st.pop();
//                }
//            }else if(!st.isEmpty()){
//                NGE[i] = st.peek();
//            }
//
//            st.push(nums2[i]);
//        }
//        System.out.println(Arrays.toString(NGE));
//
//        int[] ans = new int[nums1.length];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(nums2[i],i);
//        }
//        for(int i=0;i<nums1.length;i++){
//            if(map.containsKey(nums1[i])){
//                ans[i]=NGE[map.get(nums1[i])];
//            }
//        }
//        return ans;
//    }

        int[] arr;
//        System.out.println(arr[0]);
    }
}
