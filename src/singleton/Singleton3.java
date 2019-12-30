package singleton;

public class Singleton3 { // 餓漢式, thread-safe
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
