package creational.singleton.reflectionAttack.issue;


public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    // Key point of here. there is a possibility that set this HungrySingleton class contructor
    // to be public (accessible) through reflection
    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // will solve the serialization and deserialization issue
    private Object readResolve() {
        return hungrySingleton;
    }
}
