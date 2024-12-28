package Module6.Threads.Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator extends Thread{
    List<Integer> list;
    Random random = new Random();

    public Generator(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        while (list.size() < 100){
            this.list.add(this.random.nextInt(10));
            System.out.println(this.getName() + " has list: " + list);

            // Тут просто поток простаивает 200 мс
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args){
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Thread thread = new Generator(new ArrayList<>());
            threads.add(thread);
            thread.start();
        }

        // Если передать один объект, то с ним будет работать только один поток, в остальных выскачет ошибка
        List<Thread> threads1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Thread thread = new Generator(list);
            threads1.add(thread);
            thread.start();
        }

        // Если не заставить текущий поток main ждать завершения всех остальных потоков, то "Done" будет напечатано первее всех
        for (Thread t:threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Done");
    }
}
