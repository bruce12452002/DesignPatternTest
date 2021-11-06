package observer.jdk9_after;

import java.util.Map;
import java.util.concurrent.Flow;

/**
 * 訂閱者
 */
public class Receiver implements Flow.Subscriber<Map<String, Object>> {
    private Flow.Subscription subscription;
    private int req;

    Receiver(int req) {
        this.req = req;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(req);
    }

    @Override
    public void onNext(Map<String, Object> item) {
        subscription.request(req);
        System.out.println("data=" + item + ", req=" + req);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("onComplete req=" + req);
    }
}
