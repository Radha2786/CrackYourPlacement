package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Apple{
    private void repair(){
        System.out.println("repairing");
    }
}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Class c = Class.forName("ReflectionApi.Product");

//        System.out.println(c.getConstructors().length);

//        Constructor constructors[] = c.getConstructors();

//        for (Constructor constructor: constructors){
//            System.out.println(constructor.getName());
//            System.out.println(constructor.getModifiers());
//            System.out.println(constructor);
//        }

//        Field fields[]= c.getFields();        // getFields will give all the public fields
        /* so in case u want to get the private fields we have to use getDeclaredFields */

        /*

        Field fields[]= c.getDeclaredFields();

        for(Field field: fields){
            System.out.println(field.getName());
        }

        */


        // For getting Methods

        /*

        Method methods[] =  c.getMethods();

        for(Method method: methods){
            System.out.println(method.getName());
        }


         */

        /* what if we want to call a method which is private using reflection api
        * in order to understand that we have declared a class Apple which is private and we want to invoke repair method of it
        *
        * */

        Class c = Class.forName("ReflectionApi.Apple");
        Apple apple = (Apple) c.newInstance();
        Apple apple1 = (Apple) c.newInstance();

        Method m = c.getDeclaredMethod("repair", null);
        m.setAccessible(true);
        m.invoke(apple);

    }
}
