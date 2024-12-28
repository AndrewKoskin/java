package Module6.Threads.Homework1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Homework1 extends Thread {
    String name;

    Homework1(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
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
        Thread thread0 = new Homework1("thread0");
        Thread thread1 = new Homework1("thread1");
        Thread thread2 = new Homework1("thread2");
        Thread thread3 = new Homework1("thread3");
        Thread thread4 = new Homework1("thread4");
        Thread thread5 = new Homework1("thread5");
        Thread thread6 = new Homework1("thread6");
        Thread thread7 = new Homework1("thread7");
        Thread thread8 = new Homework1("thread8");
        Thread thread9 = new Homework1("thread9");
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
    }
}
