package Module6.Callable.EventHandler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class EventHandler implements Callable<String> {
    LocalDateTime datetime;

    EventHandler(LocalDateTime dateTime) {
        this.datetime = dateTime;
    }

    @Override
    public String call() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, datetime);
        System.out.println("Event " + Thread.currentThread().getName() + " will be started in " + duration.toSeconds() + " seconds.");
        System.out.println(duration.toMillis());

        Thread.sleep(duration.toMillis());
        return "EventHandler: Event " + Thread.currentThread().getName() + " started.";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();
        List<Future<String>> futures = new ArrayList<>();
        try (ExecutorService executorService = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 10; i++) {
                futures.add(executorService.submit(new EventHandler(LocalDateTime.now().plusSeconds(random.nextInt(10)))));
            }
        }
        while(!futures.getLast().isDone()){
            Thread.sleep(1000);
        }
        System.out.println("Results:");
        for (Future<String> f: futures) {
            System.out.println(f.get());
        }
    }
}
