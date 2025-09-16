package Recursion.Medium.BacktrackingStart;
import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args){
        int n = 3; // no of plates;
        TOH(n, "A","C", "B");
    }
    public static void TOH(int n, String src, String hlp, String des){
        if(n==0){
            return;
        }
        TOH(n-1,src,des,hlp);
        System.out.println("move "+ n + "th disk from "+ src+" " + des);
        TOH(n-1, hlp,src,des);
    }
}
