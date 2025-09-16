package Recursion.Basics;

public class Dice {
    public static void main(String[] args) {
        int target = 3;
        int current = 0;
        String ans = "";
        System.out.println("count is  "+  DiceChangeCount(target, current, ans));
        // the dice will have 3 faces only
//        so the possibilities are 1 can come, 2 can come , 3 can come
        // for 6 faces = add 2 more calls
    }

    public static void DiceChange(int target, int current, String ans){
        // base cases
        if(current == target){
            System.out.println(ans);
            return;
        }

        if(current > target){
            return;
        }

//        DiceChange(target, current +1, ans+"1");
//        DiceChange(target, current +2, ans+"2");
//        DiceChange(target, current +3, ans+"3");

        for(int dice =1 ; dice<=3;dice++){
            DiceChange(target, current+ dice, ans+dice);
        }
    }

    public static int DiceChangeCount(int target, int current, String ans){
        // base cases
        if(current == target){
            System.out.println(ans);
            return 1;
        }

        if(current > target){
            return 0;
        }

//        DiceChange(target, current +1, ans+"1");
//        DiceChange(target, current +2, ans+"2");
//        DiceChange(target, current +3, ans+"3");

        int count =0;
        for(int dice =1 ; dice<=3;dice++){
            count += DiceChangeCount(target, current+ dice, ans+dice);
        }
        return count;
    }
}
