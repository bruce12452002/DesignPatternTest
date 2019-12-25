package observer.jdk9later;

public interface MyObserver { // 觀察者
    void callMe(String msg);

    String getName();
}
