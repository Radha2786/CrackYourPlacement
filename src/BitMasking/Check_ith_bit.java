package BitMasking;

public class Check_ith_bit {
    public static void main(String[] args) {
        int n = 86;
        int pos = 2;
        checkIsSet(n,pos);
    }
    public static boolean checkIsSet(int n , int pos){
        n = n >> pos;
        // right shift kr diya
        if((n&1)==0){
            return true;
        }else{
            return false;
        }
    }
}
