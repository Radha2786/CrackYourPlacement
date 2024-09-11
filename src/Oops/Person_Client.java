package Oops;
// Encapsulation

public class Person_Client {
    public static void main(String[] args) {
        Person p = new Person("Radhika",21);
//        p.name="ullu";
//        p.age=22;
        p.fun();
        p.setAge(28);
        System.out.println(p.getAge());
    }
}
