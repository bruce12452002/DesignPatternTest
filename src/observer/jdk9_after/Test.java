package observer.jdk9_after;

import java.util.Map;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Receiver a = new Receiver(3);
        Receiver b = new Receiver(5);

        Sender sender = new Sender();
        sender.subscribe(a);
        sender.subscribe(b);

        Stream.iterate(0, i -> ++i).limit(10).forEach(
                i -> sender.send(Map.of(i + "", "this is " + i))
        );
    }
}
