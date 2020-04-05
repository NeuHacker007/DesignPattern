package creational.singleton.reflectionAttack.issue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test  {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objClass = HungrySingleton.class;
        Constructor constructor = objClass.getDeclaredConstructor();
        // if we don't open the class' constructor to public
        // then due to the private key word, an exception will be
        // throw out. But if we use reflection to set the singleton class
        // constructor to be accessible then, it will give us two instantiated
        // object as current running result
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }
}
