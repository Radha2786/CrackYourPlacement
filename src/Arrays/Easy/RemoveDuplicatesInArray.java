package Arrays.Easy;
import java.util.*;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {4,7,6,4,10,10,9,3,7,7,5};
        removeDuplicate(arr);

    }
    public static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        for(int ele: arr){
            if(set.contains(ele)){
                continue;
            }
            set.add(ele);
        }
        System.out.println(set);

        return new ArrayList<>(set);
    }
}
