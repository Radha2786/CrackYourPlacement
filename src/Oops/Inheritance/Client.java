package Oops.Inheritance;

public class Client  {
    public static void main(String[] args) {
        Parent ob = new Child();
        System.out.println(((Child)ob).p1);
    }
}
