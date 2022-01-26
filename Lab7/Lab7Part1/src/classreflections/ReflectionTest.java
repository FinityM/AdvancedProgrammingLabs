package classreflections;

import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public void calledClass(){
        System.out.println("The class you called: " + this.getClass().getName());

    }

    public static void main(String[] args)  {
        try {
            ReflectionTest reflect = (ReflectionTest) Class.forName("classreflections.ReflectionTest").getDeclaredConstructor().newInstance();
            Class theClass = Class.forName("classreflections.ReflectionTest");
            System.out.println("Name of class: " + theClass.getName());
            reflect.calledClass();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
