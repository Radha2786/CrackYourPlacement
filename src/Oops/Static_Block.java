package Oops;

public class Static_Block {

    static {
        System.out.println("inside static block of Static_Block class");
    }

    int a=20;
    Static_Block(int val){
        this.a=val;
    }

    public int fun(){
        return a;
    }
}
