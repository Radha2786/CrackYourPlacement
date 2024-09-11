package Oops;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer a = 100;  // ye heap m banega (Wrapper class)
        int a1=10;   // ye stack m banega
        Short s1 = 78;
        Byte b= 19;

        a=a1;
        System.out.println(a);
        Integer ii = 90;
        int i = 9;
        i=ii;
        System.out.println(i);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int ele: list){
            System.out.println(ele);
        }
    }
}
