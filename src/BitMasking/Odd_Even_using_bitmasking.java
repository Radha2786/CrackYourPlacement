package BitMasking;

public class Odd_Even_using_bitmasking {
    public static void main(String[] args) {
        int n = 2;
        if((n & 1) == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
