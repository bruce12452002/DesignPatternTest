package observer.jdk9_before;

import java.util.Observable;
import java.util.Observer;

/**
 * JDK 的觀察者有考慮多執行緒的情況
 */
public class MyObserver implements Observer /*觀察者， JDK9 已廢棄*/ {
    @Override
    public void update(Observable o, Object arg) {
        try {
            if (o instanceof User) {
                User u = (User) o;
                System.out.println(u.getId() + ":" + u.getName() + ":" + arg);
            }
        } catch (Exception e) {
            System.err.println("我錯了");
        }
    }
}
