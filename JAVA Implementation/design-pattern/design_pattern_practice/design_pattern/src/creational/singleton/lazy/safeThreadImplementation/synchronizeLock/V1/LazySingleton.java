package creational.singleton.lazy.safeThreadImplementation.synchronizeLock.V1;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    // add the synchronized key word to a static method in the class
    // it locks the entire class file.
    // if no static here, it locks the object in the heap
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

