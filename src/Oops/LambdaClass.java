package Oops;

@FunctionalInterface
interface AnonyDemo2 {
    public void Math1(int data);

}

public class LambdaClass {
    public static void main(String[] args) {
        AnonyDemo2 ob = (data) -> {
            System.out.println("heyaa"+ data);
        };
        ob.Math1(2);
    }
}
