package Module6.Threads.Homework6;

public class Producer extends Thread{
    Queue queue;

    Producer(Queue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        super.run();
        while(queue.getCounter() < 10000){
        try {
            queue.addNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}

    }
}
