package POTD;

public class TheSmallestProductofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,5};
        int[] nums2 = {3,4};
        int k = 2;
        long ans= kthSmallestProduct(nums1,  nums2,  k);
        System.out.println(ans);

    }
    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long max = Long.MAX_VALUE;
        long count = 0;
        long ans=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0; j<nums2.length;j++){
                long product = nums1[i]*nums2[j];
                if(product<max){
                    max = product;
                    count++;
                    if(count==k){
                        ans = product;
                    }
                }
            }
        }
        return ans;
    }
}
