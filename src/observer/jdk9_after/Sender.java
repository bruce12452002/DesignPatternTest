package observer.jdk9_after;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * 發佈者
 */
public class Sender implements Flow.Publisher<Object> {
    private SubmissionPublisher<Object> publisher;

    Sender() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        publisher = new SubmissionPublisher<>(executorService, Flow.defaultBufferSize());
    }

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        publisher.subscribe(subscriber);
    }

    public void send(Map<String, Object> map) {
        System.out.println("send=" + map);
        publisher.submit(map);
    }
}
