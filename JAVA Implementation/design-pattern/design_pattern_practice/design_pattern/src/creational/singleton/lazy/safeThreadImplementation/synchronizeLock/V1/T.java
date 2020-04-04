package creational.singleton.lazy.safeThreadImplementation.synchronizeLock.V1;

public class T implements Runnable {

    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + lazySingleton);
    }
}
