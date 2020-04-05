package creational.singleton.serializationDeserialization.Solution;

import java.io.Serializable;

// Here we need to implement Serializable to make sure this object can be serialize
// in the Test main method. Otherwise, it will generate an exception.
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * This method is not override or inherited. It is called by the ObjectInputStream readObject method through
     * reflect feature of Java
     *
     * During this process, actually there are two instances are created but through readResolve it just choose one.
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }
}
