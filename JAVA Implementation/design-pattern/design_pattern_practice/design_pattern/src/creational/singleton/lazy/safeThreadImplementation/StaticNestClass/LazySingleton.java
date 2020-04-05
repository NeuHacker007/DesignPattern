package creational.singleton.lazy.safeThreadImplementation.StaticNestClass;

public class LazySingleton {
    // private constructor is the necessary for all Singleton implementation
    private LazySingleton() {

    }

    // Thread 0                                     1. Allocate the memory for the object
    //           \
    //                Class Initialization lock  -> 2. Make the instance point to the memory allocated in step 1
    //           /            |
    // Thread 1               |                     3. Initialize the object
    //                        |
    //                When JVM set the initialization lock
    //                It will synchronize all threads' initialization
    //                for this class. So, in this solution we don't need
    //                to care the instruction re-order issue.

    /**
     * There are 5 scenario that the class will be immediately initialization
     * 1. There is a instance of this class being created
     * 2. A static method declared in this class is called
     * 3. A static member in this class is assigned a value
     * 4. A static member of this class has been used and at the same time, the member is not a constant
     * 5. When this class is a TOP Level class and it has assertion in it.
     *
     * ** Top Level class is the external class of a nested class
     */
    private static class InnerClass {
        private static LazySingleton lazySingleton = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return InnerClass.lazySingleton;
    }
}
