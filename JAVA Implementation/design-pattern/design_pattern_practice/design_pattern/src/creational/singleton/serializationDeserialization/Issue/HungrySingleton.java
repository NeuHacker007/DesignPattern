package creational.singleton.serializationDeserialization.Issue;

import java.io.Serializable;
// Here we need to implement Serializable to make sure this object can be serialize
// in the Test main method. Otherwise, it will generate an exception.
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
