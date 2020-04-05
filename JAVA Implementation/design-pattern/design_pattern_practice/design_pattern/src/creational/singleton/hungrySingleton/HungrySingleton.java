package creational.singleton.hungrySingleton;

public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {

    }

    private static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
