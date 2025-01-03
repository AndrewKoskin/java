package Module6.FinalTask;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.Callable;

public class EventMapHandler implements Callable<Integer> {
    Map.Entry<String, Event> entry;
    byte mode;

    EventMapHandler(Map.Entry<String, Event> entry, byte mode) {
        this.entry = entry;
        this.mode = mode;
    }

    synchronized void isActiveChanger() throws InterruptedException {
        if (entry.getValue().date.isAfter(LocalDateTime.now())) {
            System.out.println("EventMapHandler: Waiting for isActive in event " + entry.getValue().name);
            Thread.sleep(Duration.between(LocalDateTime.now(), entry.getValue().date).toMillis());
        }
        System.out.println("EventMapHandler: Event " + entry.getValue().name + " is active now");
        entry.getValue().isActive= true;
    }

    void firstModeHandler() throws InterruptedException {
        System.out.println("EventMapHandler: firstModeHandler");
        while (Duration.between(LocalDateTime.now(), entry.getValue().date).toHours() >= 1) {
            Thread.sleep(1000);
        }
        System.out.println(Thread.currentThread().getName() + " Event " + entry.getValue().name + " will start in " + Duration.between(LocalDateTime.now(), entry.getValue().date).toMinutes() + " minutes.");
    }

    void secondModeHandler() throws InterruptedException {
        System.out.println("EventMapHandler: secondModeHandler");
        while (!entry.getValue().isActive) {
            System.out.println("EventMapHandler: Waiting to event " + entry.getValue().name + " to be active");
            isActiveChanger();
        }
        System.out.println("EventMapHandler: Event " + Thread.currentThread().getName() + " started.");
    }

    void thirdModeHandler() throws InterruptedException {
        while (!entry.getValue().isActive) {
            System.out.println("EventMapHandler: Waiting to event " + entry.getValue().name + " to be active");
            isActiveChanger();
        }
        while (true) {
            System.out.println("EventMapHandler: Event " + Thread.currentThread().getName() + " started.");
            Thread.sleep(10000);
        }

    }

    void eventHandler() throws InterruptedException {
        switch (mode) {
            case 1:
                firstModeHandler();
            case 2:
                secondModeHandler();
            case 3:
                thirdModeHandler();
        }
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("EventMapHandler: Thread " + Thread.currentThread().getName() + " started.");
        eventHandler();
        return 0;
    }
}
