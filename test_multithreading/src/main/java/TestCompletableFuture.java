import st.test.Calculator;
import st.test.Calculator1;

import java.util.concurrent.*;

public class TestCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create thread pool using Executor Framework
        /*
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Create new Calculator object
        Calculator c = new Calculator(2, 3);

        Future<Integer> f = executor.submit(c);

        System.out.println(f.get());

        System.out.println("End...");

        executor.shutdown();*/

        // Create new Calculator object
        Calculator1 c = new Calculator1(2, 3);

        //CompletableFuture<Integer> f = CompletableFuture.supplyAsync(c);

        /*
        f.thenAccept((rs) -> {
            System.out.println(rs);
        });*/

        /*
        f.whenComplete((result, exception) -> {
            System.out.println(result);
            if (exception != null)
                exception.printStackTrace();
        });

        f.orTimeout(1, TimeUnit.SECONDS);
*/

        int a = 2;
        int b = 5;

        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a + " + " + b);
            return a + b;
        }).whenComplete((rs, ex) -> {
            System.out.println(rs);

            if(ex != null){
                ex.printStackTrace();
            }
        }).orTimeout(2, TimeUnit.SECONDS);


        System.out.println("End...");

        Thread.sleep(10000);
    }



}
