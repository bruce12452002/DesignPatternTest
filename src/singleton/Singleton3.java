package singleton;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class Singleton3 { // 餓漢式, thread-safe
    private final byte[] b = new byte[1024]; // 餓漢式 的缺點就是一 new 就會包括這個空間，造成空間浪費
    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
        synchronized (Singleton4.class) {
            if (INSTANCE != null) {
                throw new RuntimeException("don't user reflection!");
            }
        }
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }

    // 餓漢式可防止反射的 new
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
//        Singleton3 instance1 = Singleton3.getInstance();
//        Singleton3 instance2 = Singleton3.getInstance();
//        System.out.println(instance1);
//        System.out.println(instance2);
//
//        Constructor<Singleton3> declaredConstructor = Singleton3.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        Singleton3 instance = declaredConstructor.newInstance();
//        System.out.println(instance);

        Stream.iterate(0, i -> ++i).limit(10).forEach(i ->
                new Thread(() -> System.out.println(Singleton3.getInstance())).start()
        );
    }
}
