package creational.singleton.lazy.safeThreadImplementation.synchronizeLock.V2;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    // this way directly lock the class
    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}

