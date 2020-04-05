package creational.singleton.hungrySingleton;

import creational.singleton.lazy.safeThreadImplementation.doubleCheck.votile.LazySingleton;

public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + lazySingleton);
    }
}
