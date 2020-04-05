package creational.singleton.hungrySingleton;

public class HungrySingleton {
    // this final key word will prevent re-assign value to this variable
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
