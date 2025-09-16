package Recursion.Advance;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalCounting {
    public static void main(String[] args) {
        int  n = 13;
        List<Integer> list = new ArrayList();
        Order(n, 0 ,list);
        System.out.println(list.remove(0));
        System.out.println(list);


    }
    public static void Order(int n, int current, List<Integer> list){
        if(current>n){
            return;
        }

        list.add(current);

        int i = 0 ;
        if(current==0){
            i=1;
        }
        for(;i<=9;i++){
            Order(n, current*10+i, list);
        }
    }
}






