package singleton;

public class Singleton3 { // 餓漢式, thread-safe
    private byte[] b = new byte[1024]; // 餓漢式 的缺點就是一 new 就會包括這個空間，造成空間浪費
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
