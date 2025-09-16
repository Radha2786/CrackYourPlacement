package Recursion.Basics;

public class CoinToss {
    public static void main(String[] args) {
        TossCoin(3,"");
    }
    public static void TossCoin(int coin, String ans){
        if(coin==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) !='H'){
            TossCoin(coin-1, ans+"H");
        }

        TossCoin(coin-1, ans+"T");
    }
}
