package observer.without_jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * 被觀察者
 * 被觀察者 1-多 觀察者
 * 也叫發佈 1-多 訂閱模式
 */
public class Subject {
    private final List<Observer> OBSERVERS = new ArrayList<>();

    public void addObserver(Observer observer) {
        OBSERVERS.add(observer);
    }

    public void removeObserver(Observer observer) {
        OBSERVERS.remove(observer);
    }

    public void notifyObserver(Object o) {
        OBSERVERS.forEach(observer -> observer.update(o));
    }
}
