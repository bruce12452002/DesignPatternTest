package observer.without_jdk;

/**
 * 觀察者
 */
@FunctionalInterface
public interface Observer {
    void update(Object o);
}
