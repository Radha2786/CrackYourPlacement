package Arrays;
import java.util.*;
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
       int n = 8, m = 5;
       ArrayList<Integer> list = new ArrayList<>();
//        {3, 4, 1, 9, 56, 7, 9, 12}
       list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(56);
        list.add(7);
        list.add(9);
        list.add(12);
        System.out.println(findMinDiff (list,  n, m));
    }
    public static long findMinDiff (ArrayList<Integer> list, int n, int m)
    {
        // your code here
        Collections.sort(list);
        long res = Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int min = list.get(i);
            int max = list.get(i+m-1);
            res=Math.min((max-min), res);
        }
        return res;
    }
}
