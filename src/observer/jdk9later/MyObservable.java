package observer.jdk9later;

// 參考 https://juejin.im/post/5d04c6a851882572d746f61b
public interface MyObservable { // 被觀察者
    void addObserver(MyObserver observer);

    void delObserver(MyObserver observer);

    void notifyObserver();
}
