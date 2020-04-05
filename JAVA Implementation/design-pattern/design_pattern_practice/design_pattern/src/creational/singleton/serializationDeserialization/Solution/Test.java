package creational.singleton.serializationDeserialization.Solution;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));

        oos.writeObject(hungrySingleton);

        File file = new File("singleton_file");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(hungrySingleton);
        System.out.println(newInstance);
        System.out.println(hungrySingleton == newInstance);

    }
}
