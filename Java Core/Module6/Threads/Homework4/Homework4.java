package Module6.Threads.Homework4;

import java.util.ArrayList;

public class Homework4 extends Thread{
    String name;
    public Homework4(){
        this.name = this.getName();
    }
    @Override
    public void run() {
        super.run();
        System.out.println(this.name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.name);
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> ts = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Thread t = new Homework4();
            ts.add(t);
            t.start();

            // Заставляем поток main ждать полного выполнения потока t перед новым циклом
            // Таким образом потоки отрабатывают по очереди
            t.join();
        }

    }
}
