package Recursion.Basics;

public class Print {
        public static void main(String[] args) {
            int n = 5;
//            System.out.print("0" + "1");
            System.out.print(febo(5));
        }
//        1

        public static int febo(int n){
            if(n==1){
                System.out.print("1");
                return 1;
            }else if(n==0){
                return 0;
            }
            return febo(n-1)+febo(n-2);
        }
    }

