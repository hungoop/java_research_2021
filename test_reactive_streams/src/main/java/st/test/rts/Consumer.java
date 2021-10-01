package st.test.rts;

import java.util.concurrent.Flow;

public class Consumer implements Flow.Subscriber {
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Consumer: onSubscribe");
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("Consumer: onNext " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Consumer: onError");
    }

    @Override
    public void onComplete() {
        System.out.println("Consumer: onComplete");


    }
}
