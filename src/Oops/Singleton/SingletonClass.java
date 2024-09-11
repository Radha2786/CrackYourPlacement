package Oops.Singleton;

public class SingletonClass {

    static int instance;

    private SingletonClass(){
        instance = 10;
    }
    public int getInstance(){
        if(instance==0){  // mtlb ek bhi instance create nahi hua hai (hence created instance only for 1st time)
            new SingletonClass();
        }
        return instance;
    }
}
