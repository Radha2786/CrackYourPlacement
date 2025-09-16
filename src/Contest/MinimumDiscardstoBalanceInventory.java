package Contest;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumDiscardstoBalanceInventory {
    public static void main(String[] args){
        int[] arrivals = {1,2,1,3,1};
        int w = 4, m = 2;
       int ans= minArrivalsToDiscard(arrivals, w,  m);
        System.out.println(ans);
    }
    public static int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int discard=0;
        for(int i=0;i<w;i++){
            int val = map.getOrDefault(arrivals[i], 0);
            if(val>m){
               discard++;
               continue;
            }else {
                //insert
                map.put(arrivals[i], map.getOrDefault(arrivals[i], 0) + 1);
            }
            list.add(arrivals[i]);
        }

        for(int i=w;i<arrivals.length;i++){
            if(list.size()>w){
                int count = map.get(list.get(0));
                map.put(list.get(0), count - 1);
                list.remove(list.get(0));
            }
            map.put(arrivals[i], map.getOrDefault(arrivals[i], 0) + 1);
            if(map.get(arrivals[i])>m){
                // don't add in list
                // remove 1 value from hashmap
                int count = map.get(arrivals[i]);
                map.put(arrivals[i], count - 1);
                discard++;
            }else{
                list.add(arrivals[i]);
            }
        }
        return discard;

    }
}
