package Module6.FinalTask;

import java.time.LocalDateTime;

public class Event {
    String name;
    LocalDateTime date;
    String description;
    boolean isActive;

    public Event(String name, LocalDateTime date, String description, boolean isActive) throws InterruptedException {
        this.name = name;
        this.date = date;
        this.description = description;
        this.isActive = isActive;
    }

    synchronized void isActiveChanger() throws InterruptedException {
        if (date.isAfter(LocalDateTime.now())){
            System.out.println("Waiting for isActive in event " + name);
            wait();
        }
        isActive = true;
    }

}
