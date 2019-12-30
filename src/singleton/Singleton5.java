package singleton;

public class Singleton5 { // 內部類別
    private static class InnerSingleton5 {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return InnerSingleton5.INSTANCE;
    }
}
