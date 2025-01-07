package Recursion.Basics;

import javax.print.attribute.standard.PrinterName;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
//       int ans= Power(2,5);
//        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintName(1,n);
    }
//    public static int Power(int a, int b){
//        if(b==0){
//            return 1;
//        }
//        return a * Power(a,b-1);
//
//    }
//    3 --> 2 --> 1

//    Printing in reverse order  (5-->4-->3-->2-->1)
    public static void PrintName(int i,int n){

        if(i>n){
            return ;
        }

        PrintName(i+1,n);
        System.out.println(i);
    }
}
