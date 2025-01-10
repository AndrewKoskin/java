package Module8.Singleton.Homework.Lesson;

import java.util.concurrent.*;

public class Director {
    private static volatile Director volatileDirector;
    private static Director cachedDirector;
    private static String sign;

    private Director(String sign) {
        Director.sign = sign;
    }

    private static String sign() {
        return sign;
    }

    public static Director getDirector(String sign) throws InterruptedException {
        Thread.sleep(10);
        if (cachedDirector == null) {
            synchronized (Director.class) {
                if (volatileDirector == null) {
                    System.out.println("Director not created, but I did it now: " + Thread.currentThread().getName());
                    volatileDirector = new Director(sign);
                    cachedDirector = volatileDirector;
                }
            }
        }
        System.out.println("Running Director: " + Thread.currentThread().getName() + " With sign " + sign());
        return cachedDirector;
    }

    public static void main(String[] args) {

        try (ExecutorService pool = Executors.newFixedThreadPool(100);) {
            for (int i = 1; i < 101; i++) {
                pool.submit(new RunDirectors(Integer.toString(i)));
            }
        }

    }
}

class RunDirectors implements Runnable {
    private String sign;

    RunDirectors(String sign) {
        this.sign = sign;
    }

    @Override
    public void run() {
        try {
            Director.getDirector(sign);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
