package Module6.Threads.Homework6;

public class Consumer extends Thread {
    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        super.run();
        while(queue.getCounter() < 10000){
            try {
                queue.subtractNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
