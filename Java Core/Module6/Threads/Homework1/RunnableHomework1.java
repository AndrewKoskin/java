package Module6.Threads.Homework1;

import java.util.Arrays;
import java.util.Random;

public class RunnableHomework1 implements Runnable {
    String name;

    public RunnableHomework1() {
        this.name = Thread.currentThread().getName();
    }

    @Override
    public void run() {
        System.out.println(this.name);
        Random random = new Random();
        Integer[] ints = new Integer[10];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt();
        }
        System.out.println("Ints for name " + this.name + ": " + Arrays.toString(ints));
        for (int i = 0; i < 10; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        System.out.println("Max for name " + this.name + ": " + max);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread th = new Thread(new RunnableHomework1());
            th.start();
        }
    }
}
