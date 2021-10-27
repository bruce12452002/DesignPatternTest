package singleton;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

public class TestSingleton {
    public static void main(String[] args) {
//        var instance1a = Singleton1.getInstance();
//        var instance1b = Singleton1.getInstance();
//        instance1a.setXxx("xxx");
//        System.out.println(instance1a.getXxx());
//        System.out.println(instance1b.getXxx());
//
//        var instance2a = Singleton2.getInstance();
//        var instance2b = Singleton2.getInstance();
//
//        var instance3a = Singleton3.getInstance();
//        var instance3b = Singleton3.getInstance();
//
//        var instance4a = Singleton4.getInstance();
//        var instance4b = Singleton4.getInstance();
//
//        var instance5a = Singleton5.getInstance();
//        var instance5b = Singleton5.getInstance();
//
//        var instance6a = Singleton6.INSTANCE;
//        var instance6b = Singleton6.INSTANCE;
//
//        System.out.println(instance1a == instance1b);
//        System.out.println(instance2a == instance2b);
//        System.out.println(instance3a == instance3b);
//        System.out.println(instance4a == instance4b);
//        System.out.println(instance5a == instance5b);
//        System.out.println(instance6a == instance6b);


        Set<Singleton1> set = new CopyOnWriteArraySet<>();
        final int threadNum = 5000;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 1; i <= threadNum; i++) {
            new Thread(() -> {
                set.add(Singleton1.getInstance());
                countDownLatch.countDown();
            }).start();
        }

        try {
            countDownLatch.await();
            System.out.println(set.size());
        } catch (InterruptedException e) {

        }
    }
}
