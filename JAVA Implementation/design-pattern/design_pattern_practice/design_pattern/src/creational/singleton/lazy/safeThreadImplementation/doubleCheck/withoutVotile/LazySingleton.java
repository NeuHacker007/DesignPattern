package creational.singleton.lazy.safeThreadImplementation.doubleCheck.withoutVotile;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        /**
         * line 14 & line 16 & line 17
         *
         * will have the problem of instruction re-order
         */
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                    //1. allocate the memory to the object
                    //2. initialize the object
                    //3. set LazySingleton to point to the memory allocated in step1
                    // However, the step 3, 2 might be called reversely due to the
                    //   instruction reorder
                }
            }
        }

        return lazySingleton;
    }
}
