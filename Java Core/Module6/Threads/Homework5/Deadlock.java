package Module6.Threads.Homework5;

public class Deadlock extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            this.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deadlock");
    }

    public static void main(String[] args) throws InterruptedException {
        Deadlock deadlock1 = new Deadlock();
        Deadlock deadlock2 = new Deadlock();
        deadlock1.start();
        deadlock2.start();
        deadlock1.join();
        deadlock2.join();
        System.out.println("Main deadlock");
    }
}
