package observer.without_jdk;

public class TestObserver {
    public static void main(String[] args) {
        Observer a = o -> System.out.println("a 觀察者接收" + o);
        Observer b = o -> System.out.println("b 觀察者接收" + o);

        Subject subject = new Subject();
        subject.addObserver(a);
        subject.addObserver(b);
        subject.notifyObserver("xxx");
        System.out.println("============");
        subject.removeObserver(a);
        subject.notifyObserver("ooo");
    }
}
