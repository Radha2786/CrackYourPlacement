package Oops;
// Encapsulation

public class Person {
    private String name="Radha";
    private int age = 21;
    // non-parametrized constructor
    public Person(){
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void fun(){
        int age=20;
        System.out.println(this.name);
        System.out.println(this.age); // this will print class's variable
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

