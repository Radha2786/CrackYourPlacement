package Arrays.Easy;
import java.util.*;

public class EvenGreaterthanOdd {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(1);
//        arr.add(5);

        rearrangeArray(arr);
    }
    public static ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
        // code here
        for(int i=1;i<arr.size();i++){
            if(((i+1)%2)==0){
                if(arr.get(i)<arr.get(i-1)){
                    Swap(i,i-1,arr);
                }
            }else{
                if(arr.get(i)>arr.get(i-1)){
                    Swap(i,i-1,arr);
                }
            }
        }
        System.out.println(arr);
        return arr;
    }
    public static void Swap(int ele1, int ele2, ArrayList<Integer> arr){
        int temp = arr.get(ele1);
        int temp2 = arr.get(ele2);
        arr.set(ele1,temp2);
        // arr.get(ele1) = arr.get(ele2);
        // arr.get(ele2) = temp;
        arr.set(ele2,temp);
    }
}
