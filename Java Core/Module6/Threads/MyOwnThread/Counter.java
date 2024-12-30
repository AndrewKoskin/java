package Module6.Threads.MyOwnThread;

public class Counter {
    int c = 0;

    void increment() {
        c++;
    }

    void decrement() {
        c--;
    }


    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c, "increment");
        MyThread t2 = new MyThread(c, "decrement");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.c);

    }
}

class MyThread extends Thread {
    Counter counter;
    String duty;
    String name;

    MyThread(Counter counter, String duty) {
        this.counter = counter;
        this.duty = duty;
    }

    @Override
    public void run() {
        this.name = Thread.currentThread().getName();
        super.run();
        if (duty.equals("increment")) {
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
                System.out.println(name + " " + i + " " + counter.c);
            }
        } else {
            for (int i = 0; i < 1000000; i++) {
                counter.decrement();
                System.out.println(name + " " + i + " " + counter.c);
            }
        }
    }
}
