package creational.singleton.reflectionAttack.solution.hungrySingleton;


public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    // Key point of here. there is a possibility that set this HungrySingleton class constructor
    // to be public (accessible) through reflection
    private HungrySingleton() {
        // This solution can be used in InnerClass solution to prevent reflection attack as well
        // This solution is workable for hungry singleton and static inner class
        // but it's not 100 % work in the lazySingleton implementation. It is determined by
        // the order of creating instance by reflection or not.
        if (hungrySingleton != null) {
            throw new RuntimeException("Forbidden call singleton constructor through reflection");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // will solve the serialization and deserialization issue
    private Object readResolve() {
        return hungrySingleton;
    }
}
