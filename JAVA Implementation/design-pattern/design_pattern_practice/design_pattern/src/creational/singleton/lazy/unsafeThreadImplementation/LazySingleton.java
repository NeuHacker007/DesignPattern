package creational.singleton.lazy.unsafeThreadImplementation;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    // private to prevent instantiate from external
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        // Not Thread Safe 
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}