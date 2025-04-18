package Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Optimised approach (reduced space of extra array)
        int n = nums1.length + nums2.length;
        int index2 = n/2;
        int index1 = n/2 - 1;
        int p1 = 0, p2=0, count =0;
        int ele1 = -1, ele2 =-1;
        System.out.println("index1 "+index1);
        System.out.println("index2 "+index2);
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<nums2[p2]){
                if(count == index1){
                    ele1 = nums1[p1];
                }
                if(count == index2){
                    ele2 = nums1[p1];
                }
                p1++;
                count++;
            }else{
                if(count == index1){
                    ele1 = nums2[p2];
                }
                if(count == index2){
                    ele2 = nums2[p2];
                }
                p2++;
                count++;
            }
        }
        while(p1<nums1.length){
            if(count == index1){
                ele1 = nums1[p1];
            }
            if(count == index2){
                ele2 = nums1[p1];
            }
            p1++;
            count++;
        }
        while(p2<nums2.length){
            if(count == index1){
                ele1 = nums2[p2];
            }
            if(count == index2){
                ele2 = nums2[p2];
            }
            p2++;
            count++;
        }
        System.out.println("ele1 "+ele1);
        System.out.println("ele2 "+ele2);

        if(n%2 == 0){
            return (double)((double)(ele1+ele2))/2;
        }
        return ele2;

    }
}
