package singleton;


import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Singleton1 { // 懶漢式, non-thread-safe
    private static Singleton1 instance;
    private String xxx;

    private Singleton1() {
    }

    public static void main(String[] args) {

        Stream.iterate(0, i -> ++i).limit(50).forEach(s -> {
            new Thread(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                    System.out.println(Singleton1.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        });
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
