package singleton;

public class Singleton1 { // 懶漢式, non-thread-safe
    private static Singleton1 instance;
    private String xxx;
    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public String getXxx() {
        return xxx;
    }

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }
}
