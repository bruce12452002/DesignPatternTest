package decorator;

public interface Car {
    void show();

    default void run() {
        System.out.println("我跑");
    }
}
