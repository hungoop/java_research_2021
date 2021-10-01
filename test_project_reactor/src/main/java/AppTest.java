import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import st.test.pr.Consumer;

import java.util.concurrent.TimeUnit;

public class AppTest {

    public static void main(String[] args) throws InterruptedException {

        /*
        Flux<String> flux = Flux.just("Khanh", "Quan", "Thanh");
        flux.subscribe(new Consumer());

        TimeUnit.SECONDS.sleep(10);

         */

        Mono<String> mono = Mono.just("steven");
        mono.subscribe(new Consumer());

        TimeUnit.SECONDS.sleep(10);

    }
}
