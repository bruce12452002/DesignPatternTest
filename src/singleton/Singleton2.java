package singleton;

public class Singleton2 { // 懶漢式, thread-safe
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
            // return new Singleton1(); // 因為有可能一開始就進來很多執行緒，直接回傳不是 static
        }
        return instance;
    }
}
