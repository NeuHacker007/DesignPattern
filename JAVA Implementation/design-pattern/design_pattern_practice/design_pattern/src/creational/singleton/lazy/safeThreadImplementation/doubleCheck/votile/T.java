package creational.singleton.lazy.safeThreadImplementation.doubleCheck.votile;

public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + lazySingleton);
    }
}
