package threadsTest;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Operations2 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(1);
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            Account acc1 = new Account(1000, "a");
            Account acc2 = new Account(2000, "b");
            service.submit(
                    new Transfer(i, acc1, acc2, rnd.nextInt(400), latch));
        }
       // latch.countDown();
        service.shutdown();
        service.awaitTermination(1, TimeUnit.SECONDS);

    }
}
