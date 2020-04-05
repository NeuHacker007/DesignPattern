package creational.singleton.hungrySingleton;

public class Test {

    public static void main(String[] args) {
        HungrySingleton lazySingleton = HungrySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

        System.out.println("Program End");
    }
}
