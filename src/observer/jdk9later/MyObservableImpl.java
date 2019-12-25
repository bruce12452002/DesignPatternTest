package observer.jdk9later;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MyObservableImpl implements MyObservable {
    private String name;
    private String msg;
    private ConcurrentMap<String, MyObserver> observers = new ConcurrentHashMap<>();

    public MyObservableImpl(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(MyObserver observer) {
        this.observers.putIfAbsent(observer.getName(), observer);
    }

    @Override
    public void delObserver(MyObserver observer) {
        this.observers.keySet().removeIf(k -> k.equals(observer.getName()));
    }

    @Override
    public void notifyObserver() {
    }
}
