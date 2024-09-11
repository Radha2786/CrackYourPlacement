package Oops;

public class Static_Block_Client {

    static {
        System.out.println("inside static block");
    }
    public static void main(String[] args) {
        System.out.println("inside main function");

        Static_Block b = new Static_Block(10);

        System.out.println(b.fun());
    }



}
