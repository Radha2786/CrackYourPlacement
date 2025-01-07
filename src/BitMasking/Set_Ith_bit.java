package BitMasking;

public class Set_Ith_bit {
    public static void main(String[] args) {
        int n = 86;
        int pos = 3;
        System.out.println(set(n,pos));
    }

    public static int set(int n, int pos){
        pos = 1 << pos;
        return n | pos;

    }
}
