package Module6.FinalTask;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;

public class FinalTask implements Callable<Integer> {
    byte mode; // режим обработки мероприятий
    Map<String, Event> map;

    FinalTask(Map<String, Event> map, byte mode) {
        Scanner scanner = new Scanner(System.in);
        while (!(mode >= 1 && mode <= 3)) {
            System.out.println("Wrong mode, type new one in range 1,2,3: ");
            mode = scanner.nextByte();
        }
        this.mode = mode;
        this.map = map;
    }


    @Override
    public Integer call() throws Exception {
        System.out.println("FinalTask: Thread " + Thread.currentThread().getName() + " started.");
        ExecutorService pool = Executors.newFixedThreadPool(map.size());
        for (Map.Entry<String, Event> entry : map.entrySet()) {
            pool.submit(new EventMapHandler(entry, mode));
        }
        return 0;
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Future<Integer>> futures = new ArrayList<>();
        Event event1 = new Event("Event1", LocalDateTime.now().plusSeconds(10), "Meow1", false);
        Event event2 = new Event("Event2", LocalDateTime.now().plusMinutes(2), "Meow2", false);
        Event event3 = new Event("Event3", LocalDateTime.now().plusMinutes(3), "Meow3", false);
        Map<String, Event> map = new HashMap<>();
        map.put(event1.name, event1);
        map.put(event2.name, event2);
        map.put(event3.name, event3);
        FinalTask finalTask1 = new FinalTask(map, (byte) 1);
        FinalTask finalTask2 = new FinalTask(map, (byte) 2);
        FinalTask finalTask3 = new FinalTask(map, (byte) 3);
        try (ExecutorService pool = Executors.newFixedThreadPool(3)) {
            futures.add(pool.submit(finalTask1));
            futures.add(pool.submit(finalTask2));
            futures.add(pool.submit(finalTask3));
        }
        synchronized (args) {
            args.wait();
        }

    }
}
